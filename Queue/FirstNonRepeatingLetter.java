package Queue;
import java.util.*;
// most of the time whever stream of charcter given in question use queue
// time complexity is O(n)
// first non-repeating letter in a stream of characters
// step 1- create frequence array of size 26
// step 2 -create queue
// step 3 - run for loop on string
// in each iteration of loop 
// step 4- store character in ch
// step 5 - add ch in queue
// step 6 - increase frequence 
// step 7 remove element from queue untill find whose frequence is one or less than 1 by this step if quee gets empty return -1


public class FirstNonRepeatingLetter {
    public static void printNonRepeating (String str){
        int freq[] = new int [26];
        Queue<Character> q = new LinkedList<>();

        for (int i =0; i<str.length(); i++){
            char ch = str.charAt(i);  // store ith char in ch
            q.add(ch);                // add ch in queue 
            freq[ch-'a']++;           // increase frequenc of ch

            while (!q.isEmpty() && freq[q.peek() -'a'] >1){         // this while loop run untill queue is not empty and find element whose frequence is greater than 1
                q.remove();      // if frequence is greater than 1 remvoe
            }
            if (q.isEmpty()){
                System.out.println(-1 + " ");
            } else {
                System.out.println(q.peek() + " ");
            }

        }
        System.out.println();
    }
    public static void main(String[] args) {
        String str = "aabccxb";
        printNonRepeating(str);
    }
    
}
