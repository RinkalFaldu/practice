// when we create string with new keyword it creates new object
// otherwise it pointing towards old objects means s2 pointing towards s2
// while s3 creates new objects. so s1 and s3 are not same object so it prints s1 == s3 not same
// so compare values of string we have to use (s1.equals(s3)) to compares values of object 
package Strings;

public class StringComparison {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String ("Tony");
        if (s1 == s2){
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("Strings are not equal");
        }
        if (s1 == s3){
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
        if (s1.equals (s3)){
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("Strings are not equal");
        }
    }
    
}
