// to represent any integer into binary we need log base 2 n + 1
// time complexity of this program is O (log n)
package BitManupulation;

public class CountOneBit {
    
    public static int countSetBitInNumber (int n){
        int countOneBit = 0;
        while (n > 0){
            if ((n & 1) == 1){
                countOneBit++;
            }
           n= n>>1;

        }
        return countOneBit;

    }
    public static void main(String[] args) {
        System.out.println(countSetBitInNumber(14));
        
    }
    
}
