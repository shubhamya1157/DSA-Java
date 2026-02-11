/*
// A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class SumOfNode {
    // Function to return sum of all nodes of a binary tree
    static int sumBT(Node root) {
        // Your code here
        return (root == null) ? 0 : (root.data+sumBT(root.left)+sumBT(root.right));
    }
}
