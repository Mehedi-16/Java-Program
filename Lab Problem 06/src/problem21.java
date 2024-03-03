
public class Problem21 {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Problem21 list = new Problem21();
        list.head = new Node(20);
        list.head.next = new Node(40);
        list.head.next.next = new Node(60);
        list.head.next.next.next = new Node(80);

        System.out.println("Original Linked list:");
        list.printList(head);

        head = list.reverse(head);

        System.out.println("\nReversed Linked list:");
        list.printList(head);
    }
}
