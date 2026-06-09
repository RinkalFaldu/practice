package LinkedList;
import java.util.*;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node (int data) {
            this.data = data;  // assign data to first node
            this.next = null;  // next node is null
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    // time complexity is O(1) for addFirst
    public void addFirst (int data){
        // step 1 = create new node
        Node newNode = new Node (data);
        size++;

        if (head == null){   // if linkedlist is empty
            head = tail = newNode;
            return;
        }

        // step2 - newNode next = head
        newNode.next = head; // link

        // step3 - head = newNode
        head = newNode;
    }
    // time complexity is O(1)
    public void addLast (int data){
        Node newNode = new Node(data);
        size++;
        if (head == null){
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // time complexity is O(n)
    public void print(){
        if (head == null){
            System.out.println("Linked List is empty");
            return;
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void addMiddle (int idx, int data){
        if (idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node (data);
        size++;
        Node temp = head;
        int i =0;
        while (i < idx-1){
            temp = temp.next;
            i++;
        }
        // i = idx -1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public int removeFirst(){
        if (size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } 
        else if ( size == 1){
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if (size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if (size == 1){
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }
        Node temp = head;
        for (int i =0; i<size-2; i++){
            temp = temp.next;

        }
        int val = temp.next.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }
    public void deletNthFromEnd (int n){
        // calculate size
        int size =0;
        Node temp = head;
        while (temp != null){
            temp = temp.next;
            size++;
        }
        if (n == size){   // n from last == size
            head = head.next;       // remove first
            return;
        }
        int i =1;
        int iToFind = size -n;   // find next node of node that i want to delet from last
        Node prev = head;
        while (i < iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    // time complexity O(n)
    public int itrSearch (int key){
        Node temp = head;
        int i =0;
        while (temp != null){
            if (temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    // helper function to search recSearch
    public int helper (Node head, int key){ // time and space complexity is O(n)
        if (head == null){
            return -1;
        }
        if (head.data == key){      // whenever key found it return 0
            return 0;
        }
       int idx = helper(head.next, key);      
       if (idx == -1){
            return -1;
       }
       return idx +1;       // this add to previously return 0 untill first node

    }
    public int recSearch (int key){
        return helper (head, key);

    }

    public void reverse (){        // time complexity O(n)
        // e.g. 1    2    3        // prev = null means node before 1    curr = 1    next = 3
        Node prev = null;          // 
        Node curr = tail = head;   // head now become tail and curr
        Node nextTemp;                

        while (curr != null){
           nextTemp = curr.next;   // store next
           curr.next = prev;       // reverse pointer middle node 
           prev = curr;            // move prev forward 
           curr = nextTemp;        // move current forward
        }
        head = prev;
    }
    
    public Node findMid (Node head){
        Node slow = head;
        Node fast =head;
        while (fast != null && fast.next !=null){ // this is for odd and even numver of nodes
            slow = slow.next;     // it jums 1 step ahead
            fast = fast.next.next; // it jums 2 step ahead
        }
        return slow; // slow is my midNode
    }

    public boolean checkPalindrome(){
        if (head == null || head.next == null){
            return true;
        }
        // step 1 - find mid
        Node midNode = findMid(head);

        // step 2 - reverse second half
        Node prev = null;
        Node curr = midNode;
        Node next;
        
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        Node right = prev;   // right half head
        Node left = head;
        // step 3 - check left half & right half is equal

        while (right != null){
            if (left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public boolean isCycle (){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next!= null ){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                return true;   // cycle exist
            }
        }
        return false;
    }
    public static void main (String args[]){
        LinkedList list = new LinkedList();
     //   list.head = new Node(1);
      //  list.head.next = new Node (2);
      
    //   list.addFirst(2);
      
    //   list.addFirst(1);
    
    //   list.addLast(3);
      
    //   list.addLast(4);
    //   list.addMiddle(2, 9);
    //   list.print();
    //   System.out.println(list.size);
    //   list.removeFirst();
    //   list.removeLast();
    //   list.print();
    //   System.out.println(list.size);
    //   System.out.println(list.itrSearch(3));
    //   System.out.println(list.itrSearch(10));
    //   System.out.println(list.recSearch(3));
    //   System.out.println(list.recSearch(10));
    //   list.reverse();
    //   list.print();
    //   list.deletNthFromEnd(2);
    //   list.print();

    // list.addLast(1);
    // list.addLast(2);
    // list.addLast(2);
    // list.addLast(1);
    // list.print();
    // System.out.println(list.checkPalindrome());

    // to check linked list has cycle or not
    head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node (3);
    head.next.next.next =  head;
    System.out.println(list.isCycle());

    }
    
}
