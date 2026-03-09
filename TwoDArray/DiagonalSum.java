// this digonal sum only used for same numer of raw and columns 
// means n = m. e.g. 4 * 4
package TwoDArray;

public class DiagonalSum {     
    // function for brute force approach with time complexity O (n^2)
    public static int diagonalSum (int matrix [][]){
        int sum =0;
        // loop for primary diagonal top left to bottom right
        for ( int i =0; i < matrix.length; i++){
            for ( int j =0; j < matrix [0].length; j++){
                if (i ==j){
                    sum+= matrix [i][j];
                }
               else if (i + j == matrix.length -1 ){
                   sum+= matrix[i][j];
               }
            }

        }
        return sum;
    }
     // optimize approach to get diagonal sum with time complexity O(n)
    public static int sum (int matrix [][]){   
        int sum =0;
        for (int i =0; i < matrix.length; i++){
            // primary digonal
            sum+=matrix [i][i];
            if (i != matrix.length -1-i){
            // secondary digonal
            sum += matrix [i][matrix.length-i-1];
            }
        }
        return sum;

    }
    public static void main(String[] args) {
        int matrix [][] = { {1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16}
                            };
       System.out.println(diagonalSum(matrix)); 
       System.out.println(sum(matrix)); 

        
    }
    
}
