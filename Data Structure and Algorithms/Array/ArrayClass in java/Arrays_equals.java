import java.util.Arrays;

public class Arrays_equals {

    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40 };
        int[] b = { 10, 20 };
        System.out.println(test(a, b));
    }

    public static boolean test(int[] a, int[] b) {

        return Arrays.equals(a, b);

    }

}
