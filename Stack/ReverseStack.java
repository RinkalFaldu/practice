package Stack;
import java.util.Stack;

// `pushBottom` only inserts **one element** at the bottom of the stack—it doesn't reverse the entire stack.

// To reverse the stack, you need `reverseStack` to **repeatedly** pop each element from the top and push it to the bottom using `pushBottom`. Here's the flow:

// 1. `reverseStack` pops element from top
// 2. Recursively calls itself on remaining elements
// 3. Uses `pushBottom` to insert the popped element at the bottom
// 4. Repeat for all elements → entire stack is reversed

//Without `reverseStack`, you'd have no way to reverse all elements. `pushBottom` is a helper tool that `reverseStack` uses to achieve the full reversal.

public class ReverseStack {
    public static void pushBottom (Stack<Integer> s, int data){     //
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushBottom(s, data);
        s.push(top);

    }
    public static void reverseStack (Stack<Integer> s){
        if (s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushBottom(s, top);
    }
    public static void printStack(Stack<Integer> s){
        while (!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
       
        reverseStack(s);
        printStack(s);
    }
    
}
