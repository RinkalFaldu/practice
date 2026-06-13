package HeapORPriorityQueues;
import java.util.*;

// heap = visulise as binary tree
// heap = implementate as array
// for index = i 
// left child = 2i +1
// right child = 2i + 2 
//  if child index given and want to find parent index (x -1)/2

// to delete element of heap
// swap 1st & last node
// remove last idx arr.remove(arr.size()-1)
// fix my heap 

public class HeapImplement {  
    // mean heap 
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();
        public void add(int data){  // O(logn)
            arr.add(data);
            int x = arr.size()-1; // x is child index
            int parent = (x-1)/2; // parent index

            while (arr.get(x) < arr.get(parent)){
                int temp = arr.get(x);
                arr.set(x, arr.get(parent));
                arr.set(parent, temp);
                x = parent;
                parent = (x -1)/2;

            }
        }
        public int peek(){
            return arr.get(0);
        }
        private void heapify (int i){  // O(log n)
            int left = 2 * i +1;
            int right = 2 *i +2;
            int minIdx =i;

            if (left < arr.size()  && arr.get(minIdx) > arr.get(left)){
                minIdx = left;
            }
             if (right < arr.size()  && arr.get(minIdx) > arr.get(right)){
                minIdx = right;
            }
            if (minIdx != i){
                // swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);
                heapify(minIdx);
            }

        }
        public boolean isEmpty (){
            return arr.size() ==0;
        }
        public int remove (){
            // step 1 - swap first & last
            int data = arr.get(0);
            int temp = arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            // step 2 - delete 
            arr.remove(arr.size()-1);
            //
            //step 3 - heapift
            heapify(0);
            return data;
        }
    }
    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while (!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();

        }
        
    }
    
}
