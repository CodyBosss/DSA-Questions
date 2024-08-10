// Arrays.copyOf() method
// Copies the specified array, truncating or padding with the default value 
// (if necessary) so the copy has the specified length.

import java.util.Arrays;

public class Arrays_copyOf {
    public static void main(String[] args) {
        int[] a = { 10, 20, 15, 22, 35 };
        // System.out.println(test(a));
        test(a);
    }

    public static void test(int[] a) {

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(Arrays.copyOf(a, 10)));
        // return 0;
    }
}
