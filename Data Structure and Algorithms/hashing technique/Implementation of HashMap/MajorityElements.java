import java.util.HashMap;

public class MajorityElements {

    public static void main(String[] args) {
        int[] a = { 1, 3, 2, 5, 1, 3, 1, 3, 4 };
        int n = a.length;
        System.out.println(majorityElements(a, n));
        // majorityElements(a, n);
    }

    public static int majorityElements(int[] a, int n) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            }

            else {
                map.put(a[i], 1);
            }
        }

        for (int key : map.keySet()) {
            if (map.get(key) > n / 3) {
                return key;
            }
        }
        return -1;

    }
}
