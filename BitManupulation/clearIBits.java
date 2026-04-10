package BitManupulation;

public class clearIBits { 
    // this function clears bit until i from last
    public static int clearBits (int n, int i){
             int bitMask = (~0)<<i;
             return n & bitMask;
    }
    public static void main(String[] args) {
        // 1111 = 1100(12)
        System.out.println(clearBits(15,2));
        
    }
}
