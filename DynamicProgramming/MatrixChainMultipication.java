package DynamicProgramming;
import java.util.*;
//           A  B  C  D  E
// arr [] = {1, 2, 3, 4, 3}
// find min cost
// A  = 1 * 2  (row * col)
// B =  2 * 3   (row * col)
// c =  3 * 4
// D =  4 *3
// AB = cost = 1 *2 *3 And result 1 *3
// different way to multiply AB * C or AB *CD  or AB * C *B  

// different order of multipication gives different order
// i = starting point 
// j = ending point
// k = start to end
// Ai = arr[i-1] * arr[i]  here * means size not multipication
public class MatrixChainMultipication {
    public static int mcmRec (int arr[], int start, int end){
        if (start == end){
            return 0; // single matrix multipication
        }
        int ans = Integer.MAX_VALUE;
        for (int  mid= start; mid<= end-1; mid++){
            int cost1 = mcmRec(arr, start, mid); //  result here arr[start -1] * arr[mid]
            int cost2 = mcmRec(arr, mid+1, end); // result here arr[mid] * arr[end]
            int cost3 = arr[start -1] * arr[mid] * arr[end];
            int finalcost = cost1 + cost2 + cost3;
            ans = Math.min(ans, finalcost);
        }
        return ans;
    }
    public static int mcmMemo (int arr[], int start, int end, int dp[][]){
        if (start == end){
            return 0;
        }
        if (dp[start][end] != -1){
            return dp[start][end];
        }
        int ans = Integer.MAX_VALUE;
        for (int mid = start; mid <=end-1; mid++){
            int cost1 = mcmMemo(arr, start, mid, dp);
            int cost2 = mcmMemo(arr, mid +1, end, dp);
            int cost3 = arr[start -1] * arr[mid] * arr[end];
            int finalCost = cost1 + cost2 + cost3;
            ans= Math.min (ans, finalCost);
        }
        return dp[start][end] = ans;
    }
    public static int mcmTab (int arr[]){
        int n = arr.length;
        int dp[][] = new int [n][n];
        for (int i =0 ; i<n; i++){
            dp[i][i] =0;
        }
        // bottom up
        for (int len =2; len <=n-1; len++){
            for (int i =1; i<=n-len; i++){
                int j = i+len-1;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k =i; k<=j-1; k++){
                    int cost1 = dp[i][k];
                    int cost2 = dp[k+1][j];
                    int cost3 = arr[i-1] * arr[k] * arr[j];
                    dp[i][j] = Math.min (dp[i][j], cost1 + cost2 +cost3);
                }
            }
        }
        return dp[1][n-1];

    }
    public static void main(String[] args) {
        int arr [] = {1, 2, 3, 4, 3}; // ans 30 
        int n = arr.length;
        System.out.println(mcmRec(arr, 1, n-1));
        int dp [][] = new int [n][n];
        for (int i =0; i<n; i++){
            Arrays.fill(dp[i], -1);
        }
        System.out.println(mcmMemo(arr, 1, n-1, dp));
        System.out.println(mcmTab(arr));

        // A* B (1 *3) * c (3*4)          cost here 1 *2 *3 =6
        //         (1 *4)   * D(4*3)      cost here  1*3*4 =12
        //              (1 *3)            cost here 1 *4*3 =12 
        //  order of multipication is  (((AB)C)D)  total    30
        
    }
}
