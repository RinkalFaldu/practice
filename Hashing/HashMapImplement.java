package Hashing;
import java.util.*;

// hashmap internal implementation done using linked list

public class HashMapImplement {
    public static void main(String[] args) {
        HashMap <String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("Us", 50);
        System.out.println(hm);
       // get O(1)
       int population =  hm.get("India");
       System.out.println(population);

       // ContainsKey -O(1)
       System.out.println(hm.containsKey("India"));

       // remove - O(1)
       //System.out.println(hm.remove("China"));
      // System.out.println(hm);

       // size
       System.out.println(hm.size());

       //Iterate to map we have to use set we can not directly iterate on map
       // hm.entrySet 
       Set <String> key = hm.keySet();
      // Set<Map.Entry<String, Integer>> key2 = hm.entrySet();
       System.out.print(key); 
       for (String k : key) {
        System.out.println("Key =" + k+ " value =" + hm.get(k));
        
       }


       
        
    }
    
}
