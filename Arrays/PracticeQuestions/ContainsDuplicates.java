package Arrays.PracticeQuestions;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
    public static boolean checkDuplicates (int nums[]){
        Set<Integer> s = new HashSet<>();
        for (int i =0; i< nums.length;i++){
            if (s.contains(nums[i])){
                return true;
            }
            else {
                s.add(nums[i]);
            }
        }
        
        return false;
    }
// i can also compare size of set and nums to check dublicates exist or not
// first add all element of array in set. set doesn't allow duplicates so if we get 
// if (s.size() != nums.length){ return true} else {false }
    public static void main(String[] args) {
        int nums [] = {1, 2, 3, 4};
        System.out.println(checkDuplicates(nums));

        
    }
    
}
