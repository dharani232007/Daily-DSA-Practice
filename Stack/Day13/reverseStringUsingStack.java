package Stack.Day13;

import java.util.Stack;

public class reverseStringUsingStack {

    public static String reverseString(String s) {
        // code here
        int length = s.length();
        String ans = "";
        
        Stack<Character>str = new Stack<>();
        
        for(int i=0 ; i<length ; i++){
            str.push(s.charAt(i));
        }
        
        while(!str.isEmpty()){
            ans += str.pop();
            
        }
        return ans;
    }

    public static void main(String[] args){
        System.out.println(reverseString("Dharani"));
    }


    
}
