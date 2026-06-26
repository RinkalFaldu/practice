package DynamicProgramming;
// find number of all possible BSTs with given n nodes.
// this same problem as catalan
public class CountingTrees {
    public static int countBSTTab(int n){
        int dp[] = new int [n+1];
        dp[0] =1;
        dp[1] =1;
        for (int i =2; i<n+1; i++){
            for (int j =0; j<i; j++){
                int left = dp[j];
                int right = dp[i-j-1];
                dp[i] += left* right;
            }
        }
        return dp[n];
    }
    // Top-down memoized version (Catalan numbers)
    public static int countBSTMemo(int n){
        if (n < 0) return 0;
        int[] memo = new int[n+1];
        for (int i = 0; i <= n; i++) memo[i] = -1;
        return countBSTMemoHelper(n, memo);
    }

    private static int countBSTMemoHelper(int n, int[] memo){
        if (n == 0 || n == 1) return 1;
        if (memo[n] != -1) return memo[n];
        int ans = 0;
        for (int root = 0; root < n; root++){
            int left = countBSTMemoHelper(root, memo);
            int right = countBSTMemoHelper(n - root - 1, memo);
            ans += left * right;
        }
        memo[n] = ans;
        return ans;
    }
    public static void main(String[] args) {
        int n =3;
        System.out.println(countBSTTab(n));
        
    }
    
}
