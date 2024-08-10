import java.util.Scanner;

public class SingleLLInsertion {
    Node head = null;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void creatInsersion() {
        int data, n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter Value : ");
            data = sc.nextInt();
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                System.out.println(
                        "press 1 for initial position, press 2 for last position, press 3 for middle position");
                int m = sc.nextInt();

                switch (m) {

                    case 1:
                        newNode.next = head;
                        head = newNode;
                        break;

                    case 2:
                        Node temp = head;
                        while (temp.next != null) {
                            temp = temp.next;
                        }
                        temp.next = newNode;
                        break;

                    case 3:
                        System.out.println("Enter the position to be inserted : ");
                        int p = sc.nextInt();
                        Node temp1 = head;
                        for (int i = 0; i < (p - 2); i++) { // Note : if interviewer asked position so keep p-2 and if
                                                            // asked for the index then p-1
                            temp1 = temp1.next;
                        }
                        newNode.next = temp1.next;
                        temp1.next = newNode;
                        break;
                }

            }
            System.out.println("Do you want to insert again, press 1 : ");
            n = sc.nextInt();

        } while (n == 1);

    }

    public void trversInsertion() {
        Node t = head;
        if (t == null) {
            System.out.println("LL does not exist");
        }
        while (t != null) {
            System.out.println(t.data);
            t = t.next;
        }
    }

    public static void main(String[] args) {
        SingleLLInsertion sli = new SingleLLInsertion();
        sli.creatInsersion();
        sli.trversInsertion();
    }
}
