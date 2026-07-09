package Tries;
// Create a function boolean starts with (String prefix) for a trie.
// return true if there is previously inserted string word that has the prefix, and false otherwise.
// words [] = {"apple", "app", "mango", "man", "woman"}
// prefix = "app" output = true;   in list there is word start with app
// prefix = "moon" output = false;

public class StartsWithProblem {
    static class Node {
        Node [] children =new Node [26];
        boolean eow = false;
        int freq;

        public Node(){
            for (int i  =0; i<children.length; i++){
                children[i] = null;
            }
            freq =1;
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

    public static boolean startsWith (String prefix){
        Node curr = root;
        for (int i =0; i< prefix.length(); i++){
            int idx = prefix.charAt(i)-'a';
            if (curr.children[idx] == null){
                return false;
            }
            curr =curr.children[idx];
        }
        return true;
    }
    public static void main(String[] args) {
       String words [] = {"apple", "app", "mango", "man", "woman"};
       String prefix1 = "app";
       String prefix2 = "moon";
        for (int i =0; i< words.length; i++){
            insert(words[i]);
        }
        System.out.println(startsWith(prefix1));
        System.out.println(startsWith(prefix2));
    }
    
}
