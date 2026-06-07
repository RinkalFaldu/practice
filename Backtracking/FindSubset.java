// Time complexity = O(n * 2^n)
// Space Complexity = O(n)
// for string length n, string can have 2^n subset
package Backtracking;

public class FindSubset {
    public static void findSubSets(String str, String ans, int i){
        //base case
        if(i == str.length()){
            if (ans.length() ==0){
                System.out.println("null"); // this prints last subset as null
            }
            else {
            System.out.println(ans);
        
            }
            return;
        }
        //recursion
        //yes choice
        findSubSets(str, ans+str.charAt(i), i+1);
        //No choices
        findSubSets(str, ans, i+1);
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubSets(str, "", 0);
        
    }
    
}
