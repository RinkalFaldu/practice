package Graphs;

import java.util.ArrayList;

public class BellmanFordAlgoWithEdges {
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
    static void CreateGraph (ArrayList<Edge> graph){
        
        graph.add(new Edge(0, 1, 2));  // verted 0
        graph.add(new Edge(0, 2, 4));  // verted 0

        graph.add(new Edge (1, 2, -4)); // vertex 1
        
        graph. add(new Edge(2, 3, 2));
        
        graph.add(new Edge(3,4, 4));

        graph.add(new Edge(4,1, -1));
                
    }
    public static void  bellmanFord(ArrayList<Edge> graph, int src, int V){
        // created dist array and fill with max value
        int [] dist = new int [V];
        for (int i=0; i<dist.length; i++){
            if (i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        // algo  time complexity O( E * V)
        for (int i=0; i<V-1; i++){
            // edges
            for (int j = 0; j<graph.size(); j++){          // this two loop O(E)
                    Edge e = graph.get(j);

                    int u = e.src;
                    int v = e.dest;
                    int wt = e.weight;
                       // dist[u] != Integer.MAX_VALUE  used this condition because in java if any value added in max value it makes value negative
                    if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]){
                        dist[v] = dist[u] + wt;
                    }
                
            }
        }
        // print
        for (int i =0; i<dist.length; i++){
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int V =5;
        //ArrayList <Edge> [] graph = new ArrayList[V];  // Array of Arraylist
       ArrayList <Edge> graph = new ArrayList<>();
        CreateGraph(graph);
        int src = 0;
        bellmanFord(graph,0, V);
        
    }

    
}
