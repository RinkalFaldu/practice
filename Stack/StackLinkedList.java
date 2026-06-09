package Stack;

import java. util.ArrayList;
import java.util.Stack;


public class StackLinkedList {
    static class Node {
        int data;
        Node next;
        Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    static class stack {
        
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push (1);
        s.push(2);
        s.push(3);
        
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        
    }
    
}

    

