// time complexity = O(n)
// space complexity = O(n)
package Recursion;

public class SumofNumber {
    public static int Sum (int n){
       if ( n == 0 || n == 1){
        return n;
       } 
       int Sumof_n_minus_one = Sum(n-1);
       int sn = n + Sumof_n_minus_one;
       return sn;

       //return n + Sum(n -1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Sum(n));
        
    }
    
}
