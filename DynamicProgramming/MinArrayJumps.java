package DynamicProgramming;
import java.util.*;

public class MinArrayJumps {
    // Recursive function to find minimum jumps from index i to end
    // Returns Integer.MAX_VALUE when it's not possible to reach the end from i.
    public static int minJumpsRec(int arr[], int i){
        int n = arr.length;
        if (i >= n - 1){
            return 0; // already at or past the last index
        }
        if (arr[i] == 0){
            return Integer.MAX_VALUE; // stuck, cannot move further
        }

        int minSteps = Integer.MAX_VALUE;
        int maxJump = arr[i];
        for (int jump = 1; jump <= maxJump && i + jump < n; jump++){
            int next = minJumpsRec(arr, i + jump);
            if (next != Integer.MAX_VALUE){
                minSteps = Math.min(minSteps, 1 + next);
            }
        }
        return minSteps;
    }

    public static int minJumpsTab (int arr[]){
        int n = arr.length;
        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        dp[n-1] =0;
        int ans = Integer.MAX_VALUE;
        for (int i = n-2; i>=0; i--){
            int steps = arr[i];
            for (int j = i+1; j <= i+steps && j <n; j++ ){
                if(dp[j] != -1){
                    ans = Math.min(ans, dp[j] +1);
                }
            }
            if (ans != Integer.MAX_VALUE)
                dp[i] = ans;
        }
       return dp[0];

    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 1, 4};
        System.out.println(minJumpsTab(arr));
        System.out.println(minJumpsRec(arr, 0));

    }
    
}
