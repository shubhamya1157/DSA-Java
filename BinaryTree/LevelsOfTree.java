//Finding levels of Tree

//creating Node class
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}

public class LevelsOfTree{

     //Finding levels of nodes using Recursion
     private static int levels(Node root){

        return (root == null) ? 0 : 1+Math.max(levels(root.left),levels(root.right));
     }
    public static void main(String[] args){
   //        TREE

//           7

//    4               3

// 1       3      2          0


     //Creating Node
     Node a = new Node(7);
     Node b = new Node(4);
     Node c = new Node(3);
     Node d = new Node(1);
     Node e = new Node(3);
     Node f = new Node(2);
     Node g = new Node(0);

     //Connecting Node
     a.left = b;  a.right =c;
     b.left = d; b.right = e; 
     c.left = f; c.right = g;

    //Function call
   System.out.print(levels(a));

    //Output:
    // 3

    }
}
