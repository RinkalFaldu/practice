// time complexity : O (n^2) 
// this code used optimize approach to solve problem of sub array sum 
// this code we created new array prefix that stores sum of element 
// this code print following output using input int numbers [] = {1,-2,6,-1,3};
// max sum = 8

package Arrays;

public class optimaxSubArraySum {
    
    public static void subArraySum (int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        prefix [0] = numbers[0];
        // calculated prefix sum array 
        // used formula
        for ( int i =1; i < prefix.length; i++){
            prefix [i] = prefix [i-1] + numbers [i];        
         }
        for ( int i =0; i < numbers.length; i++){
             int start = i;
            for (int j =i; j< numbers.length ; j++){
                int end = j;
                currSum = start == 0 ? prefix [end] : prefix [end] - prefix [start -1];
                 //for ( int k = start; k <=end; k++){
                   // currSum += numbers[k];
               // }
                
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
 