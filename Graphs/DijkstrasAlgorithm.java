package Graphs;
// this algo is not nessecarily gives correct answer when we have negative weight given for negative weight we use bellman ford algorithm
// it is greedy algo
// shortest paths from the source to all vertices (weighted graph)
// dist[u] + wt[u,v] < dist[v]
// dist[v] = dist[u] + wt[u,v]

// src 0 -> 1 u - > 2 v
// intial dist

// steps
// 1. create dist array of graph length first assign Integer.MAX_Value in it
// 2. create boolean vis [] array 
// 3. create priority queue that store src and distance
// 4. add first src and path in queue
// 


import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkstrasAlgorithm {
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
        graph[0].add(new Edge(0, 1, 2));  // verted 0
        graph[0].add(new Edge(0, 2, 4));  // verted 0

        graph[1].add(new Edge (1, 3, 7)); // vertex 1
        graph[1].add(new Edge (1, 2, 1)); // vertex 1
        
        graph[2]. add(new Edge(2, 4, 3));
        
        graph[3].add(new Edge(3,5, 1));

        graph[4].add(new Edge(4,3, 2));
        graph[4].add(new Edge(4,5, 5));
        
    }
    static class Pair implements Comparable<Pair> {
        int n;
        int path;
        public Pair (int n, int path){
            this.path = path;
            this.n = n;
        }
        @Override
        public int compareTo (Pair p2){
            return this.path - p2.path;
        }
    }

    // with priority queue O(V +E log V)
    public static void dijkstra(ArrayList<Edge> graph[], int src){
        int dist[] = new int [graph.length];
        for (int i = 0; i< graph.length; i++){
            if (i != src){
                dist[i] = Integer.MAX_VALUE; // +infinity

            }
        }
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair> pq =  new PriorityQueue<>();
        pq.add(new Pair(src, 0));

        while (!pq.isEmpty()){
            Pair curr =pq.remove();
            if (!vis[curr.n]){
                vis[curr.n] = true;
                for (int i =0; i<graph[curr.n].size(); i++){
                    Edge e = graph[curr.n].get(i);
                    int a = e.src;
                    int z = e.dest;
                    int wt = e.weight;

                    if (dist[a] + wt < dist[z]){
                        dist[z] = dist[a] + wt;
                        pq.add(new Pair(z, dist[z]));
                    }
                }
            }
        }
        // print all source to destination vertices shortest dist
        for (int i =0; i<dist.length; i++){
            System.out.print(dist[i] + " ");
        } 
        System.out.println();

    }
    public static void main(String[] args) {
        int V =6;
        ArrayList <Edge> [] graph = new ArrayList[V];  // Array of Arraylist
        CreateGraph(graph);
        int src = 0;
        dijkstra(graph, 0);


        
    }
    
}
