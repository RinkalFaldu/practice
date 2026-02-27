// this code prints following pattern
//        *
//        **
//        ***
//        ****
//        *****
//        ******
//        *******

public class invertedhalfpyramid {
    public static void half_pyramid(int n){
        for (int row = 1; row <=n; row++){
            //spaces
            for ( int j =1; j<=n-1; j++){
                System.out.print(" ");
            }
            //stars
            for ( int j =1; j <=row; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        half_pyramid(7);
    }
    
}
