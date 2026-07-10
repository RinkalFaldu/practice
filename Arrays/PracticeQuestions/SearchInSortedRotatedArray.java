package Arrays.PracticeQuestions;
//There is an integer array nums sorted in ascending order (with distinct values).
// prior to being passed to your function, nums is possibly rotated at an unknown
//pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ...., nums[n-1], nums[0], nums[1], ...., nums[k-1]] (0-indexed).
//for example [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4, 5, 6,7, 0, 1, 2].
// Given the array nums afterr the possible rotation and an integer target, return the index of tzrget if it is in numms, or -1 if it is not in nums.
// you must write an algorithm with O(log n) runtime complexity.

// Input nums = [4, 5, 6, 7, 0, 1, 2], target =0
// output 4
//Example 2
// nums = [4, 5, 6, 7, 0,1, 2], target =3
// output -1
// Example 3
// nums =[1], target =0
// output -1

public class SearchInSortedRotatedArray {
    public static int search (int nums[], int target){
        int left =0;
        int right = nums.length-1;
        while (left <= right){
            
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[left] <= nums[mid]){
                if (target >= nums[left] && target <= nums[mid]){
                    right = mid -1;
                }
                else {
                    left = mid+1;
                }
            }
            else {
                if (target >= nums[mid] && target <= nums[right]){
                    left = mid+1;
                }
                else {
                    right = mid -1;
                }


            }
           
        }
        return -1;

    }
    public static void main(String[] args) {
        int nums [] = {4, 5, 6, 7, 0, 1, 2};
        int target = 3;
        System.out.println(search(nums, target));
        
    }
    
}
