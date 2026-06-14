package Hashing;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetImplement {
    public static void main(String[] args) {
       // it prints element in random order
       // null allowed
        HashSet<String> set = new HashSet<>();
        set.add ("Washington");
        set.add("Texas");
        set.add("Dalas");
        set.add("New York");
        System.out.println(set);
        
        // linked hashset print element in order of insetion
        // null allowed
        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add ("Washington");
        set2.add("Texas");
        set2.add("Dalas");
        set2.add("New York");
        System.out.println(set2);

        // TreeSet print element in sorted ordet
        // null not allowed
        TreeSet<String> set3 = new TreeSet<>();
        set3.add ("Washington");
        set3.add("Texas");
        set3.add("Dalas");
        set3.add("New York");
        System.out.println(set3);
        
        
    }
    
}
