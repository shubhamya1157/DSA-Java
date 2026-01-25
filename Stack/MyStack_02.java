import java.util.Stack;
public class MyStack_02{
    public static void ReverseStack(Stack <Integer> st ){
        if(st.size()<=1){
            return;
        }

        int top = st.pop();
        ReverseStack(st);
        PushAtBottom(top ,st);
    }

    public static void PushAtBottom(int val, Stack <Integer> st ){

    if(st.size() == 0){
     st.push(val);
     return;
    }
    
        int ele =  st.pop();
        PushAtBottom(val , st);
        st.push(ele);
  

    }
 
    public static void main(String[] args){
   
   Stack <Integer> st1 = new Stack<>();

    st1.push(10); // Pushing 10 into the stack
    st1.push(20); // Pushing 20 into the stack
    st1.push(30); // Pushing 30 into the stack
    st1.push(40); // Pushing 40 into the stack
    st1.push(50); // Pushing 50 into the stack

    System.out.println(st1);
    ReverseStack(st1);
    System.out.print(st1);

    }
}
