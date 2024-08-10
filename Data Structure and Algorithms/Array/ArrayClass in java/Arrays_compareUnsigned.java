import java.util.Arrays;

public class Arrays_compareUnsigned {

    public static void main(String[] args) {
        int a[] = { 10, 20, 30, 40, 50 };
        int b[] = { 60, 70, 80 };
        System.out.println(test(a, b));
    }

    public static int test(int[] a, int[] b) {

        return Arrays.compareUnsigned(a, b);

    }

}