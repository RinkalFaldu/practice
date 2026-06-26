package DynamicProgramming;
// numbers[] = {1, 6, 11, 5}
// min diff =1
// {1, 6} =7       {11, 5} = 16 diff = 16 -7 = 9
// {1, 11} = 12    {6, 5} = 11 diff = 12 -11 =1
// {1, 5} = 6      {6, 11} = 17 diff = 17 -6 = 11

// different types of questions 
// 1. minimum subset sum difference
// 2. partitioning subset
// task is to make two different sets with elements in it whose is equal 
// means sum1 == sum2  means sum1 - sum2 =0 idea condition
// this is veriation of  0 1 knapsack 
// dp[n+1][w+1]
// W is sum/2
 
public class MinimumPartitioning {
    public static int minPartitionRec(int[] arr, int idx, int sum1, int totalSum) {
        if (idx == arr.length) {
            return Math.abs(totalSum - sum1);
        }

        // Include arr[idx] in subset1
        int take = minPartitionRec(arr, idx + 1, sum1 + arr[idx], totalSum);

        // Do not include arr[idx] in subset1
        int skip = minPartitionRec(arr, idx + 1, sum1, totalSum);

    return Math.min(take, skip);
   }
    public static int minPartitionTab (int arr[]){
        int n = arr.length;
        int sum =0;
        for (int i =0; i<arr.length; i++){
            sum += arr[i];
        }
        int W = sum/2;

        int dp[][] = new int [n+1][W+1];
        for (int i =1; i<n+1; i++){
            for (int j =1; j<W+1; j++){
                if (arr[i-1] <= j){
                    dp[i][j] = Math.max(arr[i-1] + dp[i-1][j -arr[i-1]], dp[i-1][j]);
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        int sum1 =  dp[n][W];
        int sum2 = sum -sum1;
        return Math.abs(sum1 - sum2);
    }
    public static void main(String[] args) {
        
        int[] numbers = {1, 6, 11, 5};
        int totalSum = 0;
        for (int x : numbers) totalSum += x;
        int answer = minPartitionRec(numbers, 0, 0, totalSum);
        System.out.println(answer); // should print 1
        System.out.println(minPartitionTab(numbers));
        
    }
    
}
