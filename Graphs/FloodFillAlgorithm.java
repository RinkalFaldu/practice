package Graphs;
// given a m * n integer grid image where image [i][j] represents the pixel value of the image.
// you are also given three integers sr, sc, and color. you should perform a flood fill on the image starting from the pixel image [sr][sc].
// To perform a flood fill consider the starting pixel, plus any pixels connected 4 -directionally to the starting pixel of the same color as the starting pixel,
//  plus any pixels connected 4 directionally to those pixels (also with the same color) and so on. replace the color of all of the aforementioned pixels with color.

// O
public class FloodFillAlgorithm {
    
    
    public void  helper (int [][] image, int sr, int sc, int color, boolean vis[][],int orgcol ){
        if (sr < 0 || sc <0 || sr >= image.length || sc >= image[0].length || vis[sr][sc] || image[sr][sc] != orgcol){
            return;
        }
        helper(image, sr, sc-1, color, vis, orgcol); // left
        helper(image, sr, sc+1, color, vis, orgcol); // right
        helper(image, sr-1, sc, color, vis, orgcol); // up
        helper(image, sr+1, sc, color, vis, orgcol); // left   
           
    }
    
    public int [][] floodFill (int [][] image, int sr, int sc, int color){
        boolean vis[][] = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, vis, image[sr][sc]);
        return image;
    }
    public static void main(String[] args) {
        
                 
    int image [][] = {{1, 1, 1},
                       {1, 1, 0},
                       {1, 0, 1}};
    int sr =1;
    int sc =1;
    int color =2;
    }
    
}
