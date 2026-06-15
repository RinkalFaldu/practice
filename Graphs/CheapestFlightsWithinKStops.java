package Graphs;
// There are n cities connected by some bumber of flights. you are given an array flights where flights[i] = [from, to price]
// indicates that there is flight. you are also given three integers src, dst, and k, return the cheapest price from src to dst with at most k stops.
// if there is no such route return -1;

import java.util.ArrayList;

public class CheapestFlightsWithinKStops {
    static class Edge {
        int src;
        int dest;
        int weight;
        
        public Edge (int s, int d, int w){
            this.src = s;
            this.dest =d;
            this.weight =w;
            
        }
    }
    static void CreateGraph (ArrayList<Edge> graph[]){
        for (int i =0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 10));  // verted 0
        graph[0].add(new Edge(0, 2, 15));  // verted 0
        graph[0].add(new Edge(0, 3, 30));  // verted 0

        graph[1].add(new Edge (1, 0, 10)); // vertex 1
        graph[1].add(new Edge (1, 3, 40)); // vertex 1
        
        graph[2]. add(new Edge(2, 0, 15));
        graph[2]. add(new Edge(2, 3, 50));
        
        graph[3].add(new Edge(3,1, 40));
        graph[3].add(new Edge(3,2, 50));

    }

    public static void main(String[] args) {
        int V =6;
        ArrayList <Edge> [] graph = new ArrayList[V];  // Array of Arraylist
        CreateGraph(graph);

        
    }
}
