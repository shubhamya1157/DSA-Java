//Geting(Printing),Adding,Removing element at any index

import java.util.Stack; // Importing Stack class

public class GetAddDel{
 
 //Function for Getting element
   public static int gettingElement(int index , Stack <Integer> st){ 

        if(index >= st.size() || index < 0){
         return -1;
        }
           //Creating another stack 
        Stack<Integer> temp = new Stack<>();
        while(st.size() > index + 1){
             temp.push(st.pop());
        
          } 
           int ele  = st.peek();

          while(temp.size() > 0){
            st.push(temp.pop());
          }
           return ele; 
        }

           //Print Getede element
        public static void printGetElement(int index , Stack <Integer> st){
         int ans = gettingElement( index,  st);
        if(ans == -1){
         System.out.println("Not possible!");
           }
           else{
            System.out.println(ans);
          }
        }
         //Function for add element
         public static void addElement(int index ,int val, Stack <Integer> st){

        if(index > st.size() || index < 0){
            System.out.print("Not possible!");
            return;
        }
           //Creating another stack 
         Stack<Integer> temp = new Stack<>();

         while(st.size() > index){
            temp.push(st.pop());
         }
          st.push(val);

        while(temp.size() > 0){
            st.push(temp.pop());
        }

         }
         //Function for delete element 
        public static void deleteElement(int index , Stack <Integer> st){

        if(index > st.size() || index < 0){
            System.out.print("Not possible!");
            return;
        }
      //Creating another stack   
       Stack<Integer> temp = new Stack<>();

       while(st.size() > index + 1){
        temp.push(st.pop());
       }

       st.pop();

       while(temp.size() > 0){
        st.push(temp.pop());
       }

        }


    public static void main(String[] args) {

        Stack<Integer> st1 = new Stack<>(); // Creating stack st1

        st1.push(10); // Pushing 10 into the stack
        st1.push(20); // Pushing 20 into the stack
        st1.push(30); // Pushing 30 into the stack
        st1.push(40); // Pushing 40 into the stack
        st1.push(50); // Pushing 50 into the stack

        // st1 (top to bottom): 50 40 30 20 10
     
    
     printGetElement(2 , st1);//Output :30
     addElement(2,27,st1);//Now st1 (top to bottom): 50 40 30 27 20 10
     printGetElement(2, st1);//Output :27
     deleteElement(2,st1); //Now  st1 (top to bottom): 50 40 30 20 10
     printGetElement(2, st1);//Output :30

    }
}
