package com.assigment2;


class Node {
    // The value stored in this node
    int item;

    // The reference to the next node in the linked list
    Node next;

    /**
     * Constructor to initialize the node with an item.
     * @param item The value to be stored in this node.
     */
    public Node(int item) {
        // Set the value of this node to the provided item
        this.item = item;

        // Initialize the reference to the next node as null
        this.next = null;
    }
}
