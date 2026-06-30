package Day9;

import java.util.Scanner;

public class BinarySearchReverse {

    // Binary Search for Descending Order Array
    // Time Complexity: O(log N)
    // Space Complexity: O(1)
    public static int BinarySearch(int[] arr, int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        
        while (start <= end) {
            // Prevents integer overflow condition
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid; // Target found
            }
            // Fixed: Compare array element value (arr[mid]) instead of the index (mid)
            else if (arr[mid] > target) {
                start = mid + 1; // Target is smaller, look in the right half
            } else {
                end = mid - 1;   // Target is larger, look in the left half
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
          
        int arr[] = new int[n];
        System.out.print("Enter the array in Descending Order: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter the target element: ");
        int k = sc.nextInt();

        int index = BinarySearch(arr, k);
        System.out.println("The target element index is " + index);

        sc.close(); // Clean resource leak
    }
}
