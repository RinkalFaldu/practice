// problem number 217 Contains Duplicate
// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//Example 1:
//Input: nums = [1,2,3,1]
//Output: true
//Explanation: The element 1 occurs at the indices 0 and 3.
package Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
   /*   this brut force approach and time complexity of this is O(n^2)
   public static boolean dublicate (int nums[]){
       
       for ( int i = 0; i<nums.length -1; i++){
            for ( int j = 1; j < nums.length; j++){
                if (nums[i] == nums[j]){
                return true;
                }
            }
        }
        return false;
    }  */
 // optimize approach to solve this problem using hash set and with time complexity of O(n)

    public static boolean dublicate (int nums[]){
       HashSet <Integer> set = new HashSet<> ();

       for ( int i = 0; i<nums.length; i++){
            if (set.contains(nums[i])){
                return true;
            }
            else {
                set.add (nums[i]);
            } 
        }
        return false;
    }
    
    public static void main(String[] args) {
        int nums [] = {1,2,3,1};
        System.out.println(dublicate (nums));
    }
    
}
