import java.util.Scanner;

class CQueue_Array {

    int r = -1, f = -1;
    int n = 5;
    int q[] = new int[n];

    public void enqueue(Scanner sc) { // In queue enqueue means insert.

        // Overflow Condition
        if (f == (r + 1) % n) {
            System.out.println("Overflow Condition");
        } else {
            System.out.println("Enter Data : "); // 10
            int i = sc.nextInt(); // 10
            if (r == -1 && f == -1) {
                f = 0;
                r = 0;
                q[r] = i; // a[0]=10,

            } else {
                r = (r + 1) % n; // r=0+1=1, 1+1=2, 2+1=30
                q[r] = i; // 10, 20, 30
            }
        }
    }

    public void dequeue() { // dequeue means delete.

        if (r == -1 && f == -1) {
            System.out.println("Underflow Condition");
        } else if (f == r) {
            System.out.println("Underflow Condition");
            f = -1;
            r = -1;
        } else {
            f = (f + 1) % n;
        }
    }

    public void display() {
        int j;
        System.out.println("Items are : ");
        for (j = f; j != r; j = (j + 1) % n) {
            System.out.println(q[j]);
        }
        System.out.println(q[j]);
    }
}

class CircularQueue_Array {

    public static void main(String[] args) {
        int l;
        CQueue_Array s = new CQueue_Array();
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