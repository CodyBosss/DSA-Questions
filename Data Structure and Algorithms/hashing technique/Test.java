import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Test {

    public static void main(String[] args) {

        int[] arr = { 1, 4, 45, 6, 10, 8 };
        int n = arr.length;
        int x = 16;
        System.out.println(test(arr, n, x));
    }

    public static boolean test(int[] arr, int n, int x) {

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == x) {
                    return true;
                }
            }
        }

        return false;

    }
}
