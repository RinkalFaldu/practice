package BitManupulation;

public class SwapNumber {
    public static void main(String[] args) {
        int a = 15;
        int b = 20;
        System.out.println("Before swap Number a is: " + a + " Before swap Number b is " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swap Number a is: " + a + " After swap Number b is " + b);

        a = a + b;
        b = a -b;
        a = a - b;
        System.out.println("After adition and supraction swap Number a is: " + a + " After adition and supraction swap Number b is " + b);


    }
    
}
