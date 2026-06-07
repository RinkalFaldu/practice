package ArrayList;
import java.util.ArrayList;

public class arraylist1 {
    public static void main(String[] args) {
        // arraylist is part of java collection framework
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();
    
        // add operation O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        
        // this add 9 at 1st index O(n)
        list.add(1, 9); 

        System.out.println(list);

        //Get Operation O(1)
        int element = list.get(2);
        System.out.println(element);

        //delete O(n)
        list.remove(2);
        System.out.println(list);

        //Set  O(n)
        list.set(2,10);
        System.out.println(list);

        // Contains means to check for particular element is in list or not
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

        System.out.println(list);
        System.out.println(list.size());  // size of arraylist

        //print the arraylist
        for (int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }

    
}
