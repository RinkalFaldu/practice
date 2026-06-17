package DynamicProgramming;
// dynamic programming is used when we have to choose between different option i shout take this or other
// second option to find we need to use dynamic programming or not when we told us to find optimal solution means least, most, min, max, largest, smallest

// fraction knapsack = choose based on maximum ration of price and weight or weight
// zero one knapsack = choose based on maximum price

public class zeroOneKnapsack {
    // in knapsack function i used profit as parameter 
    // public static int knapsackRec2(int val[], int wt[], int W, int n, int profit) {
    // if (W == 0 || n == 0) {     
    //     return profit;
    // }
    // if (wt[n-1] <= W) {
    //     int include = knapsackRec2(val, wt, W - wt[n-1], n-1, profit + val[n-1]);
    //     int exclude = knapsackRec2(val, wt, W, n-1, profit);
    //     return Math.max(include, exclude);
    // }
    
    // return knapsackRec2(val, wt, W, n-1, profit);
    
    // }
    
    public static int kanpsackRec (int val[], int wt[], int W, int idx){      // O(2^n)
        if (W == 0 || idx == 0){
            return 0;
        }
        if (wt[idx-1] <= W){ // if capacity is less than weight of particular item 
            // include  
         int ans1= val[idx-1] +  kanpsackRec(val, wt, W-wt[idx-1], idx-1); // val[n-1]  means we are adding value of item in profit
           // exclude 
         int ans2 = kanpsackRec(val, wt, W, idx-1);
         return Math.max (ans1, ans2);
        } 
        else{
          return kanpsackRec(val, wt, W, idx-1);
        }
    }
    // O( n * W)
    // here we create dp [][] to store maximum of ans1 and ans2 
    // we creates dp[][] for changing idx and W
    public static int knapsackMemo (int val[], int wt[], int W, int idx, int dp[][]){    // we doing recursion from last index
        if (W == 0 || idx == 0){
            return 0;
        }
        if (dp[idx][W] != -1){
            return dp[idx][W];
        }
        if (wt[idx-1] <= W){ // if capacity is less than weight of particular item 
            // include  
         int ans1= val[idx-1] +  knapsackMemo(val, wt, W-wt[idx-1], idx-1, dp); // val[n-1]  means we are adding value of item in profit
           // exclude 
         int ans2 = knapsackMemo(val, wt, W, idx-1, dp);
         dp[idx][W] = Math.max (ans1, ans2);
         return dp[idx][W];
        } 
        else{
          dp[idx][W]= knapsackMemo(val, wt, W, idx-1, dp);
          return dp[idx][W];
        }
    }
    public static void print (int dp[][]){
        for (int i =0; i<dp.length; i++){
            for (int j =0; j <dp[0].length; j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    // i item +j = W(knapsak capacity) means for partcular i,j cell (idx, W) with idx (index) and W (capacity)
    // size of grid = i, j means i = item unitl ith index , j = W (capacity)
    // for cel (2, 3) means item unitll 1st index with capacity 3
    // in simle term i = we can choose to add item untill i -1 index from given val array and j means capacity for paticular cell 

    public static int kanpsackTab (int val[], int wt[], int W){
        int n = val.length;
        int dp[][] = new int [n+1][W+1];
        for (int i =0; i<dp.length; i++){  // 0 th col
            dp [i][0] =0;
        }
        for (int j =0; j< dp[0].length; j++){
            dp[0][j] =0;

        }
        for (int i =1; i<n+1; i++){
            for (int j =1; j < W+1; j++){     // j means W that we assign in main function 
                int v = val[i-1];
                int w = wt[i-1];
                if (w <= j){
                    int incProfit = v + dp[i-1][j -w];
                    int excProfit = dp[i-1][j];
                    dp[i][j] = Math.max(incProfit, excProfit);
                } 
                else {
                    int excProfit = dp[i-1][j];
                    dp[i][j] = excProfit;
                }
            }
        }
        print(dp);
        return dp[n][W]; // max prfit store in last cell   
    }
    public static void main(String[] args) {
        int val [] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int W =7;

        // this dp [][] i used in knapsackMemo 
        int dp [][] = new int [val.length +1][ W +1];
        for (int i =0; i< dp.length; i++){
            for (int j =0; j<dp[0].length; j++){
                dp[i][j] = -1;
            }
        }
       System.out.println(kanpsackRec(val, wt, W, val.length));
       System.out.println(knapsackMemo(val, wt, W, val.length, dp));
      // print(dp);
       System.out.println(kanpsackTab(val,  wt, W)); 
      // System.out.println(knapsackRec2(val, wt, W, val.length, 0));
        
    }
}
