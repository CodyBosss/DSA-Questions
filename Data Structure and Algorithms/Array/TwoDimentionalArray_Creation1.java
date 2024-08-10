import java.util.Scanner;

public class TwoDimentionalArray_Creation1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows : ");
        int r = sc.nextInt();
        System.out.println("Enter the column : ");
        int c = sc.nextInt();
        int a[][] = new int[r][c];
        System.out.println("Enter the rows and columns : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter rows of b :");
        int n = sc.nextInt();
        System.out.println("Enter Column of b : ");
        int m = sc.nextInt();
        int b[][] = new int[n][m];
        System.out.println("Enter Elements : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int d = a[i][j] + b[i][j];
                System.out.print(d);
            }
            System.out.println();
        }
    }
}
