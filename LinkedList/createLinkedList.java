// creating linked list
//adding element in linkedlist at first and last
//printing linkedlist


//creating node class-initial step of making linkedlist
class Node{
    int val;
    Node next;

//making constructor

Node(int val){
    this.val  = val;
  }
}

//making LinkedList class

class LinkedList{
    Node head;
    Node tail;

//create function for adding element at last
void addAtLast(int val){

 Node temp = new Node(val);

if(tail == null){
    head = tail = temp;
}

else{
    tail.next = temp;
    tail = temp;
  } 

}

//create function for adding element at first
void addAtFirst(int val){

Node temp = new Node(val);

if(head == null){
    head = tail = temp;
}
else{

temp.next = head;
head = temp;

 }

}

//creating function for printing linked list-

void display(){
    if(head == null){
        System.out.print("No element in linkedlist");
        return;
    }
    Node temp = head;

    while(temp!=null){
System.out.print(temp.val + " ");
 temp = temp.next;
    }
 }

}

 public class createLinkedList{
    public static void main(String args[]){

//making obejet of name ll

LinkedList ll = new LinkedList();
ll.addAtFirst(20);//add first element 10
ll.addAtLast(30);//add last element 30
ll.addAtLast(40);//now the last element 40
ll.addAtFirst(10);//now first 10
ll.addAtLast(50);//now again last element is 50

//now the linkedlist is-
//10 20 30 40 50

ll.display();//calling function for display linkedlist





    }
}