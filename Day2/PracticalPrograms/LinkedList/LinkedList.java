package LinkedList;
// Node class
class Node {

    int data;
    Node next;

    // Constructor
    Node(int info) {
        data = info;
        next = null;
    }
}

// Linked List class
class MyLinkedList {

    Node head = null;

    // Insert node at the beginning
    void addAtFirst(int data) {

        Node ptr = new Node(data);

        if (head == null) {
            head = ptr;
        }
        else {
            ptr.next = head;
            head = ptr;
        }
    }

    // Insert node at the end
    void addAtLast(int data) {

        Node ptr = new Node(data);

        if (head == null) {
            head = ptr;
        }
        else {

            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = ptr;
        }
    }

    // Display linked list
    void show() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}

// Main class
class LinkedList {

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();

        // Insert at end
        list.addAtLast(10);
        list.addAtLast(20);

        // Insert at beginning
        list.addAtFirst(5);
        list.addAtFirst(1);

        // Insert at end
        list.addAtLast(30);
        list.addAtLast(40);

        // Display
        System.out.println("Linked List:");
        list.show();
    }
}
