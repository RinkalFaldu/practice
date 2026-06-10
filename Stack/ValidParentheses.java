package Stack;
import java.util.Stack;
// push all opening bracket in stack
// check for closing bracket that it is on top of stack if yes move to next check other wise return false
// in last check that stack is empty if yes return true else return false
// time complexity is O(n)

public class ValidParentheses {
    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();

        for (int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '['){ // opening
                s.push(ch);
            } else{
                // closing 
                if (s.isEmpty()){
                    return false;
                }
                if((s.peek() == '(' && ch == ')' ) 
                  || (s.peek() == '{' && ch == '}') 
                  || (s.peek() == '[' && ch == ']')){
                  
                 s.pop();
                } else {
                    return false;
                }
            }
        }
        if (s.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        String str = "({})[]";
        System.out.println(isValid(str));
        
    }
    
}
