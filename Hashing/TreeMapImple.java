package Hashing;
import java.util.*;

// tree map internally implemented using red black tree;
// it give element in sorted key order 

public class TreeMapImple {

    public static void main(String[] args) {
        LinkedHashMap <String, Integer> lhm = new LinkedHashMap<>();  // in this we get data in order of insertion  
        lhm.put("India", 100);
        lhm.put ("China", 150);
        lhm.put ("Us", 50);

        HashMap <String, Integer> hm = new HashMap<>();  // get rendom order 
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("Us", 50);

        TreeMap <String, Integer> tm = new TreeMap<>();  // in sorting order in terms of key 
        tm.put("India", 100);
        tm.put("China", 150);
        tm.put("Us", 50);

        System.out.println(lhm);
        System.out.println(hm);
        System.out.println(tm);

        
    }
    


    
}
