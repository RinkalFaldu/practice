package Backtracking;


public class keypadSolution {
    final static char[][] L = {{}, 
    {}, 
    {'a', 'b', 'c'}, 
    {'d', 'e', 'f'},
    {'g', 'h', 'i'}, 
    {'j', 'k', 'l'}, 
    {'m', 'n', 'o'},
    {'p', 'q', 'r', 's'}, 
    {'t', 'u', 'v'}, 
    {'w', 'x', 'y','z'}};

    public static void letterCombinations (String number){
        int length = number.length();
        if (length == 0){
            System.out.println( "");
            return;
        }
        bfs (0, length, new StringBuilder(), number);

    }
    public static void bfs (int pos, int length, StringBuilder sb, String number){
        if (pos == length){
            System.out.println(sb.toString());
        }
        else {
            //Character.getNumericValue converts particular digit in integer  
            char[]letters = L [Character.getNumericValue(number.charAt(pos))];
            for (int i =0; i<letters.length; i++){
                bfs(pos+1, length, new StringBuilder(sb).append(letters[i]), number);
            }
        }
    }
    public static void main(String[] args) {
        letterCombinations("23");
        
    }
    
}
