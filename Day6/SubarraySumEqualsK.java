package Day6;

import java.util.HashMap;
import java.util.Scanner;

public class SubarraySumEqualsK {
    
    // Optimized Approach
    // Time Complexity: O(N) - Single pass through the array
    // Space Complexity: O(N) - In the worst case, all prefix sums are unique and stored in the map
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int count = 0;
        int currentSum = 0;

        // Base case: to handle subarrays that start from index 0
        map.put(0, 1);

        for (int num : nums) {
            currentSum += num;

            // If (currentSum - k) exists in the map, it means we found a subarray that sums up to k
            if (map.containsKey(currentSum - k)) {
                count += map.get(currentSum - k);
            }
            
            // Store the current prefix sum and its frequency
            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the K element: ");
        int k = sc.nextInt();

        // Fixed: Created an instance of SubarraySumEqualsK to call the non-static method
        SubarraySumEqualsK solver = new SubarraySumEqualsK();
        System.out.println("Total subarrays with sum equals K: " + solver.subarraySum(arr, k));

        sc.close(); // Clean resource closure
    }
}
