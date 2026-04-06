// this string Builder changed next string without copeing previous string
// it modift directly in next string without making copy of previous string

package Strings;
public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder ("");
        for (char ch = 'a'; ch<='z'; ch++){
            sb.append(ch);
        }
        
        System.out.print(sb);
    }
}