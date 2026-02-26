public class factorialfunction {

    public static int factorial (int n){
        int factorial = 1;
        for (int i = 1; i<=n; i++ ){
            factorial*=i;
            
        }
        return factorial;
    }

    public static void main(String[] args) {
        
        System.out.println(factorial(5));
    }
    
}
