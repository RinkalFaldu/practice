package Backtracking;

public class PrintOneSolutionNQueen {
    public static boolean isSafe(char board[][], int row, int col){
       // vertical up
       for (int i = row-1; i>=0; i--){
        if (board[i][col] == 'Q'){
            return false;
        }
       }
       // diag left up
       for (int i = row -1, j = col -1; i>=0 && j >=0; i--, j--){
           if (board[i][j] == 'Q'){
            return false;
           }
        
       }
       // diag right up 
       for (int i = row -1, j = col +1; i>=0 && j < board.length; i--, j++){
           if (board[i][j] == 'Q'){
            return false;
           }
        
       }
       return true; 

    }


    public static boolean nqueens(char board[][], int row){
        // base case
        if (row == board.length){
            // printBoard(board);
            //count++;
            return true;

        }
        // column loop
        for(int col =0; col<board.length; col++){
            if (isSafe(board, row, col) == true){
                board[row][col] = 'Q';
               if(nqueens(board, row+1)){
                return true;
               }
                board[row][col] = 'X';    // backtracking
            }
              
        }
        return false;
    }
    public static void printBoard (char board[][]){
        System.out.println("______________________ chess board ____________________");
        for (int i =0; i<board.length; i++){
            for (int j =0; j<board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int count;
    public static void main(String[] args) {
        int n =4;
        char board[][] = new char[n][n];
        for (int i =0; i<n; i++){
            for(int j =0; j<n; j++){
                board[i][j] = 'X';
            }
        }
       if( nqueens(board, 0)) {
            System.out.println("solution is possible");
            printBoard(board);
       }else{
        System.out.println("solution is not possible");
       }
       // System.out.println("total ways to solve n queens =" + count);
    }
    
    
}
