//'A' -> 01000001 = 65
//' ' -> 00100000 = 32
// ----------------
//OR   -> 01100001 = 'a' = 97

package BitManupulation;

public class ConvertUperCaseToLowercase {
    public static void main(String[] args) {
        
        for(char ch='A';ch<='Z';ch++) {
        System.out.print((char)(ch|' ') + " "); // prints abcdefghijklmnopqrstuvwxyz
        }
   }
    
}
