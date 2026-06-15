package Graphs;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkstraAlgoWithPath {
    

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
        int parent[] = new int [graph.length];
        for (int i = 0; i< graph.length; i++){
            if (i != src){
                dist[i] = Integer.MAX_VALUE; // +infinity
            } else {
                dist[i] = 0;
            }
            parent[i] = -1;
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

                    if (dist[a] != Integer.MAX_VALUE && dist[a] + wt < dist[z]){
                        dist[z] = dist[a] + wt;
                        parent[z] = a;
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

        // print full path for each vertex from src
        for (int i = 0; i < graph.length; i++){
            System.out.print(src + " -> " + i + " = ");
            if (dist[i] == Integer.MAX_VALUE){
                System.out.println("no path");
            } else {
                printPath(parent, i);
                System.out.println(" (cost=" + dist[i] + ")");
            }
        }
    }

    public static void printPath(int[] parent, int v){
        if (v == -1) {
            return;
        }
        if (parent[v] != -1){
            printPath(parent, parent[v]);
            System.out.print(" -> ");
        }
        System.out.print(v);
    }
    public static void main(String[] args) {
        int V =6;
        ArrayList <Edge> [] graph = new ArrayList[V];  // Array of Arraylist
        CreateGraph(graph);
        int src = 0;
        dijkstra(graph, 0);


        
    }
    
}

    

