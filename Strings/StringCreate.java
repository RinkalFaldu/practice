// Strings are Immutable we can not make changes to same string to make changes we need to create new string
package Strings;
import java.util.*;

import java.util.Scanner;

public class StringCreate {
    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c', 'd' };
        String str1 = "abcd";
        String str2 = new String ("xyz");

        // Strings are Immutable 
        // taking string as input output
        Scanner sc = new Scanner (System.in);
        String name;
        // .next take one word as input
        //.nextLine take full line or multiple word as input
        name = sc.nextLine();
        System.out.println(name);


        
    }
    
}
