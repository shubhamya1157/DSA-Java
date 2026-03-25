// Traversing a stack
// Printing elements one by one using another stack

import java.util.Stack; // Importing Stack class

public class PrintingStack {
    public static void main(String[] args) {

        Stack<Integer> st1 = new Stack<>(); // Creating stack st1

        st1.push(10); // Pushing 10 into the stack
        st1.push(20); // Pushing 20 into the stack
        st1.push(30); // Pushing 30 into the stack
        st1.push(40); // Pushing 40 into the stack
        st1.push(50); // Pushing 50 into the stack

        // st1 (top to bottom): 50 40 30 20 10

        Stack<Integer> st2 = new Stack<>(); // Creating another stack st2

        // Traverse st1 and print elements using st2
        while (st1.size()>0) { // Run until st1 becomes empty
            int element = st1.pop(); // Remove top element from st1
            st2.push(element);       // Push element into st2
            System.out.print(element + " ");
        }

        // Output: 50 40 30 20 10

        System.out.println(); // Move cursor to next line

        // Reverse printing the stack
        while (st2.size()>0) { // Run until st2 becomes empty
            int element = st2.pop(); // Remove top element from st2
            st1.push(element);       // Push element back into st1
            System.out.print(element + " ");
        }

        // Output: 10 20 30 40 50
    }
}
