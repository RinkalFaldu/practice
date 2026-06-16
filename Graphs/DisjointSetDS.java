package Graphs;
// this data structure also know as union find or disjoint set data structure
// Find : find (2) this means which set 2 has
// Union : means joining elements of both set in one set
// this algo also to detect cycle in undirected graph
// and in kruskal's algo
// find steps 
// 1. if element is parent of it self return x
// 2. if element is not parent of it self call find cunction recursively untill it find super parent means parent is parent of it self
// union steps
// for union i need parent of A and parent B for that call find function for A and B
// if rank A and rank B is equall we can make any one parent Parent [parent A] = parent B and rank ++;
// Parent A (rank) < Parent B (rank) // B become parent // heigher rank element become parent
// Parent A (rank) > Parent B (rank) // A become parent // means element B join element A tree (or element) at root
// this data structure in last form tree

// time complexity O(1) of find and union function
public class DisjointSetDS {
    static int n =7;
    static int par [] = new int [n];
    static int rank [] = new int [n];

    public static void init (){
        for (int i =0; i<n; i++){
            par[i] =i;
        }
    }

    public static int find (int x){
        if (x == par[x]){   // when we have element parent of it self it is suprim parent
            return x;
        }
        return par[x] = find (par[x]);     // untill we don't find suprim parent we call this function again
    }

    public static void union (int a, int b){
        int parA = find (a);
        int parB = find(b);

        if (rank[parA] == rank[parB]){
            par[parB] = parA;     // if we have both element with same rank any one can become parent 
            rank[parA]++;  
        }
        else if (rank[parA] < rank[parB]){
            par[parA] = parB;
        }
        else {
            par[parB] = parA;
        }
    }
    public static void main(String[] args) {
        init ();
        union(1, 3);
        System.out.println(find(3));
        union(2 , 4);
        union(3, 6);
        union(1, 4);
        System.out.println(find(3));
        System.out.println(find(4));
        union(1, 5);

        
    }
    
}
