package Day7;

import java.util.Scanner;

public class blockBlocks {

    // Optimal Sliding Window Approach
    // Time Complexity: O(N) - single pass through the string
    // Space Complexity: O(1) - constant space used
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int min = Integer.MAX_VALUE;
        int count = 0;

        // Count 'W' in the first window of size k
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                count++;
            }
        }
        min = Math.min(count, min);

        // Slide the window across the rest of the string
        for (int i = k; i < n; i++) {
            // Add the new element entering the window from the right
            if (blocks.charAt(i) == 'W') {
                count++;
            }
            // Remove the old element leaving the window from the left
            if (blocks.charAt(i - k) == 'W') {
                count--;
            }
            // Update the minimum recolors needed
            min = Math.min(count, min);
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        blockBlocks solver = new blockBlocks();

        System.out.print("Enter the block pattern (e.g., WBBWWBBWBW): ");
        String blocks = sc.next();

        System.out.print("Enter the value of K: ");
        int k = sc.nextInt();

        // Input validation to avoid Out Of Bounds errors
        if (k > blocks.length()) {
            System.out.println("Error: K cannot be greater than the length of the string.");
        } else {
            int result = solver.minimumRecolors(blocks, k);
            System.out.println("Minimum recolors needed: " + result);
        }

        sc.close();
    }
}
