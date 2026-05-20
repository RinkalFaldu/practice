// you are given a number (eg. - 2019), convert it into String of english like 'tow zero one nine' use a recursive function to solve this problem
// Note - The digit of the number will only be in the range 0 -9 and the last digit of a number can't be 0.
// time complexity O(number of digits)
// space complexity O(1)
package Recursion;

public class NumberToString {
    public static void NtoS (int number){
        String [] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        if (number == 0){
            return;
        }
        int digit = number % 10;
        NtoS(number/10);
        System.out.print(str[digit] + " ");
    }
    
    public static void main(String[] args) {
        NtoS(2019);
    }
    
}
