// this code converts decimal to binary
  // formula for conversion 75
// Divide 75 by 2:
//Quotient = 37, Remainder = 1.
//Divide 37 by 2:
//Quotient = 18, Remainder = 1.
//Divide 18 by 2:
// Quotient = 9, Remainder = 0.
//Divide 9 by 2:
//Quotient = 4, Remainder = 0.
 //Divide 4 by 2:
 //Quotient = 2, Remainder = 0.
 //Divide 2 by 2:
 //Quotient = 1, Remainder = 0.
 //Divide 1 by 2:
 //Quotient = 0, Remainder = 0.

import java.util.*;
public class decimaltobinary {
    // binary to decimal 
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

    
    // decimal to binary
    public static void decToBin(int decNum){ 
        int myNum = decNum;
        int binNum = 0;
        int pow = 0;
        
        while(decNum > 0){
            int remeinder = decNum % 2;        // to get remainder
            binNum = binNum + (remeinder * (int)Math.pow (10, pow));
            pow++;
            decNum= decNum/2;    //to get quotient
        }
        System.out.println("binary form of " + myNum + " = " + binNum);
    }
    public static void main(String[] args) {
        decToBin(75);
        binToDec(1001011);
    }
}
