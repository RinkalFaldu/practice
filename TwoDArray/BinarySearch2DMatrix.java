// leetcode problem 74 : search a 2D matrix
// time complexity of this code is O(log (m*n))
package TwoDArray;

public class BinarySearch2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;
        int high = matrix.length -1;
        int correctRow =0;
        int colhigh = matrix [0].length -1;
        int collow = 0;
        // this loop find correct row where target can found 
        while ( low <= high){
            int mid = low + ( high - low)/2;
            if (matrix [mid][0] <= target){
                correctRow = mid;
                low = mid +1;
            }
            else {
                high = mid -1;
            }
        }
        // this loop traverse particular row found above and using binary search on particular row 
        // target found apply binary search on particular row
        while (collow <= colhigh){
            int colmid = collow + (colhigh - collow)/2;
            if (matrix [correctRow][colmid] == target){
                 return true;
            }
            else if (target <= matrix [correctRow][colmid] ){
                colhigh = colmid -1;
            }
            else {
                collow = colmid +1;
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix [][] = {  {1,3,5, 7},
                            {10,11,16,20},
                            {23,30,34,60}
                         };
        int target = 3;
       System.out.println(searchMatrix(matrix, target)); 

    }
    
}
