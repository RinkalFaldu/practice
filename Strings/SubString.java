package Strings;

public class SubString {
    public static String substring (String str, int start, int end){
        String substr ="";
        for ( int i = start; i < end; i++){
            substr += str.charAt(i);
        }
       return substr; 
    }
    
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(substring (str, 0, 5));
        // built in method for substring without using substring function that I wrote previously 
        System.out.println(str.substring(0, 5));
    }
    
}
