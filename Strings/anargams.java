// check for anargam string
// str1 and str2 has same characters without considering order of characters 

package Strings;
import java.util.Arrays;
public class anargams{
    public static void main(String[]args) {
        String str1="earth";
        String str2="heart";
        //Convert Strings to lowercase. Why? so thatwe don't have to checkseparately for lower & uppercase.
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        
        // First check - if the lengths are the same
        if(str1.length() ==str2.length())  {
            // convert strings into char array
            char[]str1charArray=str1.toCharArray();
            char[]str2charArray=str2.toCharArray();
            
            // sort the char array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            
            // if the sorted char arrays are sameor identical then the strings areanagram
            boolean result=Arrays.equals(str1charArray,str2charArray);
            if(result) {
                System.out.println(str1+" and "+str2+" are anagrams of each other.");
            }
            else{System.out.println(str1+" and "+str2+" are not anagrams of each other.");

            }
        }
        else{
            // case when lengths are not equal
            System.out.println(str1+" and "+str2+" are not anagrams of eachother.");
        }
    }
}