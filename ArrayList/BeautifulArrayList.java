package ArrayList;
import java.util.ArrayList;
import java.util.List;

// time complexity is O(n log n)
// space complexity is O(n)

public class BeautifulArrayList {
    public static ArrayList<Integer> beautiful(int n){

        ArrayList<Integer> result = new ArrayList<>();
        result.add(1);

        while (result.size() < n) {
            ArrayList<Integer> temp = new ArrayList<>();

            // Generate even numbers
            for (int x : result) {
                if (2 * x <= n) {
                    temp.add(2 * x);
                }
            }
            
            
            // Generate odd numbers
            for (int x : result) {
                if (2 * x - 1 <= n) {
                    temp.add(2 * x - 1);
                }
            }
            
        
            result = temp;
        }

        return result;
    
    }

    public static void main(String[] args) {
        int n =4;
        System.out.println(beautiful(n));

    }
    
}
