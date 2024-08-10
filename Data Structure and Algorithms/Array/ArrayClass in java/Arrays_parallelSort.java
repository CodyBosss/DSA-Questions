import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays_parallelSort {

    public static void main(String[] args) {
        int[] a = { 10, 20, 15, 22, 35 };
        System.out.println(test(a));
    }

    public static String test(int[] a) {
        Arrays.parallelSort(a);
        return Arrays.toString(a);
    }
}
