// Leetcode Problem Number 645: Set MisMatch
// time complexity O(n^2)

package Arrays;
public class SetMisMatch {
    public static int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int n=nums.length;
        //Initialize the frequency array in n+1 to start with the right index
        int[] frequency = new int[n+1];
        
        //The frequency[] array will count each number that appears inside nums[] array
        for(int i=0; i<n; i++){
            frequency[nums[i]]++;
        }

        //We find both, the repeated number and the missing number based on the previous count.
        for(int i=1; i<=n; i++){
            if(frequency[i]==2){
                result[0] = i;
            }
            if(frequency[i]==0){
                result[1] = i;
            }
        } 
        return result;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,2,4};
        int[] result = findErrorNums(nums);
        for (int i =0; i < result.length; i++ ){
            System.out.print( result[i] + " ");
        }
        System.out.println();
        
    }

}