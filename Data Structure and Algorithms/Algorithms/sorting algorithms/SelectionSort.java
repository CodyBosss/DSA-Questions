import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {
        int loc, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements : ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) { // 70, 40, 30, 10, 20, 60 //i=0,1
            loc = i; // loc=0->70
            for (int j = i + 1; j < n; j++) { // j=1, 1<6
                if (a[j] < a[loc]) { // 40<70
                    loc = j; // loc = 1
                }
            }
            temp = a[i];
            a[i] = a[loc];
            a[loc] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Sorted elements are : " + a[i]);
        }
    }
}
