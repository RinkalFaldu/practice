// leet code problem number : 26: Remvoe duplicates from sorted array 
// in output it shows duplicates element in last but in leet code resul end after all unique element. 
package Arrays;

public class RemoveDuplicateFromSortedArray {
    public static void removeDuplicates(int[] nums) {
        int i =0;
        for ( int j =1; j< nums.length; j++){
             if (nums [i] != nums[j]){
                i++;
                nums [i] = nums [j];
             }
        }
        System.out.println(i+1);;
    }

    public static void main(String[] args) {
        int [] nums = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(nums);
        for (int i =0; i < nums.length; i++ ){
            System.out.print( nums[i] + " ");
        }
        System.out.println();
    }
    
}
