// -x = ~x + 1;
// -~x = x + 1 (by replacing x by ~x)
package BitManupulation;

public class AddOne {
    public static void main(String[] args) {
        int x=6;
        System.out.println(x+" + "+1+" is "+-~x);
        x= -4;
        System.out.println(x+" + "+1+" is "+-~x);
        x=0;
        System.out.println(x+" + "+1+" is "+-~x);

    }
    
}
