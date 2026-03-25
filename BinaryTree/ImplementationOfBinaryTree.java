//Creating tree and traversing the tree

//creating Node class
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}

public class ImplementationOfBinaryTree{

     //Printing TREE using recursion
     private static void display(Node root){

        //Base condition
        if(root == null) return;
        System.out.print(root.val+" ");
        display(root.right);
        display(root.left);
        return;
     }
    public static void main(String[] args){
   //        TREE

//           7

//    4               3

// 1       3      2          1


     //Creating Node
     Node a = new Node(7);
     Node b = new Node(4);
     Node c = new Node(3);
     Node d = new Node(1);
     Node e = new Node(3);
     Node f = new Node(2);
     Node g = new Node(1);

     //Connecting Node
     a.left = b;  a.right =c;
     b.left = d; b.right = e; 
     c.left = f; c.right = g;

    //Function call
     display(a);

    //Output:

    // 7 3 1 2 4 3 1

    }
}
