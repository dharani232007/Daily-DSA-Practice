package Stack.Day13;

import java.util.ArrayList;
import java.util.Stack;

public class previousGreaterElement {
    //https://www.geeksforgeeks.org/problems/previous-greater-element/1
    public ArrayList<Integer> preGreaterEle(int[] arr) {
        
        int n = arr.length;
        
        ArrayList<Integer>ans = new ArrayList<>(n);
        
        for(int i=0;i<n; i++){
            ans.add(-1);
        }
        
        Stack<Integer>sta = new Stack<>();
        
        for(int i= n-1; i>=0; i--){
            
            int current = arr[i];
            
            while(!sta.isEmpty() && current>arr[sta.peek()]){
                
                int idx = sta.pop();
                ans.set(idx , current);
            }
            sta.push(i);
        }
        
        return ans;
        
    }
}
    

