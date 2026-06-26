package DynamicProgramming;
// convert String1 to (as) String2 with only insertion & deletion Print number of deletion & insertion
// Logic: Find LCS (Longest Common Subsequence) - characters that exist in both strings
// Deletions = characters in str1 NOT in LCS (need to remove from str1)
// Additions = characters in str2 NOT in LCS (need to add to str1)

public class StringConversion {
    // Function to find Longest Common Subsequence (LCS) length using tabulation
    // LCS contains characters common to both strings (in same order)
    public static int lcsTab (String str1, String str2){
        int n = str1.length();
        int m = str2.length();
        // dp[i][j] = length of LCS of str1[0...i-1] and str2[0...j-1]
        int dp [][] = new int [n+1][m+1];
        for (int i =0; i< n+1; i++){
            for (int j =0; j< m+1; j++){
                if (i ==0 || j == 0){
                    dp[i][j] = 0;
                }
            }
        }
        // Fill the DP table
        for (int i =1; i<n+1; i++){
            for (int j =1; j<m+1; j++){
                // If characters match, they are part of LCS
                if (str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] +1;
                }
                else {
                    // If characters don't match, take max of excluding current char from either string
                    int ans1 = dp[i-1][j];  // exclude str1[i-1]
                    int ans2 = dp[i][j-1];  // exclude str2[j-1]
                    dp[i][j] = Math.max(ans1, ans2);
                }  
            }
        }
        return dp[n][m];

    }
    // Calculate number of operations needed to convert str1 to str2
    public static void conversionTab (String str1, String str2){
        int n = str1.length();
        int m = str2.length();
        int lcsLength = lcsTab(str1, str2);

        // DELETION: Characters in str1 that are NOT in LCS (str2) need to be deleted
        int delete = n - lcsLength;
        // ADDITION: Characters in str2 that are NOT in LCS need to be added
        int add = m - lcsLength;
        
        

        System.out.println( "add operation = " + add + " delete operation = " + delete);
        

    }

    public static int lcsMemo(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        Integer[][] memo = new Integer[n + 1][m + 1];
        return lcsMemoHelper(str1, str2, n, m, memo);
    }

    private static int lcsMemoHelper(String str1, String str2, int i, int j, Integer[][] memo) {
        if (i == 0 || j == 0) {
            return 0;
        }
        if (memo[i][j] != null) {
            return memo[i][j];
        }
        if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
            memo[i][j] = 1 + lcsMemoHelper(str1, str2, i - 1, j - 1, memo);
        } else {
            memo[i][j] = Math.max(
                lcsMemoHelper(str1, str2, i - 1, j, memo),
                lcsMemoHelper(str1, str2, i, j - 1, memo)
            );
        }
        return memo[i][j];
    }

    public static void conversionMemo(String str1, String str2) {
        int lcsLength = lcsMemo(str1, str2);
        int delete = str1.length() - lcsLength;
        int add = str2.length() - lcsLength;
        System.out.println("add operation = " + add + " delete operation = " + delete);
    }

    public static void main(String[] args) {
        // Test case: Convert "pear" to "sea"
        // LCS = "ea" (length 2)
        // Deletions = 4 - 2 = 2 (delete 'p' and 'r' from str1)  // extra character in string 1 that are not in string 2
        // Additions = 3 - 2 = 1 (add 's' to str1)               // add character that are in string 2 but not in string 1
        String str1 = "pear";   // i need to make pear to sea
        String str2 = "sea";
        conversionTab(str1, str2);

        
    }
    
}
