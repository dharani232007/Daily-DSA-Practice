package Stack.Day13;

import java.util.Stack;

public class stack {

    // FIX 1: All execution steps MUST live inside the main method
    public static void main(String[] args) {

        Stack<Character>charSt = new Stack<>();
        Stack<Double>doubleSt = new Stack<>();
        Stack<String>strStack = new Stack<>();
        Stack<Boolean>boolSt = new Stack<>();


        charSt.push('A');
        charSt.push('B');

        doubleSt.push(1000);
        
        strStack.push("Dharani");

        boolSt.push(true);
        
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        System.out.println("The top element of the stack: " + st.peek());
        System.out.println("Removed top element from the stack: " + st.pop());
        System.out.println("The size of the stack: " + st.size());
        System.out.println("Is the stack empty? " + st.isEmpty());
    }
}
