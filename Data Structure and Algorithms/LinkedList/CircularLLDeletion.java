import java.util.Scanner;

public class CircularLLDeletion {

    Node head = null;
    Node tail = null;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void creation() {
        int data, n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter Value : ");
            data = sc.nextInt();
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
                newNode.next = head;
            } else {
                newNode.next = head;
                head = newNode;
                tail.next = head;
            }
            System.out.println("Do you want to enter value again, if yes press 1 : ");
            n = sc.nextInt();
        } while (n == 1);
    }

    public void deletion() {

        int m1, p1;
        Scanner sc1 = new Scanner(System.in);
        if (head == null) {
            System.out.println("LL does not exist");
        } else {
            System.out.println(
                    "press 1 for delete value at begining, press 2 for delete valu at end, press 3 for delete value at middle : ");
            m1 = sc1.nextInt();
            switch (m1) {
                case 1:
                    Node temp1 = head;
                    temp1 = temp1.next;
                    head = temp1;
                    tail.next = head;
                    break;

                case 2:
                    Node temp2 = head;
                    Node ptr = temp2.next;
                    while (ptr.next != head) {
                        temp2 = ptr;
                        ptr = ptr.next;
                    }
                    temp2.next = head;
                    tail = temp2;
                    break;

                case 3:
                    Node temp = head;
                    Node ptr1 = temp.next;
                    System.out.println("Enter position to be inserted : ");
                    p1 = sc1.nextInt();
                    for (int i = 0; i < (p1 - 2); i++) {
                        temp = ptr1;
                        ptr1 = ptr1.next;
                    }
                    temp.next = ptr1.next;
                    break;
            }
        }

    }

    public void traverser() {
        Node temp = head;
        if (temp == null) {
            System.out.println("LL Does not exist");
        }
        System.out.println();
        do {

            System.out.print(temp.data + " ");
            temp = temp.next;

        } while (temp != head);

    }

    public static void main(String[] args) {
        CircularLLDeletion clld = new CircularLLDeletion();
        clld.creation();
        clld.deletion();
        clld.traverser();
    }

}
