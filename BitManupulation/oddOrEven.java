// odd number have right most bit (last bit) 1, and even number's right most bit is 0
// to get last bit of binary number we did number & 1 (this keeps last bit as 1 or 0 and make other previous bit 0)
package BitManupulation;

public class oddOrEven {
    public static void oddorEven (int n){
        int bitMask = 1;
        if ((n & bitMask) == 0){
            System.out.println(n + " is even number");
        }
        else {
            System.out.println(n + " is odd number");
        }
    }
    public static void main(String[] args) {
        oddorEven(15);
        oddorEven(30);
        oddorEven(10);
    }
}
