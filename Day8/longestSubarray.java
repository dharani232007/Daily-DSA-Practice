package Day8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class longestSubarray {

    // Approach 1: Two-Pointer Sliding Window
    // Use this ONLY if the array contains non-negative numbers (positive and zero)
    // Time Complexity: O(N), Space Complexity: O(1)
    public static int longestSubarraySlidingWindow(ArrayList<Integer> arr, int k) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int maxLen = 0;
        int n = arr.size(); // Fixed: Use size() for ArrayList
        
        while (j < n) {
            sum += arr.get(j); // Fixed: Use pointer j to expand window

            // Shrink window from the left if the sum exceeds k
            while (sum > k && i <= j) {
                sum -= arr.get(i);
                i++;
            }

            // Check if the current window sum matches k
            if (sum == k) {
                maxLen = Math.max(maxLen, j - i + 1);
            }
            
            j++;
        }
        return maxLen;
    }

    // Approach 2: HashMap + Prefix Sum
    // Use this if the array contains negative numbers, zeros, and positives
    // Time Complexity: O(N), Space Complexity: O(N)
    public static int longestSubarrayHashMap(ArrayList<Integer> arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int prefixSum = 0;
        int n = arr.size();
        
        for (int i = 0; i < n; i++) {
            prefixSum += arr.get(i);
            
            // Case 1: Subarray starts from index 0
            if (prefixSum == k) {
                maxLen = i + 1;
            }
            
            // Case 2: Subarray found somewhere in between
            if (map.containsKey(prefixSum - k)) {
                maxLen = Math.max(maxLen, i - map.get(prefixSum - k));
            }
            
            // Only add the prefix sum if it doesn't exist to preserve the earliest index
            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Fixed: Swapped prompt and input order
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        System.out.print("Enter the K value: ");
        int k = sc.nextInt();
        
        // Running both approaches for comparison
        System.out.println("Longest Subarray Length (Sliding Window): " + longestSubarraySlidingWindow(arr, k));
        System.out.println("Longest Subarray Length (HashMap): " + longestSubarrayHashMap(arr, k));

        sc.close();
    }
}
