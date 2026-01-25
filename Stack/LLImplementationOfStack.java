class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

class MyStack{
    
    Node head;
    int len = 0;

    int peek(){
        if(len == 0){
            System.out.println("Not possible");
            return -1;
        }
        return head.val;
    }
    int pop(){
        if(len == 0){
            System.out.println("Not possible!");
            return -1;
        }
        else if(len == 1){

        int popValue = head.val;
        head = null;
        len--;
        return popValue;

        }
        else{
       int popValue = head.val;
        head = head.next;
        len--;
        return popValue;
        }
      
    }
    void push(int val){
        Node temp = new Node(val);
        if(len == 0){
            head = temp;
        }
        else{
        temp.next = head;
        head = temp;
        }
        len++;
    }

    int size(){
        return len;
    }

    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}

public class LLImplementationOfStack{
    public static void main(String[] args){
 
    MyStack st = new MyStack();
    st.push(10);
    st.push(20);
    st.push(30);
    st.push(40);
    st.push(50);

    st.display();
    st.pop();
    System.out.println();
    st.display();
    st.pop();
    System.out.println();
    st.display();
    st.pop();
    System.out.println();
    st.display();
   System.out.println();
    st.pop();
    st.pop();
    st.pop();
 System.out.println(st.size());

    }
}
