import java.util.Scanner;

class BinarySearchAlgo {
    public static void main(String[] args) {
        int i, item, l, r, mid = 0, c = 0, data;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of Elements : ");
        data = sc.nextInt();
        int[] a = new int[data];

        System.out.println("Enter the elements : ");
        for (i = 0; i < data; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter Elements to be search : ");
        item = sc.nextInt();
        l = 0;
        r = a.length - 1;
        while (l <= r) {
            mid = (l + r) / 2;
            if (a[mid] == item) {
                c++;
                break;
            } else if (a[mid] < item) {
                l = mid + 1;

            } else if (a[mid] > item) {
                r = mid - 1;
            }
        }
        if (c > 0) {
            System.out.println("Elemet found at : " + mid);
        } else {
            System.out.println("Does not exist");
        }
    }
}