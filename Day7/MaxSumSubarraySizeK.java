
package Day7;
import java.util.Scanner;

public class MaxSumSubarraySizeK {

    public int maxSubarraySum(int[] arr, int k) {
        
        
//       


        //Brut Force Approach 
        //Time complexity: O(N^2)
        //Space complexity: O(1)
        
        // int max_length = Integer.MIN_VALUE;
        // int n = arr.length;
        
        // for(int i=0 ; i<=n-k ; i++){
        //     int sum = 0;
        //     for(int j = i ; j < k+i ; j++){
        //         sum += arr[j];
        //     }
            
        //     if(max_length<sum){
        //         max_length = sum;
        //     }
        // }
        
        // return max_length;
        
        
        //Optimize the solution
        //TIme Complexity: O(N)
        //space Complexity: O(1)
        
    
        
        int n = arr.length;

        if(n<k){
            return 0;
        }
        
        int current_sum = 0;
        
        for(int i=0; i<k ; i++){
            current_sum += arr[i];
            
        }
        int max_sum = current_sum;
        
        
        for(int i=k ; i<n ; i++){
            current_sum += arr[i] - arr[i-k];
            
            if(current_sum > max_sum){
               max_sum = current_sum;
            }
        }
    
        
        return max_sum;
    }
        
        
        //Another Way to solve the Problem
        // int n = arr.length;
        // int i = 0; //left
        // int j = 0; //right
        // int sum = 0;
        // int maxSum = 0;
        
        // whie(j<n){
            
        //     sum += arr[j];
            
        //     if(j-i+1 < k){
        //         j++
        //     }
        //     else if(j-i+1 == k{
                
        //         maxSum = Math.max(sum, maxSum);
                
        //         sum -= arr[i];
                
        //         i++;
        //         j++;
        //     }
            
            
        // }
        // return maxSum;
        


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the input: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the array: ");

        for(int i=0; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        System.out.print("Enter the K element: ");

        System.out.println("Maximum sum of subarray size K: " + maxSubarraySum(arr,k));
        sc.close();
    }


    
}
