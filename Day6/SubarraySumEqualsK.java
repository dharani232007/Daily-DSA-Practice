package Day6;

import java.util.HashMap;
import java.util.Scanner;

public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        
        //Time Complexity: O(N^2)
        
        // int n = nums.length;
        // int count = 0;
        
        // for(int i = 0; i<n ; i++){
        //     int sum = 0;
        //     for(int j = i ; j<n ; j++){
        //         sum += nums[j];

        //         if(sum == k){
        //             count++;
        //         }
        //     }
        // }


        // return count;


        //Optimize the code
        //TIme complexity: O(N)
        //Space Complexity: O(1)

        HashMap<Integer,Integer>map = new HashMap<>();

        int count = 0;
        int currentSum = 0;

        map.put(0,1);

        for(int num : nums){
            currentSum += num;

            if(map.containsKey(currentSum - k)){
                count += map.get(currentSum - k);
            }
            map.put(currentSum, map.getOrDefault(currentSum,0)+1);
        }

        return count;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.print("Enter the array: ");

        int arr[] = new int[n];
        
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the K element: ");
        int k = sc.nextInt();

        System.out.println("Subarray Element: " + subarraySum(arr, k));


    }
    
}
