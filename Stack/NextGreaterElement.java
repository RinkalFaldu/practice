package Stack;
import java.util.Stack;

// steps to find next greater
// 1. remove all element form stack untill we find greater element than cuttent element of array or untill stack is empty
// 2. if stack get empty next greater is -1 else next greater is peak of stack
// 3. push current element is stack

// time complexity is O(n)

// different form of question like this
//  next greater from right
// next greater from left
// next smaller left


public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[] = {3, 2, 9, 11, 14,1};
        Stack<Integer> s = new Stack <>();
        int result [] = new int [arr.length];

        for (int i = arr.length -1; i>=0; i--){
            // step 1
            // this while loop run untill stack gets empty and untill it find element that greater than arr[i] 
            // we will push index of element in stack not element
            while (!s.isEmpty() && arr[s.peek()]<= arr[i]){
                s.pop(); 
            }
            // step 2
            if (s.isEmpty()){     // this condition runs when stack gets empty 
                result[i] = -1;
            } else {
                result[i] = arr[s.peek()];
            }

            // step 3
            s.push(i);
        }

        for (int i =0; i<result.length; i++){
            System.err.println(result[i] + " ");
        }
        System.out.println();
        
    }
}
