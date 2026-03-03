// formula to calculate trapping rain water = ( water level - bar height) * width 
// water level = min ( max left boundry , max right boundry)
// time complexity = O (n)
package Arrays;

public class trappingRainwater {
    public static int trappedRainwater (int height []){
        int n = height.length;
        // calculate left max boundary - array
        int leftmax[] = new int [n];
        leftmax [0] = height [0];              // max of first element is element it self

        for ( int i =1; i < n; i++){
            leftmax [i] = Math.max(height [i], leftmax[i -1]);
            
        }
        // calculate right max boundary - array

        int rightmax[] = new int[n];
        rightmax[n-1] = height [ n -1];
        for ( int i = n-2; i >=0; i-- ){
            rightmax [i] = Math.max (height [i], rightmax [i+1]);

        }
        int trappedwater = 0;
        // loop
        for ( int i =0; i <n; i++){
            // water level = min ( lefmax boundary, rightmax boundary)
            int waterlevel = Math.min (leftmax [i], rightmax [i] );
            // trapped water = water level - height [i]
            trappedwater += waterlevel - height [i];
        }
        return trappedwater;

    } 
    public static void main(String[] args) {
        int height[] = { 4,2,0,6,3,2,5};
        System.out.println(trappedRainwater(height));
        
        
    }
    
}
