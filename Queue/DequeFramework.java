package Queue;
import java.util.*;

public class DequeFramework {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();  // created double ended queue and it's called Deque not Dequeue
        deque.addFirst(1); //1
        deque.addFirst(2); // 2 1
        System.out.println(deque);
        deque.addLast(3);
        deque.addLast(4);
        System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
        deque.addFirst(5); 
        deque.addFirst(6); 
        System.out.println(deque);

        System.out.println("First element = " + deque.getFirst());
        System.out.println("First element = " + deque.getLast());

        
    }
    
}
