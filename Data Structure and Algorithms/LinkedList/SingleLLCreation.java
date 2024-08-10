import java.util.Scanner;

public class SingleLLCreation {

    Node head = null;

    // Node class creation
    static class Node {
        int data;
        Node next;

        // Node Constructor Creation
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //
    public void creation() {
        int data, n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter Value : "); // 10 20
            data = sc.nextInt(); // 10 20
            Node new_Node = new Node(data); // 10 20
            if (head == null) {
                head = new_Node; // 10
            } else {
                new_Node.next = head; // 20 10
                head = new_Node; //
            }

            System.out.println("Do you want to add new data, if yes type 1 : ");
            n = sc.nextInt();

        } while (n == 1);
    }

    public void traverser() {
        Node temp = head;
        if (temp == null) {
            System.out.println("Does not exit LL");

        }

        System.out.println();
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
        }

    }

    public static void main(String[] args) {

        SingleLLCreation sl = new SingleLLCreation();
        sl.creation();
        sl.traverser();
    }

}