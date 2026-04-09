package Strings;

import java.util.Scanner;

public class VowelsCount {
    public static int vowels (String str){
        int count =0;
        for (int i = 0; i<str.length(); i++ ){
           char ch = str.charAt (i);
           if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            count++;
           }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String str;
        // .next take one word as input
        //.nextLine take full line or multiple word as input
        str = sc.next();
        System.out.println(vowels(str));
        

        /*String str = "Rinkal";
        String str1 = "Faldu";
        String str2 = "Rinkal";

        System.out.println(str.equals(str1) + " " + str.equals(str2));

        String str3 = "ApnaCollege".replace("l", "");
        System.out.println(str3); */
    }
    
}
