package DynamicProgramming;

// given a text and wildcard pattern, implement wildcard pattern matching algorithm that finds if wildcard
// pattern is matched with text. the matching should cover the entire text (not partial text). The wildcard pattern can include that character '?' and '*'
// '?' - matches any single character
// '*' - matches any sequence of characters (including the empty sequence)

// dp grid created for n+1 (string) and m+1  (pattern)

public class WildcardMatching {
    public static boolean isMatchTab (String s, String p){
        int n = s.length();
        int m = p.length();
        boolean dp [][] = new boolean[n+1][m+1];
        dp[0][0] = true;
        // patter = " "
        for (int i =1; i<n+1; i++){
            dp[i][0] = false;
        }
        // s = " "
        for (int j =1;  j< m+1; j++){
            if (p.charAt(j-1) == '*'){   // here  checking s  = " "  and p = "* " basically we are ignoring * and moving to next character of pattern 
                 dp[0][j] = dp[0][j-1];
            }
        }
        // bottom up
        for (int i =1; i< n+1; i++){
            for (int j =1; j<m+1; j++){
                // case -> ith char == jth char || jth char == ?
                if (s.charAt(i-1) == p.charAt(j -1) || p.charAt(j -1) == '?'){
                    dp[i][j] = dp[i-1][j-1];
                }
                else if (p.charAt(j-1) == '*'){
                    dp[i][j] = dp[i-1][j] || dp[i][j-1];
                }
                else {
                    dp[i][j] = false;
                }
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {
        String s = "baaabab";
        String p = "*****ba*****ab";
        System.out.println(isMatchTab(s, p));
        
    }
}


/*
 Wildcard pattern matching (full-match version)

 Problem:
 Given a text string `s` and a pattern `p` that may contain two special characters:
 - `?` matches any single character
 - `*` matches any sequence of characters (including the empty sequence)

 Determine whether `p` matches the entire text `s`.

 Approach (Dynamic Programming - tabulation):
 - Create a boolean DP table `dp` sized (n+1) x (m+1) where n = s.length(), m = p.length().
 - `dp[i][j]` means: pattern prefix `p[0..j-1]` matches text prefix `s[0..i-1]` (both prefixes of length i and j).

 Base cases:
 - `dp[0][0] = true` : empty pattern matches empty string.
 - `dp[i][0] = false` for i > 0 : non-empty text cannot match an empty pattern.
 - `dp[0][j]` depends on pattern: an empty text can only be matched by a pattern that is entirely '*' so far.
    For example, pattern `"**"` can match empty text, so propagate `dp[0][j] = dp[0][j-1]` when `p[j-1] == '*'`.

 Transition rules for i>0, j>0:
 1) If `p[j-1]` is a normal character or '?':
    - If characters match (`s[i-1] == p[j-1]`) or `p[j-1] == '?'` then `dp[i][j] = dp[i-1][j-1]` (we consume one char from both)
 2) If `p[j-1] == '*'`:
    - `*` can match zero characters -> `dp[i][j-1]` (ignore this '*', pattern shrinks)
    - `*` can match one or more characters -> `dp[i-1][j]` (consume one char from text but keep same pattern j)
    - Combine both: `dp[i][j] = dp[i][j-1] || dp[i-1][j]`.

 Final answer: `dp[n][m]` (does full pattern match full text?)
*/

// public class WildcardMatching {
//     public static boolean isMatchTab (String s, String p){
//         int n = s.length();
//         int m = p.length();

//         // dp[i][j] = true if s[0..i-1] matches p[0..j-1]
//         boolean dp [][] = new boolean[n+1][m+1];

//         // Empty pattern matches empty text
//         dp[0][0] = true;

//         // Non-empty text cannot match empty pattern (explicit, though default boolean is false)
//         for (int i = 1; i <= n; i++){
//             dp[i][0] = false; // redundant but explicit for clarity
//         }

//         // Empty text with non-empty pattern: only possible if pattern so far is all '*'
//         // Example: s = "" and p = "***" -> true; p = "a*" -> false
//         for (int j = 1; j <= m; j++){
//             if (p.charAt(j-1) == '*'){
//                 // '*' can represent an empty sequence -> inherit previous pattern result
//                 dp[0][j] = dp[0][j-1];
//             } else {
//                 // once a non-'*' appears, empty string cannot match longer pattern
//                 dp[0][j] = false;
//             }
//         }

//         // Fill DP table bottom-up
//         for (int i = 1; i <= n; i++){
//             for (int j = 1; j <= m; j++){
//                 char pc = p.charAt(j-1); // current pattern char
//                 char sc = s.charAt(i-1); // current string char

//                 if (pc == '?'){
//                     // '?' matches any single character: reduce both prefixes
//                     dp[i][j] = dp[i-1][j-1];
//                 }
//                 else if (pc == '*'){
//                     // '*' matches zero characters: dp[i][j-1]
//                     // OR '*' matches >=1 characters: dp[i-1][j]
//                     // Combine both possibilities.
//                     dp[i][j] = dp[i][j-1] || dp[i-1][j];
//                 }
//                 else {
//                     // exact character match required
//                     if (sc == pc){
//                         dp[i][j] = dp[i-1][j-1];
//                     } else {
//                         dp[i][j] = false;
//                     }
//                 }
//             }
//         }

//         // Final cell tells whether full pattern matches full text
//         return dp[n][m];
//     }

//     public static void main(String[] args) {
//         // Example usage and quick sanity check
//         String s = "baaabab";
//         String p = "*****ba*****ab";

//         // Expected: true (pattern with many '*'s and exact substrings should match)
//         System.out.println(isMatchTab(s, p));
//     }
// }

