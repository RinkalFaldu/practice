package TwoDArray;

public class Transpose {
    public static int[][] Trans (int [][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        int [][] transpose = new int [m][n];
        for (int i =0; i<n; i++){
            for (int j = 0; j<m; j++){
               transpose [j][i] = matrix [i][j];
            }
        }
        return transpose;
    }

    public static void printMatrix (int [][] matrix){
        for (int i =0; i < matrix.length;i++){
            for (int j =0; j< matrix [0].length; j++){
                System.out.print(matrix [i] [j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix [][] =  {{2,4,-1},
                            {-10,5,11},
                            {18,-7,6},   
                            };
        
        printMatrix(Trans(matrix));
       
    }
    
}
