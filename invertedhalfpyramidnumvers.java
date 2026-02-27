// this code prints following patter
// 1 2 3 4 5 6 7 
// 1 2 3 4 5 6
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1 


public class invertedhalfpyramidnumvers {

    public static void pyramid (int n){
        for ( int i =1; i<=n; i++){  //lines
             //inner - numbers
            for (int j =1; j<=n-i+1; j++){
                System.out.print( j + " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        pyramid (7);
    }
    
}
