import java.util.Scanner;

class CircularLLCreation {

    Node head = null;
    Node tail = null;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = head;
        }
    }

    public void creation() {

        int data, n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value : ");
        do {
            data = sc.nextInt();
            Node new_Node = new Node(data);

            if (head == null) {
                head = new_Node;
                tail = new_Node;
                new_Node.next = head;
            } else {
                new_Node.next = head;
                head = new_Node;
                tail.next = head;
            }
            System.out.println("Do you want to enter some more values, if yes press 1 : ");
            n = sc.nextInt();
        } while (n == 1);

    }

    public void traverse() {
        Node temp = head;
        if (temp == null) {
            System.out.println("LL does not exist : ");
        }
        do {
            System.out.println(temp.data);
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        CircularLLCreation c = new CircularLLCreation();
        c.creation();
        c.traverse();
    }
}
