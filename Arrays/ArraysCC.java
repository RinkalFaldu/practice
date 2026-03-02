
package Arrays;
import java.util.*;

public class ArraysCC {

    public static void main(String[] args) {
        
        int marks[] = new int [100];
        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("physics makrs: " + marks[0]);
        System.out.println("Maths marks: " + marks[1]);
        System.out.println("Science marks: " + marks[2]);

        marks[2] = 100;
        System.out.println("Science marks: " + marks[2]);

    }
    
}