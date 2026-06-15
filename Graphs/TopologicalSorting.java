package Graphs;
import java.util.*;
//Directed Acyclic Graph (DAG) is directed graph with no cycles.
//Topological sorting is used only for DAG (not for not DAG) it is linear order of vertices such that every directed edege u -> v,
// the vertex u comes before v in order.
// DFS used for topological sorting

// Approach - modified DFS
// added stack in dfs for this sorting
// stack.add(curr)  // LIFO
// in this sorting dependencies comes first

public class TopologicalSorting {
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

        graph[2].add(new Edge(2, 3));  // verted 0
        graph[3].add(new Edge(3, 1));  // verted 0
        graph[4].add(new Edge (4, 0)); // vertex 0

        graph[4].add(new Edge (4, 1)); // vertex 1
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
       
    }
    public static void topSort (ArrayList<Edge> [] graph){
        boolean vis[] = new boolean [graph.length];
        Stack<Integer> s = new Stack<>();
        for (int i =0; i<graph.length; i++){
            if(!vis[i]){
                topSortUtil(graph, i, vis, s);
            }
        }
        while (!s.isEmpty()){
            System.out.print(s.pop() + " ");
        }

    }
    public static void topSortUtil( ArrayList<Edge> [] graph, int curr, boolean vis[], Stack<Integer>s ){
        vis[curr] = true;
        for (int i =0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]){
                topSortUtil(graph, e.dest, vis, s);
            }
        }
        s.push(curr);
    }
     

    public static void main(String[] args) {
        int V =6;
        ArrayList <Edge> [] graph = new ArrayList[V];  // Array of Arraylist
        CreateGraph(graph);
       // System.out.println(isCycle(graph));
       topSort(graph);
       
        
        
    }
    
}
