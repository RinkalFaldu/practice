// bit oerator works wih binary numbers
// and                     or                  XOR                   ~
// 0 & 0 = 0            0  | 0 = 0            0 ^ 0 = 0           ~0 = 1
// 0 & 1 = 0            0  | 1 = 1            0 ^ 1 = 1           ~1 = 0
// 1 & 0 = 0            1  | 0 = 1            1 ^ 0 = 1
// 1 & 1 = 1            1  | 1 = 1            1 ^ 1  = 0
//
//    0 1 0 1 (5)       0 1 0 1 (5)           0 1 0 1 (5)       ~(0 0 0 0)(0)
// &  0 1 1 0 (6)    |  0 1 1 0 (6)        ^  0 1 1 0 (6)         1 1 1 1 (-1)
//  = 0 1 0 0 (4)    =  0 1 1 1 (7)           0 0 1 1 (3)

// Binary Left shift <<                                               Binary right shift >>
// (this removes first two bit and move next bit left side            this removes first b bit from right and move next bit right side 
// two place and last two left over space filed with 0)                left over b space filed with 0
// a << b = a * 2^b                                                    a >> b = a/ 2^b
// 5<<2                                                                5 >> 2  
//    0 0 0 1 0 1 (5)                                                  0 0 0 0 0 1 0 1 (5)
// << 0 1 0 1 0 0 (20)                                                 0 0 0 0 0 0 0 1 (1)


package BitManupulation;

public class ithBit {
    // this function gives ith bit
    // it converst other bit into 0 not ith bit 
    // and check ith bit is 0 or 1
    public static int getIthBit (int n, int i){
        int bitMask = 1<<i;     // this gives ith bit
        if ((n & bitMask) == 0){
            return 0;
        } else {
            return 1;
        }
    }

    // this function convert ith bit into 1
    // it do | to keep other bit same but change only ith bit
    // 1 0 1 0 = 1 1 1 0
    public static int setIthBit (int n, int i){
        int bitMask = 1<<i;       // this gives ith bit
        return n | bitMask;
    }

    // 1 0 1 0 = 1 0 0 0 
    // it makes ith bit into 0
    public static int clearIthBit (int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    
    // this convrts ith bit into new bit it could be anything 0 0r 1
    public static int updateIthBit (int n, int i, int newBit){
        n = clearIthBit(n, i);
        int BitMask = newBit<<i;
        return n | BitMask;

    }

    public static void main(String[] args) {
        System.out.println(getIthBit(10, 2));
        System.out.println(getIthBit(10, 3));
        System.out.println(setIthBit(10, 2));
        System.out.println(clearIthBit(10,1));
        System.out.println(updateIthBit(10, 2, 1));
        
        // binary 10 = 1 0 1 0 and it count bit from right so 2nd bit is 0
    }
    
}
