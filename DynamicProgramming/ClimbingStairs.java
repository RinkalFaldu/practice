package DynamicProgramming;
import java.util.*;
// count ways to reach the nth stair. the person can climb either 1 stair or 2 stair at a time
// for 0 stairs = 1    for n < 1 =0
// for 1 stairs   1    
// for 2 stairs (total 2)  = 1 1               ways (n) = ways (n-1) + ways (n-2)     
//                          2             
// for 3 stairs  (total 3) = 1 1 1             ways (3)  = ways (3-1) + ways (3-2) = ways(2) + ways(1) = 2 + 1 = 3    
//                          1 2            
//                          2 1 
// for 4 stairs (total 5)=  1 1 1 1            ways (4) = ways (4-1) + ways (4-2) = ways (3) + ways (2) = 3 + 2 = 5
//                          1 1 2
//                          1 2 1
//                          2 1 1
//                          2 2 1
// 5 stairs  (total 8)    = 1 1 1 1 1          ways (5) = ways (5-1) + ways (5-2) = ways (4) + ways (3)    = 5 + 3 = 8  
//                          1 1 2 1           
//                          1 2 1 1
//                          2 1 1 1
//                          2 2 1
//                          1 1 1 2
//                          1 2 2
//                           2 1 2
public class ClimbingStairs {
    public static int countWaysRecursion (int n){    // O(2^n)
        if (n == 0){
            return 1;
        }
        if (n < 0){
           return 0;
        }
         return countWaysRecursion(n-1) + countWaysRecursion(n-2);
    }
     //  make array for veriable who changing 
    public static int countWaysMemoization(int n, int ways[]){   // O(n)
        if (n==0){
            return 1;
        }
        if (n<0){
            return 0;
        }
        if (ways[n] != -1){
            return ways[n];
        }
        ways[n] = countWaysMemoization(n-1, ways) + countWaysMemoization(n-2, ways);  // in memoization we are storing result of recursive function
        return ways[n];
    }
    // to decide we should make array or matrix we need to know how many veriable is changing
    // in this problem only n changing
    public static int countWaysTabulation (int n){       // O(n)
        int dp [] = new int [n+1];   // here we store ways of 0 to n in dp array 
        dp[0] = 1;
        for (int i = 1; i <= n; i++){
            if (i == 1){
                dp[i] = dp[i-1];
            } else {
                dp[i] = dp[i-1] + dp[i-2];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n =5;  // ans =8
        int ways [] = new int [n+1];
        Arrays.fill(ways, -1);
        System.out.println(countWaysRecursion(n));
        System.out.println(countWaysMemoization(n, ways));
        System.out.println(countWaysTabulation(n));
    }
    
}
