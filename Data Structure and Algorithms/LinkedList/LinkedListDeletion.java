import java.util.Scanner;

public class LinkedListDeletion {
    Node head = null;

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
            Node new_Node = new Node(data);

            // If head is null
            if (head == null) {
                head = new_Node;
            } else {
                new_Node.next = head;
                head = new_Node;
            }
            System.out.println("Do you want to enter again, if yes press 1 : ");
            n = sc.nextInt();
        } while (n == 1);
    }

    public void delete() {
        int m, n;
        if (head == null) {
            System.out.println("Linked List Does not exist");
        } else {
            Scanner sc1 = new Scanner(System.in);
            do {
                System.out.println("delete from begining press 1, delete from end press 2, delete from middle press 3");
                m = sc1.nextInt();
                switch (m) {
                    case 1:
                        Node temp = head;
                        temp = temp.next;
                        head = temp;
                        break;
                    case 2:
                        Node temp1 = head;
                        Node ptr = temp1.next;
                        while (ptr.next != null) {
                            temp1 = ptr;
                            ptr = ptr.next;
                        }
                        temp1.next = null;
                        break;
                    case 3:
                        System.out.println("Enter the position to be deleted : ");
                        int p = sc1.nextInt();
                        Node temp2 = head;
                        Node ptr1 = temp2.next;
                        for (int i = 0; i < (p - 2); i++) {
                            temp2 = ptr1;
                            ptr1 = ptr1.next;
                        }
                        temp2.next = ptr1.next;
                        break;
                }
                System.out.println("Do you want to enter value again, if yes pres 1 : ");
                n = sc1.nextInt();
            } while (n == 1);
        }
    }

    public void traverser() {
        Node temp = head;
        if (temp == null) {
            System.out.println("LL does not exist");
        }
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedListDeletion lld = new LinkedListDeletion();
        lld.creation();
        lld.delete();
        lld.traverser();
    }

}
