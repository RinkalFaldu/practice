// time complexity : O (n) 
// this code used optimize best approach to solve problem of sub array sum 
//  this code replace with 0 is max sum is negative 

package Arrays;

public class kadanSubArraySum {
    public static void kadanes (int numbers []){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for ( int i = 0; i < numbers.length; i++){
            cs = cs + numbers [i];
             if ( cs < 0){
                cs =0;
            }
            ms = Math.max(cs, ms);

        }
        System.out.println(" our max Subarray sum is : " + ms);
    }
    public static void main(String[] args) {
        int numbers [] = {-2, -3, 4, -1, -2, 1, 5, -3};
         kadanes (numbers);

    }
    
}
 