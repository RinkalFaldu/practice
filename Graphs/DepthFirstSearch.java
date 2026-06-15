package Graphs;

import java.util.ArrayList;
import java.util.Queue;
import java.util.*;

public class DepthFirstSearch {
     static class Edge {
        int src;
        int dest;
        int weight;
        public Edge (int s, int d, int w){
            this.src = s;
            this.dest =d;
            this.weight = w;
        }
    }
    static void CreateGraph (ArrayList<Edge> graph[]){
        for (int i =0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));  // verted 0
        graph[0].add(new Edge(0, 2, 1));  // verted 0

        graph[1].add(new Edge (1, 0, 1)); // vertex 1
        graph[1].add(new Edge (1, 3, 1)); // vertex 1
        
        graph[2]. add(new Edge(2, 0, 1));
        graph[2]. add(new Edge(2, 4, 1));
        
        graph[3].add(new Edge(3,1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));
        graph[6].add(new Edge(6, 5, 1));

    }

    // steps of bfs 
    // 1. create queue
    // 2. breate boolean array of graph length
    // 3. add first element in queue
    // remove first element and add it's two neighbor in queue and mark remove element visited (true)
    // 
    public static void dfs (ArrayList<Edge>[] graph, int curr, boolean vis []){ //O(v +E) 

        System.out.print(curr + " ");
        vis [curr] = true;

        for (int i =0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]){
                dfs(graph, e.dest, vis);
            }
        }
        
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
        int V =7;
        ArrayList <Edge> [] graph = new ArrayList[V];  // Array of Arraylist
        CreateGraph(graph);
        dfs(graph, 0, new boolean[V]);
        
        
    }
    
}
