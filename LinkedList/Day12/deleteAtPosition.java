package LinkedList.Day12;

import java.util.Scanner;

public class deleteAtPosition {

    // 1. Definition of the Node structure
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // 2. Your core node deletion method
    public Node deleteNode(Node head, int x) {
        if (head == null) {
            return null;
        }
    
        Node temp = head;
        int start = 1;
        
        // Handle case where head node needs to be deleted
        if (x == 1) {
            head = temp.next;
            return head;
        }
        
        // Walk to the node right before the one we want to delete (x - 1)
        while (temp != null && start < x - 1) {
            start++;
            temp = temp.next;
        }
        
        // Link past the deleted node
        if (temp != null && temp.next != null) {
            Node nodeToDelete = temp.next;
            Node nextNode = nodeToDelete.next;
            temp.next = nextNode;
            
            nodeToDelete.next = null; // Clean up explicit memory handling
        }
        
        return head;
    }

    // Helper method to print the linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // 3. Main Method to handle User Input via Console
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        deleteAtPosition obj = new deleteAtPosition();

        System.out.print("Enter the number of elements in the linked list: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Empty list created.");
            sc.close();
            return;
        }

        System.out.print("Enter " + n + " space-separated list elements: ");
        Node head = new Node(sc.nextInt());
        Node tail = head;

        for (int i = 1; i < n; i++) {
            Node newNode = new Node(sc.nextInt());
            tail.next = newNode;
            tail = newNode;
        }

        System.out.print("Original List: ");
        printList(head);

        System.out.print("Enter the position (1-based index) to delete: ");
        int position = sc.nextInt();

        // Run deletion
        head = obj.deleteNode(head, position);

        System.out.print("Modified List: ");
        printList(head);

        sc.close();
    }
}
