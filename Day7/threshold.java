package Day7;

import java.util.Scanner;

public class threshold {

    // Optimized Sliding Window Approach
    // Time Complexity: O(N) - single pass through the array
    // Space Complexity: O(1) - constant memory used
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int sum = 0;
        int n = arr.length;

        // Base check if array size is smaller than window size
        if (n < k) {
            return 0;
        }

        // Optimization: Compare against a target sum instead of dividing every time
        int targetSum = threshold * k;

        // Calculate sum of the first window
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        
        if (sum >= targetSum) {
            count++;
        }

        // Slide the window across the remaining elements
        for (int i = k; i < n; i++) {
            sum += arr[i] - arr[i - k];

            if (sum >= targetSum) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        threshold solver = new threshold();

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the window size (K): ");
        int k = sc.nextInt();

        System.out.print("Enter the threshold value: ");
        int thresholdVal = sc.nextInt();

        int result = solver.numOfSubarrays(arr, k, thresholdVal);
        System.out.println("Number of qualifying subarrays: " + result);

        sc.close();
    }
}
