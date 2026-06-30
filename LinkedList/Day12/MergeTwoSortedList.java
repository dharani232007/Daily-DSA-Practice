package LinkedList.Day12;

import java.util.ArrayList;
import java.util.Comparator;

public class MergeTwoSortedList {

    // Definition for singly-linked list node
    public static class ListNode {
        public int val;
        public ListNode next;
        
        public ListNode() {}
        
        public ListNode(int val) { 
            this.val = val; 
            this.next = null;
        }
        
        public ListNode(int val, ListNode next) { 
            this.val = val; 
            this.next = next; 
        }
    }

    // Approach 1: Brute Force using an ArrayList
    // Time Complexity: O((N+M) log(N+M)) due to sorting
    // Space Complexity: O(N+M) to store elements in the list
    public ListNode mergeTwoListsBruteForce(ListNode list1, ListNode list2) {
        ArrayList<Integer> ans = new ArrayList<>();
        ListNode temp1 = list1;
        while (temp1 != null) {
            ans.add(temp1.val);
            temp1 = temp1.next;
        }

        ListNode temp2 = list2;
        while (temp2 != null) {
            ans.add(temp2.val);
            temp2 = temp2.next;
        }

        ans.sort(Comparator.naturalOrder());

        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        for (int i = 0; i < ans.size(); i++) {
            tail.next = new ListNode(ans.get(i)); // Creates new nodes for the merged list
            tail = tail.next;
        }
        return dummy.next;
    }

    // Approach 2: Optimal Two-Pointer In-Place Merge
    // Time Complexity: O(N+M) where N and M are the lengths of both lists
    // Space Complexity: O(1) as it reuses existing nodes
    public ListNode mergeTwoListsOptimal(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        ListNode temp1 = list1;
        ListNode temp2 = list2;

        while (temp1 != null && temp2 != null) {
            if (temp1.val <= temp2.val) {
                current.next = temp1;
                temp1 = temp1.next;
            } else {
                current.next = temp2;
                temp2 = temp2.next;
            }
            current = current.next;
        }

        if (temp1 != null) {
            current.next = temp1;
        } else {
            current.next = temp2;
        }

        return dummy.next;
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

    public static void main(String[] args) {
        MergeTwoSortedList merger = new MergeTwoSortedList();

        // Creating List 1: 1 -> 3 -> 5
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        // Creating List 2: 2 -> 4 -> 6
        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);

        System.out.print("Original List 1: ");
        printList(list1);
        System.out.print("Original List 2: ");
        printList(list2);

        // Merging using the optimal approach
        ListNode mergedHead = merger.mergeTwoListsOptimal(list1, list2);

        System.out.print("Merged Sorted List: ");
        printList(mergedHead);
    }
}
