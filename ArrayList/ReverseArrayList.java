package ArrayList;
import java.util.ArrayList;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0; i<5; i++){
            list.add(i+1);
        }
        System.out.println(list);

        for(int i = list.size()-1; i>=0; i--){
            System.err.print(list.get(i) + " ");
        }
        System.out.println();
    }
    
}
