import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       System.out.print("Enter a number for factorial: ");
       int number = sc.nextInt();
       int factorial = 1;
    
       for (int i = 1; i <= number; i++){
            factorial*=i;
               
        }
       System.out.print("Factorial of " + number +" is:" + factorial);
    }
}
