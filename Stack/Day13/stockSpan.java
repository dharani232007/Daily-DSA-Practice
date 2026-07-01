package Stack.Day13;

import java.util.ArrayList;
import java.util.Stack;

public class stockSpan {

    public ArrayList<Integer> calculateSpan(int[] arr) {
     
     int n= arr.length;
     ArrayList<Integer>ans = new ArrayList<>(n);
     
     for(int i=0; i<n; i++){
         ans.add(1);
     }
     Stack<Integer>sta = new Stack<>();
     
     for(int i=0; i<n; i++){
         
         int current = arr[i];
         
         while(!sta.isEmpty() && current<= arr[sta.peek()]){
             sta.pop();
         }
         
         if(sta.isEmpty()){
             ans.set(i,i+1);
         }
         else{
             int greatest = sta.peek();
             ans.set(i,i-greatest);
         }
         sta.push(i);
         
         
     }
     return ans;
        
    }

    
}
