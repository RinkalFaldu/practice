// in this problem i am going to print the reverse of a string
// if i want to last digit of number do num % 10
// to remove last digit of number do num / 10
 
public class printreverse {
    public static void main(String[] args) {
        int num = 10899;
        while(num > 0){
           int lastDigit = num % 10;        //find last digit
           System.out.print(lastDigit);
           num = num / 10;                   //remove last digit from number to get next last
        }
       System.out.println();
    }
}