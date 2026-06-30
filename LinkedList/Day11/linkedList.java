package LinkedList.Day11;

import java.util.Scanner;

public class linkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Fixed: Initialised tail inside if, added data update inside while loop
    public static Node takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data (-1 to stop): ");
        int data = sc.nextInt();
        Node head = null;
        Node tail = null;

        while (data != -1) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode; // Fixed: Tail must be initialised with head
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            data = sc.nextInt(); // Fixed: Read next data to prevent infinite loop
        }
        sc.close();
        return head; // Return head so main method can use it
    }

    // Fixed: Added missing 'void' return type
    public static void printINode(Node head, int i) {
        int counter = 0;
        Node temp = head;

        while (temp != null) {
            if (counter == i) {
                System.out.println("Data at index " + i + ": " + temp.data);
                return;
            }
            counter++;
            temp = temp.next;
        }
        System.out.println("Index " + i + " is out of bounds.");
    }

    public static void main(String[] args) {
        // Option 1: Automatic list generation (1 to 100)
        Node head = new Node(1);
        Node tail = head;

        for (int i = 2; i <= 100; i++) {
            Node newNode = new Node(i);
            tail.next = newNode;
            tail = newNode;
        }

        // Testing printINode on the 1-100 list
        printINode(head, 5); // Should print 6 (0-indexed)

        /* 
        // Option 2: To use user input instead, uncomment the lines below:
        Node userInputHead = takeInput();
        printINode(userInputHead, 2); 
        */
    }
}
