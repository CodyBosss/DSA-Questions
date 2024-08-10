import java.util.HashMap;
import java.util.Map;

public class Nom_Repeating_Element {

    public static void main(String[] args) {
        int a[] = { 1, 1, 1 };
        int n = a.length;
        System.out.println(test(a, n));
    }

    public static int test(int[] a, int n) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < n; i++) {
            m.put(a[i], m.getOrDefault(a[i], 0) + 1);
        }

        for (int i = 0; i < n; i++) {
            if (m.get(a[i]) == 1) {
                return a[i];
            }
        }
        return 0;
    }

}
