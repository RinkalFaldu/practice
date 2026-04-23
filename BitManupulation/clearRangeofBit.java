package BitManupulation;

public class clearRangeofBit {
    public static int clearRangeBit (int n){
        for (int i= 2; i< 4; i++){
            int bitMask = ~(1<<i);      // this makes it ith  to 0 and other bits are 1            
             n = n & bitMask;
        }
    return n;
    }
    
    // this function do the same thing but different way
    public static int clearIBits (int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i) -1;
        int bitMask = a | b;
        return n & bitMask;

    }

    public static void main(String[] args) {
        System.out.println(clearRangeBit(10));
        System.out.println(clearIBits (10, 2, 4));
        
    }
    
}
