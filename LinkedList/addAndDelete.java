//Adding new element and deleting element at any index

class Node{
    int val;
    Node next;
 
Node(int val){
    this.val = val;

   }
}

class myLinkedList{
    Node head;
    Node tail;
//For counting length of linkedlist
    int size = 0;

//Adding element at head(first)
void addAtFirst(int val){
    Node temp = new Node(val);

if(head == null){

  head = tail = temp;

}

else{
 temp.next = head;
 head = temp;

 }
 size++;

   }
   //Adding element at Tail(last)
void addAtLast(int val){

Node temp = new Node(val);

if(tail == null){
    head = tail = temp;
}

else{
    tail.next  = temp;
    tail = temp;
    }

    size++;
}
//Printing linkedlist
void display(){
   Node temp = head;
    if(temp == null){
        System.out.print("Your linklist is empty");
        return;
    }

    while(temp != null){
        System.out.print(temp.val+" ");
        temp = temp.next;
    }
}
// Adding element at any index if it possible
void addAtIndex(int index,int val){

    if(index > size || index < 0){
        System.out.println("Note possible because length of string is:"+ size +" " + "and index must be less then or equal to size");
        return;
    }
//It mean add element at last(Tail)
if(index == size){
    addAtLast(val);
    size++;
    return;
}
//It mean add element at first(head)
if(index == 0){
    addAtFirst(val);
    size++;
    return;
}

//when index is not first and last

Node newElement = new Node(val);
Node temp = head;

for(int i = 1; i < index ; i++){
    temp = temp.next;
}
newElement.next = temp.next;
temp.next = newElement;
size++;
  }

//Deleting element at any index if it is possible

void deleteAtIndex(int index){
    
    Node temp = head;

  if(index >= size || index < 0){
    System.out.print("It is not possible");
    return;
}

    if(index == 0){
        head = temp.next;
        size--;
        return;
    }

   if( index+1 == size){

  for(int i = 1; i < size -1; i++){
    temp = temp.next;
  }
  tail = temp;
  tail.next = null;
    size--;
    return;
}



//When index is not first and last
for(int i = 1; i < index; i++){
    temp = temp.next;
}
temp.next = temp.next.next;
size--;

}


}

public class addAndDelete{
    public static void main(String args[]){

        myLinkedList ll = new myLinkedList();

    //Creating linked list using addAtFirst and addAtLast function  

        ll.addAtFirst(20);//Add 20 at first
        ll.addAtFirst(10);// Noe linked list is -10 20
        ll.addAtLast(30);//10 20 30
        ll.addAtLast(40);//10 20 30 40
        ll.addAtLast(50);//10 20 30 40 50
        ll.display();//Printing linked list
        ll.addAtIndex(3 , 37);//Add 37 at index 3
        System.out.println();//Move cursor into next line
        ll.display();//Printing linked list
        ll.addAtIndex(6 , 57);//Add elemmet at index 5 it mean add at last
        System.out.println();//Move cursor into next line
        ll.display();//Now linedlist is 10 20 30 37 40 50 57
        System.out.println();//Now linedlist is 10 20 30 37 40 50 57
       
        ll.deleteAtIndex(4);//Delete elemement at index at 4
        ll.display();//Now linkedlist is 10 20 30 40 50 57
        System.out.println();//Move cursor into next line
        ll.deleteAtIndex(0);//Deleting element at index 0 it mean delete head
        ll.display();//Now linkedlist is 20 30 40 50 57
      
    }
}