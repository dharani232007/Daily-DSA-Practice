package Day9;

import java.util.Scanner;

public class FirstLastOccurance {
    
    // Time Complexity: O(log N)
    // Space Complexity: O(1)
    public static int FirstOccurance(int[] arr, int target, int n) {
        int start = 0;
        int end = n - 1;
        int ans = -1; 

        while (start <= end) { 
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                ans = mid;      
                end = mid - 1;  // Look left for an earlier occurrence
            } 
            else if (arr[mid] > target) {
                end = mid - 1;  
            } 
            else {
                start = mid + 1; 
            }
        }
        return ans;
    }

    // Time Complexity: O(log N)
    // Space Complexity: O(1)
    public static int LastOccurance(int[] arr, int target, int n) {
        int start = 0;
        int end = n - 1;
        int ans = -1; 

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                ans = mid;        
                start = mid + 1;  // Look right for a later occurrence
            } 
            else if (arr[mid] > target) {
                end = mid - 1;
            } 
            else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // Fixed: Cleaned up standard console scanner initialization
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the array elements (sorted): "); 

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target element: ");
        int k = sc.nextInt();

        int firstIdx = FirstOccurance(arr, k, n);
        int lastIdx = LastOccurance(arr, k, n);

        System.out.println("First Occurrence index: " + firstIdx);
        System.out.println("Last Occurrence index: " + lastIdx);

        // Optional: Calculate and print total count directly from your markers
        int totalOccurrences = (firstIdx == -1) ? 0 : (lastIdx - firstIdx + 1);
        System.out.println("Total count of element: " + totalOccurrences);

        sc.close();
    }
}
