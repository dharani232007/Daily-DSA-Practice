package Day6;

import java.util.Scanner;

public class LongestSubarry {
    
    // Approach: Sliding Window / Two-Pointer
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static int longestSubarrayWithSumK(int[] arr, long k) {
        int start = 0;
        int end = 0;
        long currentSum = 0;
        int maxLength = 0;
        int n = arr.length;

        while (end < n) {
            // Add the current element to the window sum
            currentSum += arr[end];

            // If the sum exceeds k, shrink the window from the left
            while (start <= end && currentSum > k) {
                currentSum -= arr[start];
                start++;
            }

            // Check if we found a valid subarray with sum equal to k
            if (currentSum == k) {
                maxLength = Math.max(maxLength, end - start + 1);
            }

            // Move the right pointer forward
            end++;
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the array elements (positive integers): ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target sum (K): ");
        long k = sc.nextLong();

        int result = longestSubarrayWithSumK(arr, k);
        System.out.println("Length of the longest subarray with sum " + k + " is: " + result);

        sc.close();
    }
}
