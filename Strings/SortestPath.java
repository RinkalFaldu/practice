// given a route containing 4 directions (E,W, N, S), find the shortest path to reach destination.
//         N
//         |
//W - -  - | - - - - E  
//         |(0,0)
//         |
//         S
// used displacement formula to get final sortest path
// time complexity = O (n)

package Strings;

public class SortestPath {
    public static float getShotestPath(String path){
        int x =0;
        int y =0;
        for (int i =0; i<path.length(); i++){
            char dir = path.charAt(i);
            // south
            if (dir == 'S') {
                y--;
            }
            //North
            else if (dir == 'N'){
                y++;
            }
            //West
            else if (dir == 'W'){
                x--;
            }
            //East
            else {
                x++;
            }

        }
        int xsquare = x*x;
        int ysquare = y*y;
        return (float)Math.sqrt(xsquare + ysquare);

    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShotestPath (path));
        
    }
    
}
