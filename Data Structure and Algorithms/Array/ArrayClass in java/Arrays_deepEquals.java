import java.util.Arrays;

public class Arrays_deepEquals {

    public static void main(String[] args) {
        int[][] a = { { 10, 20, 15, 22, 35 } };
        int[][] b = { { 10, 15, 22 } };
        System.out.println(test(a, b));
    }

    public static boolean test(int[][] a, int[][] b) {

        return Arrays.deepEquals(a, b);

    }

}