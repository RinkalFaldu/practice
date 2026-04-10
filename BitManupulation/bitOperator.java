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

public class bitOperator {
    public static void main(String[] args) {
        System.out.println(5 & 6);      // and operator
        System.out.println(5 | 6);      // or operator
        System.out.println(5 ^ 6);      // XOR operator
        System.out.println(~0);        // Binary one's complement   
        System.out.println(5<<2);        // Binary one's complement 
        System.out.println(5>>2);        // Binary one's complement   
  

 
    }
    
}
