import java.util.Scanner;

public class table {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       System.out.print("Enter a number for table: ");
       int number = sc.nextInt();
       int multiply = 1;
       int i = 1;
       while (i <= 10){
            multiply = number * i;
            System.out.println(number + " * " + i + "  =  "+ multiply);
            i++;
       }
    }
}
