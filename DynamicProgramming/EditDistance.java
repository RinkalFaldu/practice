package DynamicProgramming;
// minimum number of operation to make string 1 as string 2

public class EditDistance {
    public static int editDistanceTab (String word1, String word2){
        int n = word1.length();
        int m = word2.length();
        int dp[][] = new int [n+1][m+1];
        for (int i = 0; i< n+1; i++){
            for (int j =0; j< m+1; j++){
                if (i ==0){
                    dp[i][j] = j;
   
                }
                if (j == 0){
                    dp[i][j] = i;
                }
            }
        }
        for (int i =1; i< n+1; i++){
            for (int j =1; j <m+1; j++){
                if (word1.charAt(i-1) == word2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                } else {
                    // str1 abcdef (n)   str2 bdeg (m) if i add g int
                    //  str1 abcdefg   it this case for next operation  next operation i have to analyze str1 abcdef  (n) and str2 bde  (m-1)
                    int add = dp[i][j-1] +1;         
                    int del = dp[i-1][j] +1;
                    int rep = dp[i-1][j-1] +1;
                dp[i][j] = Math.min(add, Math.min(del, rep));
                }
            }
        }
        return dp[n][m];

    }
    
    public static int editDistanceMemo(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        Integer[][] memo = new Integer[n + 1][m + 1];
        return editDistanceMemoHelper(word1, word2, n, m, memo);
    }

    private static int editDistanceMemoHelper(String word1, String word2, int i, int j, Integer[][] memo) {
        if (i == 0) {
            return j;
        }
        if (j == 0) {
            return i;
        }
        if (memo[i][j] != null) {
            return memo[i][j];
        }

        if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
            memo[i][j] = editDistanceMemoHelper(word1, word2, i - 1, j - 1, memo);
        } else {
            int add = 1 + editDistanceMemoHelper(word1, word2, i, j - 1, memo);
            int delete = 1 + editDistanceMemoHelper(word1, word2, i - 1, j, memo);
            int replace = 1 + editDistanceMemoHelper(word1, word2, i - 1, j - 1, memo);
            memo[i][j] = Math.min(add, Math.min(delete, replace));
        }

        return memo[i][j];
    }

   
    public static void main(String[] args) {
        String word1 = "intention";   
        String word2 = "execution";
        System.out.println(editDistanceTab(word1, word2));

        // ans is 5 because
        // intention -> inention (remove 't')
        // inention -> enention (replace 'i' with 'e')
        // enention -> exention (replace 'n' with 'x')
        // exention -> exection (replace 'n' with 'c')
        // exection -> execution (insert 'u')
    }
    
}
