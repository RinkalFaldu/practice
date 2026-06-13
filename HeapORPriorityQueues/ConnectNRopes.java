package HeapORPriorityQueues;
import java.util.*;
// Given are N ropes of different lengths, the task is to connect these ropes into one rope with
// minimum cost, such that the cost to connext two ropes is equal to the sum of their lengths.

// in this problem we added all elemnt of ropes array in pq
// than we add first two element of pq in cost and added cost in pq again untill pq length is 1

public class ConnectNRopes {
    public static void main(String[] args) {
        int [] ropes = {4,3, 2, 6};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i =0; i<ropes.length; i++){
            pq.add(ropes[i]);    // 2, 3, 4, 6
        }
        int cost =0;
        while (pq.size() > 1){
            int min = pq.remove();     // in first iteration two comes out
            int min2 = pq.remove();    // 3 comes out
            cost+= min + min2;        // 2+ 3
            pq.add(min + min2);       // 5 added in pq
        }
        System.out.println("Cost of connecting n ropes =" + cost);
    }
}
