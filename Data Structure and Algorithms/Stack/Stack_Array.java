import java.util.Scanner;

class Stack {

    int top = -1;
    int n = 10;
    int a[] = new int[n];

    public void push(Scanner sc) { // In stack push means insert.
        if (top == (n - 1)) {
            System.out.println("Overflow");
        } else {
            System.out.println("Enter data : ");
            int i = sc.nextInt();
            top++;
            a[top] = i;
            System.out.println("\nItem Inserted \n");
        }
    }

    public void pop() { // pop means delete.
        if (top == -1) {
            System.out.println("Underflow");
        } else {
            top = top - 1;
            System.out.println("Item deleted \n");
        }
    }

    public void display() {
        System.out.println("Items are : ");
        for (int j = top; j >= 0; j--) {
            System.out.println(a[j]);
        }
    }

}

class Stack_Array {

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