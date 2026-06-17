package DynamicProgramming;

public class UnboundedKnapsack {
    // O(n * W)
    public static int unboundedKnapsackTab (int val [], int wt[], int W){
        int n = val.length;
        int dp [][] = new int[n+1][W+1];

        for (int i =0; i<n+1; i++){
            dp[i][0] = 0;
        }
        for (int j =0; j<W+1; j++){
            dp[0][j] = 0;
        }
        for (int i =1; i <n+1; i++){
            for (int j =1; j<W+1; j++){
                if (wt[i-1] <= j){
                    dp[i][j] = Math.max(val[i-1] + dp[i][j-wt[i-1]], dp[i-1][j]);
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][W];
    }

    public static int unboundedKnapsackMemo(int val[], int wt[], int W) {
        int n = val.length;
        int dp[][] = new int[n+1][W+1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= W; j++) {
                dp[i][j] = -1;
            }
        }
        return unboundedKnapsackMemoRec(val, wt, W, n, dp);
    }

    private static int unboundedKnapsackMemoRec(int val[], int wt[], int W, int idx, int dp[][]) {
        if (W == 0 || idx == 0) {
            return 0;
        }
        if (dp[idx][W] != -1) {
            return dp[idx][W];
        }
        int include = 0;
        if (wt[idx-1] <= W) {
            include = val[idx-1] + unboundedKnapsackMemoRec(val, wt, W - wt[idx-1], idx, dp);
        }
        int exclude = unboundedKnapsackMemoRec(val, wt, W, idx-1, dp);
        dp[idx][W] = Math.max(include, exclude);
        return dp[idx][W];
    }

    public static int unboundedKnapsackRec(int val[], int wt[], int W, int idx) {
        if (W == 0 || idx == 0) {
            return 0;
        }
        int include = 0;
        if (wt[idx-1] <= W) {
            include = val[idx-1] + unboundedKnapsackRec(val, wt, W - wt[idx-1], idx);
        }
        int exclude = unboundedKnapsackRec(val, wt, W, idx-1);
        return Math.max(include, exclude);
    }

    public static void main(String[] args) {
        int val[] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int W = 7;
        System.out.println(unboundedKnapsackTab(val, wt, W));
        System.out.println(unboundedKnapsackMemo(val, wt, W));
        System.out.println(unboundedKnapsackRec(val, wt, W, val.length));
    }
}

