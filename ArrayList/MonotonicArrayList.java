
package ArrayList;
import java.util.ArrayList;


public class MonotonicArrayList {
    public static boolean checkMonotonic (ArrayList<Integer> list){
        boolean increasing = true;
        boolean decreasing = true;

        for (int i =0; i<list.size()-1; i++){
            if (list.get(i) < list.get(i+1)){
                decreasing = false;
                
            }
            if (list.get(i) > list.get(i+1)){
                increasing = false;
                
            }
        }
        return increasing || decreasing;
    }
    

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
       // list.add(3);
        System.out.println(checkMonotonic(list));
        
    }
    
}


/*public class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;
        boolean increase = true;
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i - 1]) {
                increase = false;
                break;
            }
        }
        if (increase) {
            return true;
        }

        boolean decrease = true;
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                decrease = false;
                break;
            }
        }
        return decrease;
    }
} */