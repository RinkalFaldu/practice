// time complexity : O (n^3) 
// this code used brute force approach to solve problem 
// this code prints following output  using input int numbers [] = {1,-2,6,-1,3};
// 1
//-1
//5
//4
//7
//-2
//4
//3
//6
//6
//5
//8
//-1
//2
//3
//max sum = 8

package Arrays;

public class maxSubArraySum {
    
    public static void subArraySum (int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for ( int i =0; i < numbers.length; i++){
             int start = i;
            for (int j =i; j< numbers.length ; j++){
                int end = j;
                currSum = 0;
                 for ( int k = start; k <=end; k++){
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if (maxSum < currSum){
                    maxSum = currSum;
                }
            
            }
            
        }
        System.out.println("max sum = " + maxSum);
    }
    public static void main(String[] args) {
        int numbers [] = {1,-2,6,-1,3};
        subArraySum (numbers);

    }
    
}
