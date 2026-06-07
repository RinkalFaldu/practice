package Backtracking;

public class RatInMaze {
    public static void printSolution (int sol[][]){
        for (int i =0; i<sol.length; i++){
            for (int j =0; j<sol.length; j++){
                System.out.print(" " + sol[i][j] + " ");
            }
            System.err.println();
        }
    }

    public static boolean isSafe (int maze[][], int x, int y){
        // if x, y outside of maze length
        if (x >=0 && y >=0 && x< maze.length && y< maze.length && maze[x][y] == 1){
            return true;
        }
        return false;
    }
 public static boolean solveMaze (int maze[][]){
    int N=maze.length;
    int sol[][] = new int [N][N];
    if (mazeSolveUtil(maze, 0, 0, sol) == false){
        System.out.print("Solution does not exist");
        return false;
    }
    printSolution(sol);
    return true;
 }
    public static boolean mazeSolveUtil (int maze[][], int x, int y, int sol[][] ){
        // base case
        if (x == maze.length -1 && y == maze.length-1 && maze[x][y] == 1){
            sol[x][y] =1;
            return true;
        }
        // recursion
        // check if maze[x][y] is valid
        if (isSafe(maze, x,y) == true){
            if(sol[x][y] == 1){
                return false;
            }
            sol[x][y] =1;
            if(mazeSolveUtil(maze, x+1, y, sol)){
                return true;
            }
            if (mazeSolveUtil(maze, x, y+1, sol)){
                return true;
            }
            sol[x][y] =0;
            return false;
        }
        return false;

    }
    public static void main(String[] args) {
        int [][] maze = {{1,0,0,0}, {1,1,0,1}, {0,1,0,0}, {1,1,1,1}};
        solveMaze(maze);
        
    }
    
}
