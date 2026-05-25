//The majority element is the element that appears more than⌊n/2⌋ times.You may assume that the majority element always exists in the array.
// Sample Input 1: nums = [3,2,3]
// Sample Output 1: 3 
// Sample Input 2: nums = [2,2,1,1,1,2,2]
// Sample Output 2: 2
// Boyer-Moore Voting AlgorithmThe best way to solve this, 
//  is the Boyer-Moore Voting Algorithm, which provides a linear time complexity and constant space complexity.Approach:
// Initialize: Set a candidate variable to the first element and a count to 
// 1.Iterate: Traverse the array from the second element.
// Vote:If the current element equals the candidate, increment the count (count++).
// If not, decrement the count (count--).
// If the count becomes 0, pick the current element as the new candidate and reset the count to 1.

package DivideAndConquer;

public class MajorityElement {
    // time complexity is O(n^2)
    public static int MajorityByBruteForce (int[] nums ){
        int MajorityCount = nums.length /2;
        int count = 0;

        for (int i = 0; i< nums.length; i++){
            for (int j = 0; j< nums.length; j++){
                if (nums[i] == nums[j]){
                    count++;
                }
            }
            if (count > MajorityCount){
                return nums [i];
            }
        }
        return -1;
    }

    // time complexity O(n)
    public static int getMajorityElement (int[] nums){
        int candidate = nums[0];                  // fist element of array
        int count = 1;                            // first element apear one time 

    for (int i = 1; i < nums.length; i++) {           
        if (nums[i] == candidate) {
            count++;
        } 
        else {
            
            if (count == 0) {
                candidate = nums[i];
                count = 1;
            }
            else{
                count--;
            }
        }
    }
    return candidate;
    }
    // used devide and conquer algorithem to solve this with time complexity 
    // O(n logn)
    private static int countInRange (int [] nums, int num, int lo, int hi){
        int count = 0;
        for (int i = lo; i <= hi; i++){
            if (nums[i] == num){
                count++;
            }
        }
        return count;
    }

    private static int majorityElementRec (int [] nums, int lo, int hi){
        // base case the only element in an array of size 1 is the majority element
        if (lo == hi){
            return nums[lo];
        }

        // recurse on left and right halves of this slice
         int mid = lo + (hi - lo)/2;
         int left = majorityElementRec(nums, lo, mid);
         int right = majorityElementRec(nums, mid +1, hi);

         if (left == right){
            return left;
         }

         // otherwise, count each element and return "winner"
         int leftCount = countInRange(nums, left, lo, hi);
         int rightCount = countInRange(nums, right, lo, hi);

         return leftCount > rightCount ? left : right;
    }

    public static int MajorityElement(int [] nums){
        return majorityElementRec(nums, 0, nums.length -1);
    }
    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};
        System.out.println(MajorityByBruteForce(nums));
        System.out.println(getMajorityElement(nums));
        System.out.println(MajorityElement(nums));
        
    }
}