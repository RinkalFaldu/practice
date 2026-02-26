// in this problem i am doing the reverse of number  without printing reverse number
public class riversesamenum{
    public static void main(String[] args) {
        int n = 10899;
        int rev = 0;
        while (n > 0) {
            int lastDigit = n % 10;        //find last digit 
            rev = rev * 10 + lastDigit;
            n = n / 10;          // remove last digit 
        }
        System.out.println(rev);
    }
}