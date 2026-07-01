package Stack.Day13;

import java.util.ArrayList;
import java.util.Stack;

public class nextGreaterElement {
    //https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1

    public ArrayList<Integer> nextLargerElement(int[] arr) {

        int n = arr.length;
        
        ArrayList<Integer>ans = new ArrayList<>(n);
        
        for(int i=0; i<n; i++){
            ans.add(-1);
        }
        
        Stack<Integer>sta = new Stack<>();
        
        for(int i =0; i<n; i++){
            
            int current = arr[i];
                
            while(!sta.isEmpty() && current > arr[sta.peek()]){
                    
                int idx = sta.pop();
                ans.set(idx, current);
            }
                
            sta.push(i);
        }
            
        return ans;
        
        
    }
}
    

