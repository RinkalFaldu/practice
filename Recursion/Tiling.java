// given a 2 * n board and tiles of size 2 *1, count the number of ways to tile the given board using 
// the 2 * 1 tiles. (A tile can either be placed horizontally or veertically)
// 2 * 0 has 0 ways to place tiles
// 2 * 1 has 1 way to place tiles
// 2 * 3 has 3 ways to place tiles
// 2 * 4 has 5 ways to place tiles
package Recursion;

public class Tiling {
    public static int tilingProblem (int n){ // 2 * n (floor size)
        if (n == 0 || n == 1){
            return 1;
        }
        // vertical choice
        int veriticaltiling = tilingProblem(n-1);
        // horizontal choice
        int horizontaltiling = tilingProblem(n-2);

        int totalWays = veriticaltiling + horizontaltiling;
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(4));
        
    }
}
