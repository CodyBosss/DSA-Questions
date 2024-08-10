import java.util.Scanner;

public class CircularLLInsertion {

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
        int data, m, p, n;
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
                System.out.println(
                        "press 1 for insrting value at begining, press 2 for insert valu at end, press 3 for insert value at middle : ");
                m = sc.nextInt();
                switch (m) {
                    case 1:
                        newNode.next = head;
                        head = newNode;
                        tail.next = head;
                        break;

                    case 2:
                        tail.next = newNode;
                        tail = newNode;
                        newNode.next = head;
                        break;

                    case 3:
                        Node temp = head;
                        System.out.println("Enter position to be inserted : ");
                        p = sc.nextInt();
                        for (int i = 0; i < (p - 2); i++) {
                            temp = temp.next;
                        }
                        newNode.next = temp.next;
                        temp.next = newNode;
                        break;
                }
            }
            System.out.println("Do you want to enter value again, if yes press 1 : ");
            n = sc.nextInt();
        } while (n == 1);
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
        CircularLLInsertion cll = new CircularLLInsertion();
        cll.creation();
        cll.traverser();
    }

}
