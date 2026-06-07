package ArrayList;
import java.util.ArrayList;

public class OptimizePairSum1 {
    public static boolean checkSum (ArrayList<Integer> list, int target){
        int left = 0;
        int right = list.size() -1;

        while (left < right){
            int sum = list.get(left) + list.get(right);
            if (sum == target){
                return true;
            }
            else if (sum < target){
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target =50;
        System.out.println(checkSum(list, target));
    }
    
}
