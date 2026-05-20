package Recursion;

public class LengthOfString {
    public static int length (String str){
        if (str.length() == 0){
            return 0;
        }
        return length (str.substring(1)) + 1;
    }

    // another approach to solve same problem
    public static int getlength(String str, int index) {

    if (index == str.length()) {
        return 0;
    }

    return 1 + getlength(str, index + 1);
}
    public static void main(String[] args) {
        String str = "abcdefgh";
        System.out.println(length(str));
        System.out.println(getlength(str, 0));
    }
    
    
}
