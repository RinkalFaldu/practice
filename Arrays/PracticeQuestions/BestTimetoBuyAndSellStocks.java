package Arrays.PracticeQuestions;
// you are given an arrays prices where prices[i] is the price of a given stock on the ith day
// Return the maximum profit you can achieve from this transaction. if you cannot achieve any profit, return 0.
// Example 1
// Input prices = [7, 1, 5, 3, 6, 4]
// output 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5. Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sel
// Example 2
// Input prices = [7, 6, 4, 3, 1]
// output 0
// Explanation: in this case, no transaction are done and the max profit =0

public class BestTimetoBuyAndSellStocks {
    public static int getMaxProfit (int prices[]){
        int maxProfit = 0;
        int buy =0;
        for (int sell =1; sell < prices.length; sell++){
            if (prices[buy] < prices[sell]){
                int profit = prices[sell] - prices[buy];
                maxProfit = Math.max(profit, maxProfit);
            } 
            else {
                buy = sell;
            }
        }
        return maxProfit;

    }
    public static void main(String[] args) {
        int prices [] = {7, 1, 5, 3, 6, 4};
        System.out.println(getMaxProfit(prices));
    }
    
}
