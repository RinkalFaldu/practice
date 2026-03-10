// time complexity of this code is O (n^2)
// input : int array [][] = {  {4,7,8},
//                           {8,8,7}, };
// output : In given array 7 Appear  2                    

package TwoDArray;

public class CountSeven {
    public static int Count (int[][] array){
        int count = 0;
        for (int row = 0; row<= array.length -1; row++){
            for ( int col = 0; col <= array [0].length -1; col++){
                   if (array [row][col] == 7){
                    count++;
                    }
            }
        }
       return count;
    }

    public static void main(String[] args) {
        int array [][] = {  {4,7,8},
                            {8,8,7},
                         };
       System.out.println("In given array 7 Appear  " + Count(array)); 
        
    }
    
}
