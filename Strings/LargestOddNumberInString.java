// leetcode Problem 1903 : Largest odd Number in string
//Approach
//The goal is to find the largest odd number that is a prefix of the given string num.
//Since an odd number must end with an odd digit, we start checking from the last character of the string.
//Move leftwards until we find a digit that is odd.
//Once an odd digit is found at index j, return the substring from index 0 to j — this prefix forms the largest odd number.
//If no odd digit is found, return an empty string, because no odd number can be formed.
//Complexity
//Time complexity: O(n)
//Space complexity: O(1)
package Strings;

public class LargestOddNumberInString {
    public static String largestOddNumber(String num) {
        int last=num.length()-1;
        while(last>=0){
            if(num.charAt(last)%2==1){
                return num.substring(0,last+1);
            }
            last--;
        }
        return "";
    }
    public static void main(String[] args) {
        String num = "12345642";
        System.out.println(largestOddNumber(num));
    }
    
}
