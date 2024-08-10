import java.util.Arrays;

public class Arrays_deepToString {
    public static void main(String[] args) {
        int[][] a = { { 10, 20, 30, 40 } };
        System.out.println(test(a));
    }

    public static String test(int[][] a) {
        return Arrays.deepToString(a);
    }
}
