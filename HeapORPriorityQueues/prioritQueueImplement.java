package HeapORPriorityQueues;
import java.util.PriorityQueue;

// this  line implements Comparable<Student> use to compare oject 
// //  @Override
//         public int compareTo (Student s2){
//             return this.rank - s2.rank;
//         
// this code is use to defin in what bases student should compare in basis of student name or rank
// in this method overriding it's we define that student compare based on rank 
public class prioritQueueImplement {
    static class Student implements Comparable<Student>{
        String name;
        int rank;

        public Student (String name, int rank){
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo (Student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
       // PriorityQueue<Integer> pq = new PriorityQueue<>();  // default it gives prioriy lowest element 1 2 3 4 5
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // use to reverse 5 4 3 2 1
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("A", 4));
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 2));
        pq.add(new Student("D", 12));
        pq.add(new Student("E", 1));
        
        while (!pq.isEmpty()){
            System.out.print(pq.peek().name + " ->" + pq.peek().rank); // O(1)
            pq.remove(); // O(logn)
        }
        
    }
    
}
