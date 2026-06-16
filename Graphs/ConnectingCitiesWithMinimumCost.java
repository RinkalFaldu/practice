package Graphs;
import java.util.*;

// find the minimum cost for connecting all cities on the map
// cities [][] = { {0, 1, 2, 3, 4},       for particular ij = i is src and j is destination
//                 {1, 0, 5, 0, 7}        means path form i to j
//                 {2, 5, 0, 6, 0}        for cell 01 means path from 0 to 1
//                 {3, 0, 6, 0, 0}
//                 {4, 7, 0, 0, 0} }
// minimum cost use prims
// for shortest path - dijkstra or bell man ford based on negative or positve weight 

public class ConnectingCitiesWithMinimumCost {
    static class Edge implements Comparable<Edge> {
        int dest;
        int cost;

        public Edge (int d, int c){
            this.cost =c;
            this.dest =d;
        }

        @Override
        public int compareTo (Edge e2){
            return this.cost -e2.cost;
        }
    }

    public static int connectCities(int cities [][]){
        PriorityQueue <Edge> pq = new PriorityQueue<>();
        boolean vis [] = new boolean[cities.length];

        pq.add(new Edge(0, 0));
        int finalCost =0;

        while (!pq.isEmpty()){
            Edge curr = pq.remove();
            if (!vis[curr.dest]){
                vis[curr.dest] = true;
                finalCost += curr.cost;

                for (int i =0; i<cities[curr.dest].length; i++){
                    if (cities[curr.dest][i]  !=0){
                        pq.add(new Edge (i, cities[curr.dest][i]));

                    }
                }
            }
        }
        return finalCost;
    }
    public static void main(String[] args) {
        
    
   int cities [][] ={ {0, 1, 2, 3, 4},
                      {1, 0, 5, 0, 7},        
                      {2, 5, 0, 6, 0},        
                      {3, 0, 6, 0, 0},
                      {4, 7, 0, 0, 0} };

                      System.out.println(connectCities(cities));
    }
    
}
