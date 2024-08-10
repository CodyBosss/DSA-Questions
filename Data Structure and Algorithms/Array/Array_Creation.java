import java.util.Scanner;

public class Array_Creation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : "); // 4
        int n = sc.nextInt(); // 4
        int a[] = new int[n]; // 4
        System.out.println("Enter the elements : "); // 10 20 30 40
        for (int i = 0; i < n; i++) { // 0<4, 1<4 2<4 3<4 4<4=condition false
            a[i] = sc.nextInt(); // 10 20 30 40
        }
        System.out.println("Elements are : ");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]); // a[0] =10, a[1]=20, a[2]=30, a[3]=40
        }

    }
}
