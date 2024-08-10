import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FirstRepeatingElement {

    public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 4, 3, 5, 6 };
        int n = arr.length;
        System.out.println(test(arr, n));
    }

    public static int test(int[] arr, int n) {
        boolean flag = false;
        int ans = -1;
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (m.containsKey(arr[i])) {
                m.put(arr[i], m.get(arr[i]) + 1);
            } else {
                m.put(arr[i], 1);
            }
        }
        for (int i = 0; i < n; i++) {
            if (m.get(arr[i]) > 1) {
                ans = i + 1;
                break;
            }
        }
        return ans;
    }
}
