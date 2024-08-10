import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {
        int temp, j, i, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of elements : "); // 5
        n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter elements : "); // 70 40 10 50
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (i = 1; i < n; i++) {
            temp = a[i];
            j = i - 1;
            while (j >= 0 && a[j] > temp) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = temp;
        }

        for (i = 0; i < n; i++)

        {
            System.out.println(a[i]);

        }
    }

}

/*
 * public static void main(String[] args) {
 * int j, temp;
 * int a[] = { 70, 40, 10, 50, 20 };
 * int n = a.length;
 * 
 * for (int i = 1; i < n; i++) {
 * temp = a[i];
 * j = i - 1;
 * while (j >= 0 && a[j] > temp) {
 * a[j + 1] = a[j];
 * j = j - 1;
 * }
 * a[j + 1] = temp;
 * }
 * 
 * for (int i = 0; i < n; i++) {
 * System.out.println(a[i]);
 * }
 * }
 */