// formula to calculate binomial coefficient
// ncr = n! / r! ( n-r)!

public class binomialcoefficient {

    public static int factorial (int n){
        int factorial = 1;
        for (int i = 1; i<=n; i++ ){
            factorial*=i;
            
        }
        return factorial;
    }


    public static int Binomial (int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial (r);
        int fact_nminusr = factorial (n -r);

        int bincoeff = fact_n /(fact_r * fact_nminusr);
        return bincoeff;


    }
    
    public static void main(String[] args) {
        System.out.println(Binomial (5, 2));
        
    }
}
