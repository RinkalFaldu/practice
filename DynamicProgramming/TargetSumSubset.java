package DynamicProgramming;
import java.util.*;
// for n number of array can have 2^n subset 
// variatio of 0-1 knapsack
// in this probelm we have to check that in given array is there any subset whose sum is target
// if sub exist with target return true else return false
// ans = using n items => subset sum = > target
// dp [i, j] => using i ithem => subset sum => target => true/ false
public class TargetSumSubset {
    private static boolean subsetSumRec(int[] numbers, int target, int index) {
        if (target == 0) {
            return true;
        }
        if (index == numbers.length || target < 0) {
            return false;
        }
        // include current element
        if (subsetSumRec(numbers, target - numbers[index], index + 1)) {
            return true;
        }
        // exclude current element
        return subsetSumRec(numbers, target, index + 1);
    }

    private static boolean subsetSumMemo(int[] numbers, int target, int index, Boolean[][] memo) {
        if (target == 0) {
            return true;
        }
        if (index == numbers.length || target < 0) {
            return false;
        }
        if (memo[index][target] != null) {
            return memo[index][target];
        }

        boolean include = subsetSumMemo(numbers, target - numbers[index], index + 1, memo);
        boolean exclude = subsetSumMemo(numbers, target, index + 1, memo);
        memo[index][target] = include || exclude;
        return memo[index][target];
    }

    public static boolean hasSubsetSumMemo(int[] numbers, int target) {
        Boolean[][] memo = new Boolean[numbers.length][target + 1];
        return subsetSumMemo(numbers, target, 0, memo);
    }

    public static boolean targetSumSubsetTeb (int numbers[], int target){
        int n = numbers.length;
        boolean dp[][] = new boolean[n+1][target+1];
        // i = item & j = target sum
        for (int i =0; i< n+1; i++){
            dp[i][0] = true;
        }
        for (int i =1; i< n+1; i++){
            for (int j =1; j< target+1; j++){
                int v = numbers[i-1];

                // include
                if (v <= j && dp[i-1][j -v] == true){
                    dp[i][j] = true;
                }
                // exclude
                else if (dp[i-1][j] == true){
                    dp[i][j] = true;
                }
            }
        }
        return dp[n][target];

    }

    public static void main(String[] args) {
        int numbers [] = {4, 2, 7, 1, 3};
        int target = 10;
        System.out.println(subsetSumRec(numbers, target, 0));
        System.out.println(hasSubsetSumMemo(numbers, target));
        System.out.println(targetSumSubsetTeb(numbers, target));
    }
}
