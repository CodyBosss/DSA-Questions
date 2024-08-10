import java.util.Arrays;

public class Arrays_copyOfRange {
    public static void main(String[] args) {
        int[] a = { 10, 20, 15, 22, 35 };
        System.out.println(test(a));
    }

    public static String test(int[] a) {
        return Arrays.toString(Arrays.copyOfRange(a, 1, 3));
    }
}