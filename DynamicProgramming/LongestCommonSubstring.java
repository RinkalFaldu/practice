package DynamicProgramming;
// a substring is a contiguous sequence of characters within a string
// meaning of dp grid for particular cell i, j is longest common substring of str1(i), str2(j)
// if str1.charAt (i) == str2.charAt(j) than (n-1, m-1) +1
// str1.charAt (i) != str2.charAt(j)  set counter of substring to 0
// in this problem it is not necessary that final asnwer is stored in last cell so i have to find maximum in value from all cells
public class LongestCommonSubstring {
    //time complexity is O(n *m)
    public static int longestCommonSubstringTab(String str1, String str2){
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int [n+1][m+1];
        int ans =0;
        for (int i=0; i<n+1; i++){
            dp[i][0] =0;
        } 
        for (int j =0; j <m+1; j++){
            dp[0][j] = 0;
        }
        for (int i =1; i<n+1; i++){
            for (int j =1; j<m+1; j++){
                if (str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] +1;
                    ans = Math.max(ans, dp[i][j]);
                } else {
                    dp[i][j] =0;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str1 = "ABCDE";   // ans is 2 because AB
        String str2 = "ABGEC";
        System.out.println(longestCommonSubstringTab(str1, str2));
        
    }
    
}
