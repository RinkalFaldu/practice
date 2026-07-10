package Tries;
// given a string of legth n of lowercase alphabet characters, we need to count total number of distinct substring of this string.
// to do this problem first take all sufix of given string and for all sufix take all prefix for each sufix
// "ababa" 
// sufix ababa   prefix  a, ab, aba, abab, ababa
// sufix baba,   prefix  b, ba, bab, baba
// sufix aba     prefix  a, ab, aba
// sufix  ba     prefix  b, ba
// sufix a       prefix a
// count only unique it gives 10 unique substring including empty string
// for unique prefix count total number of nodes

public class CountUniqueSubStrings {
    static class Node {
        Node [] children =new Node [26];
        boolean eow;
        

        public Node(){
            for (int i  =0; i<children.length; i++){
                children[i] = null;
            }
           
        }
    }
     public static Node root = new Node ();

     public static void insert (String word){
        int level =0;
        int len = word.length();
        int idx =0;
        Node curr = root;

        for ( ;level <len; level++){
             idx = word.charAt(level) -'a';
            if (curr.children[idx] == null){
                curr.children[idx] = new Node();

            } 
            
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean search (String key){ // doesn't need for this problem
        int level =0;
        int len = key.length();
        int idx =0;

        Node curr = root;
        for (; level <len; level++){
            idx = key.charAt(level)-'a';
            if (curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow == true;
    }
    
    public static int countNodes (Node root){
        if (root == null){
            return 0;
        }
        int count =0;
        for (int i =0; i< 26; i++){
            if (root.children[i] != null){
                count += countNodes(root.children[i]);
            }

        }
        return count+1;
    }
   

    public static void main(String[] args) {
        String str = "ababa";

        // sufix -> insert in trie
        for (int i =0; i< str.length(); i++){
            String sufix =str.substring(i);
            insert(sufix);
        }
        System.out.println(countNodes(root));
        
    }
    
}
