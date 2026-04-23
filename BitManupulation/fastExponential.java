// 5 ^ 3
// 5 ^ 0 1 1
// time complexity = O (log n)
// it is faster than normal algorithem O (n)

package BitManupulation;

public class fastExponential {
    public static int fastExpo (int a, int n){
        int ans = 1;
        while ( n > 0){
            if ( (n & 1) != 0){
                ans = ans * a;
            }
            a = a * a;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fastExpo(5, 3));
        
    }
    
}
