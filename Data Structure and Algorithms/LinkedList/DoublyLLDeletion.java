import java.util.Scanner;

public class DoublyLLDeletion {

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
                head.prev = newNode;
                newNode.next = head;
                head = newNode;
            }
            System.out.println("Do you want to enter value again, if yes pres 1 :  ");
            n = sc.nextInt();
        } while (n == 1);
    }

    public void delete() {

        int n, m, p;
        Scanner sc1 = new Scanner(System.in);
        do {

            if (head == null) {
                System.out.println("LL Does not exist");
            } else {
                System.out.println("press 1 at beginin deletion, pres 2 at end deletion, pres 3 at middle deletion");
                m = sc1.nextInt();
                switch (m) {
                    case 1:
                        Node temp = head;
                        temp = temp.next;
                        head = temp;
                        head.prev = null;
                        break;

                    case 2:
                        Node temp1 = tail;
                        temp1 = temp1.prev;
                        temp1.next = null;
                        break;

                    case 3:
                        Node temp3 = head;
                        Node ptr = temp3.next;
                        System.out.println("Enter position to be deleted");
                        p = sc1.nextInt();
                        for (int i = 0; i < p - 2; i++) {
                            temp3 = ptr;
                            ptr = ptr.next;
                        }
                        temp3.next = ptr.next;
                        ptr.next.prev = temp3;
                        break;
                }
            }
            System.out.println("Do you want to enter value again, if yes pres 1 :  ");
            n = sc1.nextInt();
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
        DoublyLLDeletion dld = new DoublyLLDeletion();
        dld.create();
        dld.delete();
        dld.traverser();
    }

}
