import java.util.Arrays;

public class Array_Deletion {

    public static void main(String[] args) {
        int a[] = { 10, 20, 30, 40, 50 };
        int n = a.length;
        int index = 2;
        int b[] = new int[n - 1];
        int res = deleteElement(a, b, n, index);
        if (res == -1) {
            System.out.println("Deleted Element is : " + Arrays.toString(b));
        } else {
            System.out.println("Invalid Statement");
        }
    }

    public static int deleteElement(int a[], int[] b, int n, int index) {

        for (int i = 0; i < n; i++) {
            if (i < index) {
                b[i] = a[i];
            } else if (i == index) {
                continue;
            } else {
                b[i - 1] = a[i];
            }
        }

        return -1;

    }

}

/*
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter the size of array : "); // 4
 * int n = sc.nextInt();
 * int a[] = new int[n]; // 4
 * int b[] = new int[n - 1]; // 4+1=5
 * System.out.println("Enter the elements : "); // 10,20,30,40
 * for (int i = 0; i < n; i++) {
 * a[i] = sc.nextInt(); // 10,20,30,40
 * }
 * 
 * System.out.println("Enter Index to be deleted : "); // 2
 * int m = sc.nextInt();
 * 
 * for (int i = 0; i < n; i++) {
 * if (i < m) {
 * b[i] = a[i]; // 10, 20, 50,
 * } else if (i == m) {
 * continue;
 * } else {
 * b[i - 1] = a[i];
 * }
 * }
 * for (int i = 0; i < n - 1; i++) {
 * System.out.println(b[i]);
 * }
 * }
 */