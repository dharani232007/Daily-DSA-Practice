package Day9;

import java.util.Scanner;

public class OrderAgnosticBinarySearch {

    // Time Complexity: O(log N)
    // Space Complexity: O(1)
    public static int BinarySearch(int[] arr, int target) {
        int n = arr.length;
        
        // Edge case: empty array
        if (n == 0) return -1;

        int start = 0;
        int end = n - 1;
        
        // Fixed: Compare values at the indices, not the index values themselves
        boolean isAsc = arr[start] <= arr[end];

        // Fixed: Use <= so the last remaining element is also checked
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid; // Target found
            }

            if (isAsc) {
                // Ascending Order Logic
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                // Descending Order Logic
                if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the array elements (sorted ascending or descending): ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target element: ");
        int target = sc.nextInt();

        int result = BinarySearch(arr, target);
        System.out.println("Target element present in the index: " + result);

        sc.close();
    }
}
