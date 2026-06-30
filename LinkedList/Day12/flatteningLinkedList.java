package LinkedList.Day12;

import java.util.Scanner;

public class flatteningLinkedList {

   
    static class Node {
        int data;
        Node next;
        Node bottom;

        Node(int data) {
            this.data = data;
            this.bottom = null;
            this.next = null;
        }
    }

    
    public static Node merge(Node list1, Node list2) {
        Node temp1 = list1;
        Node temp2 = list2;

        Node dummy = new Node(-1);
        Node tail = dummy;

        while (temp1 != null && temp2 != null) {
            if (temp1.data <= temp2.data) {
                tail.bottom = temp1; 
                temp1 = temp1.bottom;
            } else {
                tail.bottom = temp2; 
                temp2 = temp2.bottom;
            }
            tail = tail.bottom;
        }

        if (temp1 != null) {
            tail.bottom = temp1;
        }
        if (temp2 != null) {
            tail.bottom = temp2;
        }

        return dummy.bottom;
    }

    
    public static Node flatten(Node root) {

        if (root == null || root.next == null) {
            return root;
        }

        root.next = flatten(root.next);

        return merge(root, root.next);
    }


    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.bottom;
        }
        System.out.println("null");
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of main (horizontal) lists: ");
        int totalMainLists = sc.nextInt();

        Node root = null;
        Node horizontalTail = null;

        for (int i = 1; i <= totalMainLists; i++) {
            System.out.print("\nEnter the number of elements in vertical list " + i + ": ");
            int verticalSize = sc.nextInt();

            if (verticalSize <= 0) continue;

            System.out.print("Enter the " + verticalSize + " space-separated elements (sorted): ");
            
            // Build the current vertical chain
            Node verticalHead = new Node(sc.nextInt());
            Node verticalTail = verticalHead;

            for (int j = 1; j < verticalSize; j++) {
                Node newNode = new Node(sc.nextInt());
                verticalTail.bottom = newNode; // link down via bottom pointer
                verticalTail = newNode;
            }

            // Connect this vertical chain into our main horizontal row
            if (root == null) {
                root = verticalHead;
                horizontalTail = root;
            } else {
                horizontalTail.next = verticalHead; // link across via next pointer
                horizontalTail = verticalHead;
            }
        }

        System.out.println("\n--- Original List Structure Loaded Successfully ---");
        
        // Flatten the list
        Node flattenedRoot = flatten(root);

        System.out.println("\n--- Flattened Linked List ---");
        printList(flattenedRoot);

        sc.close();
    }
}
