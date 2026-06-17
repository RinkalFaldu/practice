package DynamicProgramming;

public class CoinChange {
    public static int cointChange (int coins[], int sum){
        int n = coins.length;
        int dp[][] = new int[n+1][sum+1];
        // initialize - sum is 0
        // i -> coins; j -> sum/change
        for (int i =0; i<n+1; i++){  // means have i coins and i have to give 0 change means 1 way
            dp[i][0] =1;        // first column assign to 1
        }

        for (int j =1; j<sum+1; j++){  // means have 0 coins but need to give j change means 0 ways
            dp[0][j] = 0;     // first row assign 0
        }
        for (int i = 1; i< n+1; i++){
            for (int j =1; j< sum+1; j++){  // j means sum of particular cell that we assign in main method
                 if (coins[i-1] <= j){
                                  // total ways is include + exclude 
                    dp [i][j] = dp[i][j - coins[i-1]] + dp[i-1][j];
                 } else {
                   dp[i][j] = dp[i-1][j];
                 }


            }
        }
        return dp[n][sum];
    }
    public static void main(String[] args) {
        int coins [] = {1,2, 3};
        int sum =4;
        System.out.println(cointChange(coins, sum));
        
    }
    
}
