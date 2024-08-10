import java.util.Arrays;

public class Arrays_deepHashCode {
    public static void main(String[] args) {
        int[][] a = { { 10, 20, 30, 40, 50 } };
        System.out.println(test(a));
    }

    public static int test(int[][] a) {
        return Arrays.deepHashCode(a);
    }
}
