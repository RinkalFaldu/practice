// Leetcode problem 191: Number of 1
// n = 11 = 1 0 1 1
//  n & 1 keep last digit one if it is all other element become 0
//       1 0 1 1
// &1    0 0 0 1 (increase count) 
// n>>1=  1 0 1 (it removes last 1)
// &1     0 0 1
//        0 0 1 (increase count)
// n>>1     1 0
// &1       0 0 (count stays same)
// n>>1       1
//&1          1 (count increase)

package BitManupulation;

public class NumberofOneBit {
    public static int hammingWeight(int n) {
        int count = 0;
        while (n!= 0){
            if ( (n & 1) == 1){
                count++;
            }
            n>>=1;
        }
      return count;
    }

    public static void main(String[] args) {
        int n = 11;
        System.out.println(hammingWeight(n));
    }
    
}
