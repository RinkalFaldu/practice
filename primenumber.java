// non primes                                                    primes 
// 4 = 1*4      6 = 1*6         9 = 1*9       12 = 1*12          2 = 2*1     3 = 3*1    5 = 5*1      7 = 7*1    9 = 9*1       11 = 11*1
// 4 = 2*2      6 = 2*3         9 = 3*3       12 = 2*6           2 = 1*2     3 = 1*3    5 = 1*5      7 = 1*7    9 = 1*9       11 = 1*11
// 4 = 4*1      6 = 3*3         9 = 9*1       12 = 3*4
//              6 = 6*1                       12 = 4*3
//                                            12 = 6*2
//                                            12 = 12*1
// in this code i tried to iterate loop to find multiple of n othe then 1 unitll sqrt of n 
import java.util.*;
public class primenumber {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       int n = sc.nextInt();
       boolean isPrime = true;
       
        if (n == 2){
        System.out.println( n + "is prime");
       }
       else {
        
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){                     //n is multiple of i ( i not equal to 1 or n )
                isPrime = false;
            }
        }
       
        if (isPrime == true){
            System.out.println(n + " is prime");
        }
        else {
            System.out.println( n + " is not prime");
        }
       }
    }
}