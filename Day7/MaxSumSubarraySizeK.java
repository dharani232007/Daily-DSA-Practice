package Day7;
import java.util.Scanner;

public class MaxSumSubarraySizeK {

    // Optimized Approach 1: Fixed Window Linear Scan
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public int maxSubarraySum(int[] arr, int k) {
        int n = arr.length;

        if (n < k) {
            return 0;
        }
        
        int current_sum = 0;
        for (int i = 0; i < k; i++) {
            current_sum += arr[i];
        }
        
        int max_sum = current_sum;
        
        for (int i = k; i < n; i++) {
            current_sum += arr[i] - arr[i - k];
            if (current_sum > max_sum) {
               max_sum = current_sum;
            }
        }
        
        return max_sum;
    }
        
    /*
    // Optimized Approach 2: Classic Two-Pointer Sliding Window
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public int maxSubarraySumTwoPointer(int[] arr, int k) {
        int n = arr.length;
        int i = 0; // left pointer
        int j = 0; // right pointer
        int sum = 0;
        int maxSum = Integer.MIN_VALUE; // Handles negative numbers better than 0
        
        while (j < n) {
            sum += arr[j];
            
            if (j - i + 1 < k) {
                j++;
            }
            else if (j - i + 1 == k) {
                maxSum = Math.max(sum, maxSum);
                sum -= arr[i];
                i++;
                j++;
            }
        }
        return maxSum == Integer.MIN_VALUE ? 0 : maxSum;
    }
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the input: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Fixed: Swapped the prompt and input order so it reads correctly in terminal
        System.out.print("Enter the window size (K): ");
        int k = sc.nextInt();

        // Fixed: Created an instance to call the non-static method
        MaxSumSubarraySizeK solver = new MaxSumSubarraySizeK();
        System.out.println("Maximum sum of subarray size K: " + solver.maxSubarraySum(arr, k));
        
        sc.close();
    }
}
