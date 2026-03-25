class Node{
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val = val;
    }
}

public class sizeOfBT{

    // static void displayNode(Node root){
    //     if(root == null) return;
    //     System.out.print(root.val + " ");
    //     displayNode(root.left);
    //     displayNode(root.right);
    // }

    static int sizeOfTree(Node root){
        if(root == null) return 0;
        return 1 + sizeOfTree(root.left)+sizeOfTree(root.right);
    }

    public static void main(String[] args){
        
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;

        System.out.print(sizeOfTree(a));

    }
}
