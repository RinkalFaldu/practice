package DynamicProgramming;
// A subsequence of string in a new string generated form the original string with same characters (can be none)
// deleted without changing the relative order of the remaining characters

public class LongestCommonSubsequence {
    public static int lcsRec (String str1, String str2, int n, int m){
        if (n ==0 || m ==0){
            return 0;
        }
        if (str1.charAt(n-1) == str2.charAt(m-1)){
            return lcsRec(str1, str2, n-1, m-1) + 1;  // character is same in both string so add in asnwer
        }
        else {
            int ans1 = lcsRec(str1, str2, n-1, m);
            int ans2 = lcsRec(str1, str2, n, m-1);
            return Math.max(ans1, ans2);

        }
    }
    public static int lcsMemo (String str1, String str2, int n, int m, int dp[][]){
        if (n ==0 || m ==0){
            return 0;
        }
        if (dp[n][m] != -1){  // -1 value of particular cell means that value already not calculated 
            return dp[n][m];
        }
        if (str1.charAt(n-1) == str2.charAt(m-1)){
            return dp[n][m] = lcsMemo(str1, str2, n-1, m-1, dp) + 1;  // character is same in both string so add in asnwer
        }
        else {
            int ans1 = lcsMemo(str1, str2, n-1, m, dp);
            int ans2 = lcsMemo(str1, str2, n, m-1, dp);
            return dp[n][m] =Math.max(ans1, ans2);

        }

    }
    public static int lcsTab (String str1, String str2){
        int n = str1.length();
        int m = str2.length();
        int dp [][] = new int [n+1][m+1];
        for (int i =0; i< n+1; i++){
            for (int j =0; j< m+1; j++){
                if (i ==0 || j == 0){
                    dp[i][j] = 0;
                }
            }
        }
        for (int i =1; i<n+1; i++){
            for (int j =1; j<m+1; j++){
                if (str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] +1;
                }
                else {
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1, ans2);
                }  
            }
        }
        return dp[n][m];

    }
    public static void main(String[] args) {
        String str1 = "abcdge";    // n is length of string str1, m is length of str2
        String str2 = "abedg"; // lcs = "abdg" ; length =4  because order of e change in str2 so we can not count in common subsequence
        System.out.println(lcsRec(str1, str2, str1.length(),str2.length())); 
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int [n+1][m+1];
        // initialize dp grid with -1 for lcs memo
        for (int i =0; i< n+1; i++){
            for (int j =0; j<m+1; j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(lcsMemo(str1, str2, n, m, dp));
        System.out.println(lcsTab(str1, str2));
    }
    
}
