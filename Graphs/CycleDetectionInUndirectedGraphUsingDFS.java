package Graphs;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class CycleDetectionInUndirectedGraphUsingDFS {
    static class Edge {
        int src;
        int dest;
        
        public Edge (int s, int d){
            this.src = s;
            this.dest =d;
            
        }
    }
    static void CreateGraph (ArrayList<Edge> graph[]){
        for (int i =0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));  // verted 0
        graph[0].add(new Edge(0, 2));  // verted 0
        graph[0].add(new Edge (0, 3)); // vertex 0

        graph[1].add(new Edge (1, 0)); // vertex 1
        graph[1].add(new Edge(1, 2));

        graph[2]. add(new Edge(2, 0));
        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));
       
    }
    
    public static boolean detectCycle (ArrayList<Edge> [] graph){
        boolean vis[] = new boolean[graph.length];
        for (int i =0; i<graph.length; i++){
            if (!vis[i]){
                if (detectCycleUtil(graph, vis, i, -1)){
                    return true;
                }   
            }
        }
        return false;
    }
    public static boolean detectCycleUtil(ArrayList<Edge> [] graph, boolean vis[], int curr, int par){
        vis[curr] = true;
        for (int i =0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            // case 3
            if (!vis[e.dest]){
                if (detectCycleUtil( graph, vis, e.dest, curr)){
                return true;
                }
            }
            // case 1
            else if (vis[e.dest] && e.dest != par){ // node visited but not parent (means nodes visited not through current node)
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        /*      (5)
              0------1
                / \
          (1)  /   \ (3)
              /     \
             2-------3
              |   (1)
           (2)|
              |
              4
         */
        int V =5;
        ArrayList <Edge> [] graph = new ArrayList[V];  // Array of Arraylist
        CreateGraph(graph);
        System.out.println(detectCycle(graph));
        
        
    }
    
}
