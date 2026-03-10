package TwoDArray;

public class PrintSum {
    public static int sum (int [][] nums){
        int sum =0;
        for ( int col =0; col< nums[0].length; col++){
            sum += nums [1][col];
        }
        return sum;
    }
    public static void main(String[] args) {
        int nums [][] = {  {1,4,7},
                            {11,4,3},
                            {2,2,3}
                         };
       System.out.println("Sum of Second row is  " + sum(nums)); 

    }
    
}
