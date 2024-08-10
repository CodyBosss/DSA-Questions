import java.util.Scanner;
import java.util.Stack;

class Queue {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node f = null;
    Node r = null;

    public void enqueue(Scanner sc) {
        int data, n;
        System.out.println("Enter Data : ");
        data = sc.nextInt();
        Node new_Node = new Node(data);
        if (f == null && r == null) {
            f = new_Node;
            r = new_Node;
        } else {
            r.next = new_Node;
            r = new_Node;
        }
    }

    public void dequeue() {

        if (r == null && f == null) {
            System.out.println("Underflow");
        } else {
            f = f.next;
        }
    }

    public void display() {
        Node temp = f;
        System.out.println("Elements are : ");
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

class Queue_LL {

    public static void main(String[] args) {
        int l;
        Queue s = new Queue();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("press 1 to enqueue the items, press 2 for dequeue, press 3 for display");
            int d = sc.nextInt();
            switch (d) {
                case 1:
                    s.enqueue(sc);
                    break;

                case 2:
                    s.dequeue();
                    break;

                case 3:
                    s.display();
                    break;
            }
            System.out.println("Enter 0 to go backword : ");
            System.out.println("Enter any key to exit :");
            l = sc.nextInt();
        } while (l == 0);
        System.out.println("Exit successfully...");

    }

}
