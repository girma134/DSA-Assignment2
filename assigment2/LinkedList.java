package com.assigment2;

public class LinkedList {

    // Head of the linked list
    Node head;

    // Constructor to initialize the linked list
    public LinkedList() {
        head = null;
    }

    /**
     * Method to insert a node at a specific position in the linked list
     *
     * @param item The data to be inserted in the new node
     * @param pos  The position where the new node should be inserted (1-based index)

     */
    public void insertAtPos(int item, int pos) {
        // Create a new node with the given item
        Node newNode = new Node(item);

        // If the position is less than 1, it's an invalid position
        if (pos < 1) {
            System.out.println("Please! enter a valid position");
            return;
        } else if (pos == 1) {
            // If the position is 1, insert the new node at the beginning
            newNode.next = head;
            head = newNode;
        } else {
            // Traverse the list to find the insertion point
            Node pointer = head;
            int count = 1;
            while (count < pos - 1 && pointer != null) {
                pointer = pointer.next;
                count++;
            }
            // If the position is out of range
            if (pointer == null) {
                System.out.println("Position out of range");
                return;
            }
            // Insert the new node at the specified position
            newNode.next = pointer.next;
            pointer.next = newNode;
        }
    }

    /**
     * Method to delete a node at a specific position in the linked list
     *
     * @param pos The position of the node to be deleted (1-based index)
     */
    public void deleteAtPosition(int pos) {
        // check  the list is empty
        if (head == null) {
            System.out.println("Your LinkedList is empty");
            return;
        } else if (pos == 1) {
            // If the node to be deleted is the head node
            head = head.next;
        } else {
            // Traverse the list to find the node before the one to be deleted
            Node pointer = head;
            int count = 1;
            while (count < pos - 1 && pointer != null) {
                pointer = pointer.next;
                count++;
            }
            // If the position is out of range or invalid
            if (pointer == null || pointer.next == null) {
                System.out.println("Position out of range");
                return;
            }
            // Delete the node at the specified position
            Node temp = pointer.next;
            pointer.next = temp.next;
            temp.next = null;
        }
    }

    /**
     * Method to delete the node following a given node
     *
     * @param givenNode The node after which the next node should be deleted
     */
    public void deleteAfterNode(Node givenNode) {
        // If the given node is null or the next node is null
        if (givenNode == null || givenNode.next == null) {
            System.out.println("Nothing to delete");
            return;
        } else {
            // Delete the next node
            givenNode.next = givenNode.next.next;
        }
    }

    /**
     * Method to search for a node with a specific value in the linked list
     *
     * @param head The head of the linked list
     * @param element The value to search for
     * @return The node if the element is found, null otherwise
     */
    public Node searchNode(Node head, int element) {
        // Check if the list is empty
        if (head == null) {
            return null;
        } else {
            // Traverse the list to search for the element
            Node temp = head;
            while (temp != null) {
                if (temp.item == element) {
                    return temp; // Return the node if found
                }
                temp = temp.next;
            }
            return null; // Return null if not found
        }
    }
}
