// sum = a(r^n -1)/ (r-1) 
// a = first term , r = common ratio 
// total nodes = 2^0 + 2^1 + 2^2 + ----
//  1 (2^x+1 -1)/(1)
// levels (n) = log2n
// nodes = 2n-1
// in code nodes = 4n
// in each node store answer of range query
// segment tree is full binary tree
// time complexity for construct O(n)
// query = O(logn)
// update = O(logn)

// Query on ST
// Sum of numbers in a range from i to j
package SegmentTree;

public class CountAndMeaningofNodes {
    static int tree[];
    public static void init(int n){
        tree = new int [4*n];
    }
    public static int buildST(int arr[], int i, int start, int end){
       if (start == end){
        tree[i] = arr[start];
        return arr[start];
       } 
       int mid = (start + end)/2;
       buildST(arr, 2*i+1, start, mid); // left subtree
       buildST(arr, 2*i+2, mid+1, end);
       tree[i] = tree[2*i+1] + tree[2*i+2];
       return tree[i];
    }
    public static int getSumUtil (int i, int si, int sj ,int qi, int qj){
        if (qj <= si || qi >= sj){ // case 1 non overlapping
            return 0;
        }
        else if (si >= qi && sj <= qj){ // complete overlap
            return tree[i];
        }
        else {
            // partial overlap
            int mid = (si + sj)/2;
            int left = getSumUtil (2*i+1, si, mid, qi, qj);
            int right = getSumUtil(2*i+2, mid+1, sj, qi, qj);
            return left+right;
        }
    }
    public static int getSum (int arr[], int qi, int qj){
        int n = arr.length;
       return getSumUtil(0, 0, n-1, qi, qj);

    }
    public static void main (String args[]){
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;
        init(n);
        buildST(arr, 0, 0, n-1);
        for (int i =0; i<tree.length; i++){
            System.out.print(tree[i] + " ");   
        }
        System.out.println();
      System.out.println( getSum(arr, 2, 5));
    }
}