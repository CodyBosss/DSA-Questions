import java.util.Scanner;

class LinearSearchAlgo {
    public static void main(String[] args) {
        int c = 0, i;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size elements : ");
        int data = sc.nextInt();
        int[] a = new int[data];

        System.out.println("Enter the elements : ");
        for (i = 0; i < data; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter item to be search : ");
        int item = sc.nextInt();
        for (i = 0; i < a.length; i++) {
            if (item == a[i]) {
                c++;
                break;
            }
        }
        if (c > 0) {
            System.out.println("Element " + a[i] + " Exist at " + i + " index ");
        } else {
            System.out.println("Elements does not exist");
        }

    }
}