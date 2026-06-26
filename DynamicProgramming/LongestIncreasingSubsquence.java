package DynamicProgramming;
import java.util.*;
// steps 1 = hshset
// copy all element of hashset in arr2

import java.util.HashSet;

public class LongestIncreasingSubsquence {
    public static int lcs (int arr1[], int arr2[]){
        int n = arr1.length;
        int m = arr2.length;
        int dp[][] = new int [n+1][m+1];

        for (int i =0; i< n+1; i++){
            dp[i][0] =0;
        }
        for (int j =0; j< m+1; j++){
            dp[0][j] =0;
        }
        for (int i =1; i< n+1; i++){
            for (int j = 1; j< m+1; j++){
                if (arr1[i-1] == arr2[j-1]){
                    dp[i][j] = dp[i-1][j-1] +1;
                } else {
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        return dp[n][m];
    }
    public static int lisTab (int arr1[]){
        HashSet<Integer> set = new HashSet<>();
        for (int i=0; i<arr1.length; i++){   // added all element of arr in hashset to get all unique elements
            set.add(arr1[i]);
        }
        int arr2[] = new int [set.size()];
        int i=0;
        for (int num : set){          // here now element from set added in arr2
            arr2[i] = num;
            i++;
        }
        Arrays.sort(arr2);
       return  lcs(arr1, arr2);
    }

    public static int lisMemo(int arr[]) {
        int n = arr.length;
        Integer[][] memo = new Integer[n][n + 1];
        return lisMemoHelper(arr, 0, -1, memo);
    }

    private static int lisMemoHelper(int[] arr, int idx, int prevIndex, Integer[][] memo) {
        if (idx == arr.length) {
            return 0;
        }

        int memoIndex = prevIndex + 1;
        if (memo[idx][memoIndex] != null) {
            return memo[idx][memoIndex];
        }

        int taken = 0;
        if (prevIndex == -1 || arr[idx] > arr[prevIndex]) {
            taken = 1 + lisMemoHelper(arr, idx + 1, idx, memo);
        }
        int notTaken = lisMemoHelper(arr, idx + 1, prevIndex, memo);

        memo[idx][memoIndex] = Math.max(taken, notTaken);
        return memo[idx][memoIndex];
    }

    public static void main(String[] args) {
        int arr1[] = {50, 3, 10, 7, 40, 80};  // ans is 4 because of 3, 10, 40, 80 or 3, 7, 40, 80
        System.out.println("Tabulation-style LIS: " + lisTab(arr1));
        System.out.println("Memoization LIS: " + lisMemo(arr1));

    }
    
}
