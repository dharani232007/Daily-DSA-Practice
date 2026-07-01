package Stack.Day13;

import java.util.ArrayList;
import java.util.Stack;

public class nextSmallerElement {
    //https://www.geeksforgeeks.org/problems/immediate-smaller-element1142/1
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        
        int n = arr.length;
        
        ArrayList<Integer>ans = new ArrayList<>(n);
        
        for(int i=0; i<n; i++){
            ans.add(-1);
        }
        
        Stack<Integer>sta = new Stack<>();
        
        for(int i=0; i<n; i++){
            
            int current = arr[i];
            
            while(!sta.isEmpty() && current < arr[sta.peek()]){
                
                int idx = sta.pop();
                ans.set(idx , current);
            }
            sta.push(i);
            
        }
        return ans;
        
        
        
    }
}
    

