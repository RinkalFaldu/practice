//this code prints
//1
//1  2
//1  2  3
//1  2  3  4
public class halfpyramid {
    public static void main(String[] args) {
        
        for ( int line = 1; line <=4; line++){
            for (int number=1; number <=line ; number++){
                System.out.print(" " +number + " ");
            }
            System.out.println();
        }
    }
    
}
