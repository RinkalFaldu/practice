package LinkedList;
import java.util.*;

// I used doubly linked list and hashmap O(1) look up and O(1)  insertion deletion

public class LRU {
    // Node structure for the Doubly Linked List
    private static class Node {
        int key;
        int value;
        Node prev;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int capacity;
    private final Map<Integer, Node> map;
    private final Node head;
    private final Node tail;

    // Initialize the cache with a specific capacity
    public LRU(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        
        // Initialize dummy head and tail nodes to avoid null pointer checks
        this.head = new Node(-1, -1);
        this.tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
    }

    // Get the value of the key if it exists, otherwise return -1
    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        
        Node node = map.get(key);
        // Move the accessed node to the front (Most Recently Used position)
        moveToHead(node);
        return node.value;
    }

    // Insert or update the key-value pair
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value; // Update the value
            moveToHead(node);   // Mark as most recently used
        } else {
            // If capacity is reached, evict the least recently used element
            if (map.size() == capacity) {
                Node lruNode = tail.prev; // Node right before dummy tail
                removeNode(lruNode);
                map.remove(lruNode.key);  // Remove from fast lookup map
            }
            
            // Insert the brand new node
            Node newNode = new Node(key, value);
            addNodeToHead(newNode);
            map.put(key, newNode);
        }
    }

    // --- Internal Helper Methods for Doubly Linked List Manipulation ---

    // Adds a node right after the dummy head node
    private void addNodeToHead(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    // Detaches an existing node from its current position in the list
    private void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    // Moves an existing node to the most recently used position (front)
    private void moveToHead(Node node) {
        removeNode(node);
        addNodeToHead(node);
    }

    // Main method to test the execution
    public static void main(String[] args) {
        LRU cache = new LRU(2);

        cache.put(1, 1);           // Cache is {1=1}
        cache.put(2, 2);           // Cache is {1=1, 2=2}
        System.out.println("Get 1: " + cache.get(1)); // Returns 1, moves key 1 to front

        cache.put(3, 3);           // Evicts key 2, Cache is {1=1, 3=3}
        System.out.println("Get 2: " + cache.get(2)); // Returns -1 (evicted)

        cache.put(4, 4);           // Evicts key 1, Cache is {3=3, 4=4}
        System.out.println("Get 1: " + cache.get(1)); // Returns -1 (evicted)
        System.out.println("Get 3: " + cache.get(3)); // Returns 3
        System.out.println("Get 4: " + cache.get(4)); // Returns 4
    }
    
}
