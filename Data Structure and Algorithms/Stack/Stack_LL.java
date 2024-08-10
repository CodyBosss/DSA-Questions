import java.util.Scanner;

class Stack {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top = null;

    void push(Scanner sc) {
        int data, n;

        System.out.println("Enter Data");
        data = sc.nextInt();
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    void pop() {
        if (top == null) {
            System.out.println("stack is empty");
        } else {
            top = top.next;
        }
    }

    void display() {
        Node temp = top;
        System.out.println("Elements are : ");
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

public class Stack_LL {

    public static void main(String[] args) {
        int l;
        Stack s = new Stack();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("press 1 to push the items, press 2 for pop, press 3 for display");
            int d = sc.nextInt();
            switch (d) {
                case 1:
                    s.push(sc);
                    break;

                case 2:
                    s.pop();
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
