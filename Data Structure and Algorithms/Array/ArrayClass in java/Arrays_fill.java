import java.util.Arrays;

public class Arrays_fill {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50 };
        System.out.println(test(a));
    }

    public static String test(int[] a) {
        int key = 22;
        Arrays.fill(a, key);
        return Arrays.toString(a);

    }
}
