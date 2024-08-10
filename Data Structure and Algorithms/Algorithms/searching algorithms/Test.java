import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        int data, i, key, mid = 0, l, r, c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of elements : ");
        data = sc.nextInt();
        int a[] = new int[data];
        System.out.println("Enter the elements : ");
        for (i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the key to be search : ");
        key = sc.nextInt();
        l = 0;
        r = a.length - 1;
        while (l <= r) {
            mid = (l + r) / 2;
            if (a[mid] == key) {
                c++;
                break;
            } else if (a[mid] < key) {
                l = mid + 1;
            } else if (a[mid] > key) {
                r = mid - 1;
            }
        }
        if (c > 0) {
            System.out.println(a[mid] + " is present at " + mid + " index ");
        } else {
            System.out.println("Element does not exist");
        }
    }
}
