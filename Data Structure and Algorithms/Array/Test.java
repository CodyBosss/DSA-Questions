import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Test {
    public static void main(String[] args) {
        int[] a = { 10, 5, 10 };
        int n = a.length;
        System.out.println(test(a, n));
        // test(a, n);
    }

    public static int test(int[] a, int n) {
        Set<Integer> hs = new HashSet();
        int p = Integer.MAX_VALUE;
        Arrays.sort(a);

        for (int i = 0; i < n - 1; i++) {
            if (p < a[i]) {

            }
        }

    }
}
