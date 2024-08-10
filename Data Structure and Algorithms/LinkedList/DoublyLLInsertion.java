import java.util.Scanner;

public class DoublyLLInsertion {
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

    public void create() {
        int data, n, m, p;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter Value : ");
            data = sc.nextInt();
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                System.out.println("press 1 at beginin, pres 2 at end, pres 3 at middle");
                m = sc.nextInt();
                switch (m) {
                    case 1:
                        head.prev = newNode;
                        newNode.next = head;
                        head = newNode;
                        break;

                    case 2:
                        tail.next = newNode;
                        newNode.prev  = tail;
                        tail = newNode;
                        break;

                    case 3:
                        Node temp = head;
                        Node ptr = temp.next;
                        System.out.println("Enter position to be inserted");
                        p = sc.nextInt();
                        for (int i = 0; i < p - 2; i++) {
                            temp = ptr;
                            ptr = ptr.next;
                        }
                        newNode.next = ptr;
                        temp.next = newNode;
                        ptr.prev = newNode;
                        newNode.prev = temp;
                        break;
                }
            }
            System.out.println("Do you want to enter value again, if yes pres 1 :  ");
            n = sc.nextInt();
        } while (n == 1);
    }

    public void traverser() {
        if (head == null) {
            System.out.println("Does not exist");
        }
        Node temp = head;
        System.out.println();
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != null);
    }

    public static void main(String[] args) {
        DoublyLLInsertion dli = new DoublyLLInsertion();
        dli.create();
        dli.traverser();
    }
}
