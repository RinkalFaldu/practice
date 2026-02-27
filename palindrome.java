// this code checkes if given number is palindrome or not e.g. 123321
public class palindrome {

    public static void isPalindrome (int number){
        int mynum = number;
        int reverse = 0;
        while (number > 0){
        int lastdigit = number /10;
        reverse = reverse * 10 + lastdigit;
        number = number/10;
        }
        if (number == reverse){
            System.out.println(mynum + " is a palindrom");
        }
        else{
            System.out.println(mynum + " is not palindrom");
        }
    }
    public static void main(String[] args) {
          isPalindrome(321);
    
    }
}
