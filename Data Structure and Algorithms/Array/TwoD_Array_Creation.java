import java.util.Arrays;
import java.util.Scanner;

public class TwoD_Array_Creation {

    public static void main(String[] args) {
        int a[][] = { { 1, 2 }, { 3, 4 }, { 6, 7 } };
        twoD_Array(a);

    }

    public static int twoD_Array(int a[][]) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }

        return -1;
    }
}
