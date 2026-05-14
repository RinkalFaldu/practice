// fibonacci Number : 0 1 1 2 3 5 8 13 21
// number at ith position is sum of 2 previous number 
// time complexity O(2^n)
package Recursion;

public class FibonacciNumber {
    public static int fib(int n){
        if (n == 0 || n == 1){
            return n;
        }
        int fibn = fib(n - 1) + fib (n -2);
        return fibn;
    }
    public static void main(String[] args) {
        int n = 8;
       // this prints only nth fib number
       System.out.println(fib(n));
       // this for loop print full series untill nth number
       for (int i = 0; i <= n; i++) {
            System.out.print(fib(i) + " ");
        }

        
    }
    
}
