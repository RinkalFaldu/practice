// this code finds largest and smallest value from given array
// this code prints following output using input int numbers[] = {1,2,6,3,5};
// Smallest value is: 1
// Largest value is: 6
package Arrays;
import java.util.*;
public class LargestNumber {
    public static int getLargest (int numbers []){
        int largest = Integer.MIN_VALUE; // storing minimum value in variable -infinity
        int smallest = Integer.MAX_VALUE; // storing maximum value + infinity

        for ( int i =0; i<numbers.length; i++){
            if (numbers[i] > largest){
                largest = numbers[i];
            }
            if (smallest > numbers [i]){
                smallest = numbers [i];
            }
        }
        System.out.println("Smallest value is: " + smallest );
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,6,3,5};
        System.out.println("Largest value is: " + getLargest(numbers));
        
    }
    
}
