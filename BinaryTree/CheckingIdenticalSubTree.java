package BinaryTree;

public class CheckingIdenticalSubTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean isIdentical (Node node, Node subRoot){
        if (node == null && subRoot == null){
            return true;
        }
        else if (node == null || subRoot == null || node.data != subRoot.data){
             return false;
        } 
        if (!isIdentical(node.left, subRoot.left)){
            return false;

        } if (!isIdentical(node.right, subRoot.right)){
            return false;
        }
        return true;
    }
    public static boolean isSubtree(Node root, Node SubRoot){
        if (root == null){
            return false;
        }

        if (root.data == SubRoot.data){
            if (isIdentical (root, SubRoot)){
                return true;
            }
        }
       boolean leftAns = isSubtree(root.left, SubRoot);
       boolean rightAns = isSubtree(root.right, SubRoot);
       return leftAns || rightAns;
    }

    public static void main(String[] args) {
        
    // main tree
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

    Node SubRoot = new Node(2);
    SubRoot.left = new Node(4);
    SubRoot.right = new Node(5);
    System.out.println(isSubtree(root,SubRoot));

    }
    


    
}
