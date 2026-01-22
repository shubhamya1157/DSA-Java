class Node{

int val;
Node next;

Node(int val){
    this.val = val;

   }
}

public class FindByIndex{

// using recursion-

// public static void DisplayListUseRec(Node head){
//     if(head == null){
//         return;
//     }

    // reverce of link list-
// DisplayListUseRec(head.next);

// System.out.print(head.val  + " ");

// return;
// }

 public static void Displaylist(Node head ,int n){
    Node temp = head;

 for(int i = 0; i < n; i++){
        temp = temp.next;

 }
        System.out.print(temp.val);


   
 }


  public static void main(String args[]){
  Node a = new Node(10);
  Node b = new Node(20);
  Node c = new Node(30);
  Node d = new Node(40);
  Node e = new Node(50);



a.next = b;
b.next = c;
c.next = d;
d.next = e;



Displaylist(a , 2);
// DisplayListUseRec(a);



    }
}