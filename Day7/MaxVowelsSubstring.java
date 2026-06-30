package Day7;

import java.util.Scanner;

public class MaxVowelsSubstring {

    // Helper method to check if a character is a vowel
    // Time Complexity: O(1)
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    // Two-Pointer Sliding Window Approach
    // Time Complexity: O(N) - single pass through the string
    // Space Complexity: O(1) - constant space used
    public int maxVowels(String s, int k) {
        int maxCount = 0;
        int n = s.length();
        int vCount = 0;
        int i = 0; // Left pointer
        int j = 0; // Right pointer

        while (j < n) {
            // Include the character at the right pointer
            if (isVowel(s.charAt(j))) {
                vCount++;
            }

            // If window size is less than k, expand the window
            if (j - i + 1 < k) {
                j++;
            }
            // If window size hits k, record answer and slide the window
            else if (j - i + 1 == k) {
                maxCount = Math.max(vCount, maxCount);

                // Exclude the character at the left pointer before moving it
                if (isVowel(s.charAt(i))) {
                    vCount--;
                }
                j++;
                i++;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MaxVowelsSubstring solver = new MaxVowelsSubstring();

        System.out.print("Enter the string: ");
        String s = sc.next();

        System.out.print("Enter the window size (K): ");
        int k = sc.nextInt();

        if (k > s.length()) {
            System.out.println("Error: K cannot be greater than the string length.");
        } else {
            int result = solver.maxVowels(s, k);
            System.out.println("Maximum number of vowels in a substring of length " + k + " is: " + result);
        }

        sc.close();
    }
}
