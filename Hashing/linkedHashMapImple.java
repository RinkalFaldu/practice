package Hashing;
import java.util.*;
// linked hash map internally implemented using double linked list

public class linkedHashMapImple {
    public static void main(String[] args) {
        LinkedHashMap <String, Integer> lhm = new LinkedHashMap<>();  // in this we get data in order of insertion  
        lhm.put("India", 100);
        lhm.put ("China", 150);
        lhm.put ("Us", 50);

        HashMap <String, Integer> hm = new HashMap<>();  // get rendom order 
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("Us", 50);

        System.out.println(lhm);
        System.out.println(hm);

        
    }
    
}
