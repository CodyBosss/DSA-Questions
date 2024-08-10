// Arrays.compare() method.
// Compares two arrays passed as parameters lexicographically.

import java.util.Arrays;

public class Arrays_compare {
    public static void main(String[] args) {
        int a[] = { 10, 20, 15, 22, 35 };
        int b[] = { 10, 15, 22 };
        System.out.println(test(a, b));

    }

    public static int test(int[] a, int[] b) {

        return Arrays.compare(a, b);

    }
}