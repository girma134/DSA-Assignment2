package com.assigment2;

public class Stack {

    // Inner class representing a node in the stack
    private class Node {
        // The value stored in this node
        int item;

        // The reference to the next node in the stack
        Node next;

        /**
         * Constructor to initialize the node with an item
         *
         * @param item The value to be stored in this node
         */
        Node(int item) {
            // Set the value of this node to the provided item
            this.item = item;

            // The next node is not initialized here, remains null
        }
    }

    // The top of the stack, initially null indicating the stack is empty
    private Node top;

    /**
     * Constructor to initialize the stack
     */
    public Stack() {
        // Initialize the top of the stack as null
        top = null;
    }

    /**
     * Method to push an item onto the stack
     *
     * @param item The data to be pushed onto the stack
     */
    public void push(int item) {
        // Create a new node with the given item
        Node newNode = new Node(item);

        // Link the new node to the current top node
        newNode.next = top;

        // Update the top to be the new node
        top = newNode;
    }

    /**
     * Method to pop an item from the stack
     *
     * @return The data from the top of the stack
     * @throws Exception If the stack is empty
     */
    public int pop() throws Exception {
        // Check if the stack is empty
        if (top == null) {
            // Throw an exception if the stack is empty
            throw new Exception("Stack Underflow - The stack is empty");
        }

        // Retrieve the item from the top node
        int item = top.item;

        // Move the top to the next node in the stack
        top = top.next;

        // Return the retrieved item
        return item;
    }

    /**
     * Method to peek at the top item of the stack without removing it
     *
     * @return The data from the top of the stack
     * @throws Exception If the stack is empty
     */
    public int peek() throws Exception {
        // Check if the stack is empty
        if (top == null) {
            // Throw an exception if the stack is empty
            throw new Exception("Stack is empty");
        }

        // Return the item from the top node
        return top.item;
    }

    /**
     * Method to display all items in the stack
     */
    public void display() {
        // Start from the top of the stack
        Node current = top;

        // Traverse the stack until the end
        while (current != null) {
            // Print the item of the current node
            System.out.print(current.item + " ");

            // Move to the next node
            current = current.next;
        }

        // Print a newline character after displaying all items
        System.out.println();
    }
}
