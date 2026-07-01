package Stack.Day13;

import java.util.Stack;

public class stringStack {

    public static void main(String[] args){

        Stack<String>strStack = new Stack<>();

        strStack.push("Dharani");
        strStack.push("()");

        System.out.println("Remove the top string: "+ strStack.pop());

    }

    
    
}
