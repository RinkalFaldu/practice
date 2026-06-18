package DynamicProgramming;
import java.util.*;
// c0 =1
// c1 = 1
// c2 = c0 * c1 + c1*c0 =2 
// c3 = c0*c2 + c1*c1 + c2.c0 =5
// c4 = c0*c3 + c1 *c2 + c2*c3+ c3*c0 =
public class CatalansNumber {
    public static int catalanRec (int n){
        if (n==0 || n == 1){
            return 1;
        }
        int ans =0;
        for (int i =0; i<=n-1; i++){
            ans+= catalanRec(i) * catalanRec(n-i-1);
        }
        return ans;

    }
    public static int catalanMemo (int n, int dp[]){
        if (n==0 || n==1){
            return 1;
        }
        if (dp[n] != -1){
            return dp[n];
        }
        int ans=0;
        for (int i =0 ; i<n; i++){
            ans += catalanMemo(i, dp) * catalanMemo(n-i-1, dp);
            
        }
        return dp[n] = ans;

    }

    public static int catalanTab (int n){
        int dp[] = new int [n+1];
        dp[0] = 1; 
        dp[1] =1;
        for (int i =2; i<=n; i++){
            for (int j =0; j<i; j++){
                dp[i] += dp[j] * dp[i-j-1];  // ci = cj*ci-j-1
            }
        }
        return dp[n];

    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(catalanRec(n));

        int dp[] = new int [n+1];
        Arrays.fill(dp, -1);
        System.out.println(catalanMemo(n, dp));
        System.out.println(catalanTab(n));
        
    }
    
}
