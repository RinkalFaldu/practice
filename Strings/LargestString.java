// to find largest string it compares string in terms of it's letters means a < b < c... 
// not interms of number of letters in strings
// this compareTo methode compare two strings lexicographicaly means it compares each character of string with other string
package Strings;

public class LargestString {

    public static void main(String[] args) {
        String fruits [] = {"apple", "mango", "banana"};
        String largest = fruits[0];
        for (int i =1; i< fruits.length; i++){
            if (largest.compareTo (fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
    
}
