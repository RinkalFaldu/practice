package Backtracking;

public class NQueensInNRow {
   
    public static void nqueens(char board[][], int row){
        // base case
        if (row == board.length){
            printBoard(board);
            return;

        }
        // column loop
        for(int col =0; col<board.length; col++){
            board[row][col] = 'Q';
            nqueens(board, row+1);
            board[row][col] = 'X';    // backtracking

            
            
        }
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
    
    public static void main(String[] args) {
        int n =2;
        char board[][] = new char[n][n];
        for (int i =0; i<n; i++){
            for(int j =0; j<n; j++){
                board[i][j] = 'X';
            }
        }
        nqueens(board, 0);
        
    }

}
