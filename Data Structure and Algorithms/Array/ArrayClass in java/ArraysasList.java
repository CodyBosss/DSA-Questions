import java.util.Arrays;
import java.util.List;

/**
 * Arrays.asList() method
 */
public class ArraysasList {

    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50, 60 };
        System.out.println(test(a));
    }

    public static int[] test(int[] a) {
        Arrays.asList(a);
        return a;
    }
}