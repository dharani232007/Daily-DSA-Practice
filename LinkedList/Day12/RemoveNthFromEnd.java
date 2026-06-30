package LinkedList.Day12;

import java.util.Scanner;

public class RemoveNthFromEnd {

    // 1. Uniform Definition of the ListNode structure
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // 2. Core Method utilizing the optimal Fast & Slow One-Pass solution
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }

        /* -------------------------------------------------------------
         * NOTE: Your two-pass counting logic approach is saved below.
         * The active solution below uses the Fast/Slow One-Pass trick!
         * ------------------------------------------------------------- */

        // Step 1: Create a dummy node to seamlessly handle head deletion edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode fast = dummy;
        ListNode slow = dummy;
        
        // Step 2: Move 'fast' ahead by n + 1 steps to establish the constant gap
        for (int i = 0; i <= n; i++) {
            if (fast == null) return head; // Safety check for boundaries
            fast = fast.next;
        }
        
        // Step 3: Move both pointers together until 'fast' runs off the end of the list
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        
        // At this exact spot, 'slow' is pointing to the node BEFORE the target node!
        ListNode deleteNode = slow.next;
        if (deleteNode != null) {
            slow.next = deleteNode.next; // Bypass the node to omit it
            deleteNode.next = null;      // Clean up explicit memory handling
        }
        
        return dummy.next; // Return the actual head of the modified list
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // 3. Main Method to run test inputs directly in VS Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RemoveNthFromEnd obj = new RemoveNthFromEnd();

        System.out.print("Enter the number of elements in the linked list: ");
        int totalElements = sc.nextInt();

        if (totalElements <= 0) {
            System.out.println("Empty list.");
            sc.close();
            return;
        }

        System.out.print("Enter " + totalElements + " space-separated values: ");
        ListNode head = new ListNode(sc.nextInt());
        ListNode tail = head;

        for (int i = 1; i < totalElements; i++) {
            ListNode newNode = new ListNode(sc.nextInt());
            tail.next = newNode;
            tail = newNode;
        }

        System.out.print("Original List: ");
        printList(head);

        System.out.print("Enter N (position from the end to remove): ");
        int n = sc.nextInt();

        // Run the optimized method
        head = obj.removeNthFromEnd(head, n);

        System.out.print("Modified List: ");
        printList(head);

        sc.close();
    }
}
