package Hashing;

import java.util.HashSet;
import java.util.Iterator;
// two way to Iterate on HashSet
// a. using iterator
// b. using Enhanced for loop

public class HashSetImplement {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add ("Washington");
        set.add("Texas");
        set.add("Dalas");
        set.add("New York");
        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        for (String s : set){
            System.out.println(s);
        }

    //     set.add(1);
    //     set.add(2);
    //     set.add(4);
    //     set.add(2);
    //     set.add(1);

    //     System.out.println(set);

    //     if (set.contains(2)) {
    //         System.out.println("set contains 2");
    //     }
    //   //  set.clear();
    //     System.out.println(set.size());
    //     System.out.println(set.isEmpty());
    }
}