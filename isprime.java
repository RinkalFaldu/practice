import java.util.*;
public class isprime {
    public static boolean isPrime (int n){
        // corner case 2
        if ( n == 2){
            return true;
        }
        // brute force approch is run loop untill n-1
        // running loop untill math.sqrt (n) is optimize aproach
        for (int i=2; i <= Math.sqrt(n); i++ ){
            if (n % i == 0){
                return false;      //not prime number
            }
        }
         return true;            //prime number
    }

    public static void primeInRange (int n){
        for ( int i =2; i <=n; i++){
            if (isPrime(i) == true){
                System.out.print( i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        primeInRange (100);   
    }
    
}
