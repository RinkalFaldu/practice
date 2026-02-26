// conver 101 binary number to decimal
// 1(2^2) + 0(2^1) + 1(2^0)
public class binarytodecimal {
     
    public static void binToDec (int binNum){
        int myNum = binNum;     // it store original binary number because we making changes in binNum and we want to print original binary number in last
        int pow =0;
        int decNum = 0;

        while (binNum > 0){
            int lastDigit = binNum % 10;     // access the last digit of number
            decNum = decNum + (lastDigit *(int) Math.pow (2, pow));
            pow++;
            binNum = binNum/10;  // remove last digit from number to get next last

        }
        System.out.println("decimal of " + myNum + " = " + decNum);
    }
    public static void main(String[] args) {
       binToDec(101);
        
    }
    
}
