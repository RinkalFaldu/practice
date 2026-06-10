package Stack;
import java.util.Stack;
// duplicate is true  if parentheses exist without any character, operands, operator in middle e.g. ((a+b)) this is dublicate because of extra prarentheses outside
// e.g. ((a+b) +) we need to have something in between opening and closing
// opening parentheses , operands (characters), operator (+, -, *, /) push in stack
//  whenver we get closing we strt increasing count  items untill find opening 
// count < 1 means duplicate
// time complexity = O(n)

public class DuplicateParentheses {
    public static boolean isDuplicate(String str){
        Stack <Character> s = new Stack<>();

        for (int i =0; i<str.length(); i++){
            char ch = str.charAt(i);

            if (ch == ')'){
                int count =0;
                while (s.peek() != '('){  // this loop find closing and increasing count untill closing find
                    s.pop();
                    count++;
                }
                if (count <1){
                    return true;
                } else{
                    s.pop(); // here we doing pop of if opeing prentheses closing
                }
            } else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "((a+b))"; // true
        String str2 = "(a-b)"; // false
        System.err.println(isDuplicate(str2));
        
    }
    
}
