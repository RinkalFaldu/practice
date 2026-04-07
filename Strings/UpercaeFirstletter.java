// Input : hi, i am rinkal
// Output: Hi, I Am Rinkal
// it converst first letter of word into upercase
// time complexity O(n)
package Strings;
public class UpercaeFirstletter {
    public static String UpperCase (String str){
        StringBuilder sb = new StringBuilder("");

        // conversting first character to upercase
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i =1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length() -1){
                sb.append (str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));   
            }
            else{
                sb.append(str.charAt(i));
            }
        }
       return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hi, i am rinkal";
        System.err.println(UpperCase(str));
    }
}