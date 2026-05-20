// we are given s string S, we need to find the count of all contiguous substrings starting and ending with the same character.
package Recursion;

public class ContiguousSubstring {
    public static int substring (String str, int start, int end, int length){
        if (length == 1){
            return 1;
        }
        if (length <= 0){
            return 0;
        }
        int result = substring (str, start +1 , end, length -1) +
                     substring (str, start, end-1, length -1) -
                     substring (str, start +1 , end -1, length -2);
        if (str.charAt(start) == str.charAt(end) ){
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "abcab";
        int length = str.length();
        System.out.print(substring(str, 0, length -1, length));
        
    }
}
