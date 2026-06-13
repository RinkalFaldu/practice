package HeapORPriorityQueues;
// we are given N points in a 2D plane which are location of N cars. 
// if we are at the origin, print the nearest K cars.
// distance =  sqrt (x^2 + y^2)

import java.util.PriorityQueue;

// different foam of this question = nearest k point from the origin
public class NearbyCars {
    static class Point implements Comparable<Point> {
        int x;
        int y;
        int distsq;
        int idx;

        public Point (int x, int y, int distsq, int idx){
            this.x = x;
            this.y =y;
            this.distsq = distsq;
            this.idx = idx;
        }
        @Override
        public int compareTo (Point p2){
            return this.distsq - p2.distsq ;// accending order

        }
    }
    public static void main(String[] args) {
        int pts [][] = {{3, 3}, {5, -1}, {-2, 4}};
        int k =2;

        PriorityQueue<Point> pq = new PriorityQueue<>();
        for (int i =0; i<pts.length; i++){
            int distsq = pts [i][0] * pts[i][0] + pts[i][1] * pts[i][1];
            pq.add(new Point(pts[i][0], pts[i][1], distsq, i));
        }

        // nearest k cars
        for (int i=0; i<k; i++){
            System.out.println("C" + pq.remove().idx);
        }
        
    }
    
}
