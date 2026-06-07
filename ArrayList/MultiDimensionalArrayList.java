package ArrayList;
import java.util.ArrayList;

// all mutidimentional doesn't need to be same size
public class MultiDimensionalArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        mainList.add(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);
        list2.add(10);
        
        mainList.add(list2);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(3);
        list3.add(6);
        list3.add(9);
        list3.add(12);
        list3.add(15);
        
        mainList.add(list3);
        System.out.println(mainList);

        for (int i=0; i<mainList.size(); i++){
            ArrayList<Integer> currList = mainList.get(i);        // it gives use full sublist and stores in currList
            for(int j =0; j<currList.size(); j++){                 // this loop traverse in sublist
                System.out.print(currList.get(j) + " ");
            }
         System.out.println();
        }
    }       
    
}
