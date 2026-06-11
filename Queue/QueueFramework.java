package Queue;
import java.util.LinkedList;
import java.util.Queue;

// we use LinkedList interface or ArrayDeque interface

public class QueueFramework {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();   // LinkedList
            // Queue<Integer> q = new ArrayDeque<>();   ArrayDeque

        q.add(1);
        q.add(2);
        q.add(3);
       // System.out.print(q);
        while (!q.isEmpty()){
             System.out.println(q.peek());
             q.remove();
         }
        
    }
    
}
