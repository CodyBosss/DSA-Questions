import java.util.Scanner;

public class Test {
    int top = -1;
    int data = 500;

    public void push(int[] a, int n) {
        if (top == (n - 1)) {
            System.out.println("Overflow");
        } else {
            top = top + 1;
            a[top] = data;
            System.out.println("data is inserted...");
        }
    }

    public void pop(int[] a, int n) {
        if (top == -1) {
            System.out.println("Underflow");
        } else {
            top = top - 1;
            System.out.println("deleted");
        }
    }

    public void display(int[] a, int n) {
        for (int j = 0; j < n; j++) {
            System.out.print(a[j] + " ");
        }
    }

    public static void main(String[] args) {

        int a[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int n = a.length;

        Test t = new Test();
        t.push(a, n);
        t.pop(a, n);
        t.display(a, n);

    }

}
