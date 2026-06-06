// time complexity O(2^n+m)
package Backtracking;

public class GridWays {
    public static int gridWay (int i, int j, int n, int m){
        // int i = current row and = current col basically it's ij is current cell
        if (i == n-1 && j == m -1){
            return 1;
        } else if (i == n || j == n){
            return 0;

        }
        int down = gridWay(i+1, j, n, m);
        int right = gridWay(i, j+1, n, m);
        return down + right;
    }

    public static void main(String[] args) {
        int n =3, m =3;  // n = row, m = col
        System.out.println(gridWay(0, 0, n, m));
        
    }
    
}
