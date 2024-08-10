import java.util.Scanner;

public class Min_Max_NoOfNode {

    Node head = null;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public void create() {

        int data, n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter Value : ");
            data = sc.nextInt();
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }

            System.out.println();
            System.out.println("Do you want to enter value again, if yes press 1 : ");
            n = sc.nextInt();
            System.out.println();
        } while (n == 1);
    }

    public void traverse() {
        if (head == null) {
            System.out.println("LL not exist");
        } else {
            Node temp = head;
            System.out.println("Given nodes are : ");
            while (temp != null) {
                System.out.println(+temp.data);
                temp = temp.next;
            }
        }
    }

    public void logic() {
        Node temp = head;
        int c = 0;
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        System.out.println();
        System.out.println("No.of Nodes are : " + c);

    }

    public void large() {
        Node temp = head;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while (temp != null) {
            if (temp.data > max) {
                max = temp.data;
            } else if (temp.data < min) {
                min = temp.data;
            }
            temp = temp.next;
        }
        System.out.println();
        System.out.println("Min No is : " + min);
        System.out.println("Max No is : " + max);
    }

    public static void main(String[] args) {
        Min_Max_NoOfNode mmn = new Min_Max_NoOfNode();
        mmn.create();
        mmn.traverse();
        mmn.logic();
        mmn.large();
    }

}
