import java.util.*;
public class sumoddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int evensum = 0;
        int oddsum = 0;
        int choice;
        
        do {
        System.out.print ("Enter numbers : ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            evensum+= number;
        }
        else {
            oddsum+= number;
        }

        System.out.print (" choose option: press 1 to continue , press 0 to decline ");

        choice = sc.nextInt();
        }
        while (choice == 1);
        System.out.println("Sum of even numbers: "+ evensum);
        System.out.println("Sum of odd numbers: "+ oddsum);

    }
}