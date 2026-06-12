package BinaryTree;

public class CalculateHight {
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

    public static int height(Node root){
        if (root == null){
            return 0;
        }
        int leftHight = height(root.left);
        int rightHight = height (root.right);
       return Math.max (leftHight,rightHight) +1;
    }
    public static int count (Node root){ // it counts number of nodes in tree
        if (root == null){
            return 0;
        }
        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return leftCount + rightCount +1;
    }
    public static int sum (Node root){
        if (root == null){
            return 0;
        }
        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
       return leftSum + rightSum + root.data;
        
    }

    public static int diameter (Node root){  // O(n^2) not optimize
        if (root == null){
            return 0;
        }
        int leftDiam = diameter(root.left);
        int leftHight =height(root.left);
        int rightDiam = diameter(root.right);
        int rightHight = height(root.right);
        int sefDiam = leftHight + rightHight +1;
       return Math.max(sefDiam, Math.max(leftDiam, rightDiam));
    }
    static class Info {
         int diam;
         int height;

         public Info(int diam, int height){
            this.diam = diam;
            this.height  = height;
         }
    }
    public static Info diameter2(Node root){ // optimize O(n)
        if (root == null){
            return new Info (0, 0);
        }

        Info leftInfo = diameter2(root.left);
        Info rightInfo = diameter2(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.height + rightInfo.height + 1);
        int height = Math.max(leftInfo.height, rightInfo.height) +1;

        return new Info(diam, height);

    }

    public static void main(String[] args) {
        /*    1
            /   \
           2     3
          / \   / \
         4  5   6  7
         */
       
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

    System.out.println(height(root));
    System.out.println(count(root));
    System.out.println(sum(root));
    System.out.println(diameter(root));
    System.out.println(diameter2(root).diam);
    System.out.println(diameter2(root).height);


    }
    
}
