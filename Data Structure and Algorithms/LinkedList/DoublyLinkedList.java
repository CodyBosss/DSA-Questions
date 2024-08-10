import java.util.Scanner;

public class DoublyLinkedList {
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void creation() {
        int data, n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter Value : ");
            data = sc.nextInt();
            Node new_Node = new Node(data);
            if (head == null) {
                head = new_Node;
                tail = new_Node;
            } else {
                head.prev = new_Node;
                new_Node.next = head;
                head = new_Node;
            }
            System.out.println("Do you want to enter value again, if yes press 1 : ");
            n = sc.nextInt();
        } while (n == 1);
    }

    public void traverse() {
        if (head == null) {
            System.out.println("LL does not exist");
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != null);
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.creation();
        dll.traverse();
    }
}
