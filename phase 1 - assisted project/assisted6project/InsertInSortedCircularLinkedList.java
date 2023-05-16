package assisted6project;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    private Node head;

    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            newNode.next = newNode;
            head = newNode;
        } else if (data <= head.data) {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            while (current.next != head && current.next.data < data) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void display() {
        if (head == null) {
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);

        System.out.println();
    }
}

public class InsertInSortedCircularLinkedList {
    public static void main(String[] args) {
        CircularLinkedList circularLinkedList = new CircularLinkedList();

        circularLinkedList.insert(2);
        circularLinkedList.insert(4);
        circularLinkedList.insert(6);
        circularLinkedList.insert(8);

        System.out.println("Original Circular Linked List:");
        circularLinkedList.display();

        int newData = 5;
        circularLinkedList.insert(newData);

        System.out.println("Circular Linked List after inserting " + newData + ":");
        circularLinkedList.display();
    }
}
