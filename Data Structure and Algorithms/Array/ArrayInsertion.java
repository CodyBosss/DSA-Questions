import java.util.Scanner;

//1st approch:

public class ArrayInsertion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n + 1];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter index to be inserted : ");
        int m = sc.nextInt();
        System.out.println("Enter element : ");
        int p = sc.nextInt();
        for (int i = 0; i < n + 1; i++) {
            if (i < m) {
                b[i] = a[i];
            } else if (i == m) {
                b[i] = p;

            } else {
                b[i] = a[i - 1];
            }
        }

        System.out.println("Elements are : ");
        for (int i = 0; i < n + 1; i++) {
            System.out.println(b[i]);
        }
    }
}

// 2nd approach:
/*
 * public static void main(String[] args) {
 * int a[] = { 10, 20, 30, 40, 50 };
 * int k[] = new int[a.length + 1];
 * int b = 80;
 * int c = 2;
 * for (int i = 0; i < a.length + 1; i++) {
 * if (i < c) {
 * k[i] = a[i];
 * } else if (i == c) {
 * k[i] = b;
 * } else {
 * k[i] = a[i - 1];
 * }
 * }
 * System.out.println("Entered elements are : " + Arrays.toString(a));
 * System.out.println("Element entered i index : " + c);
 * System.out.println("Inserted element is : " + b);
 * System.out.println("Output is : " + Arrays.toString(k));
 * 
 * }
 */

/*
 * public static int numInsert(int a[], int k[], int n, int b, int c) {
 * 
 * for (int i = 0; i < n + 1; i++) {
 * if (i < c) {
 * k[i] = a[i];
 * 
 * } else if (i == c) {
 * k[i] = b;
 * } else {
 * k[i] = a[i - 1];
 * }
 * }
 * return -1;
 * }
 * 
 * public static void main(String[] args) {
 * int a[] = { 10, 20, 30, 40, 50 };
 * int n = a.length;
 * int k[] = new int[n + 1];
 * int b = 80;
 * int c = 2;
 * 
 * int res = numInsert(a, k, n, b, c);
 * if (res == -1) {
 * System.out.println(Arrays.toString(k));
 * } else {
 * System.out.println("Incorrect statement");
 * }
 * }
 */