 package Hashing;
import java.util.*;

 public class LinkedHashSetImplement {
    public static void main(String[] args) {
       // it prints element in random order
        HashSet<String> set = new HashSet<>();
        set.add ("Washington");
        set.add("Texas");
        set.add("Dalas");
        set.add("New York");
        System.out.println(set);
        
        // linked hashset print element in order of insetion
        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add ("Washington");
        set2.add("Texas");
        set2.add("Dalas");
        set2.add("New York");
        System.out.println(set2);
        
        


        
    }


 }