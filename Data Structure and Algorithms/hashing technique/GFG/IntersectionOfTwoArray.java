import java.util.HashSet;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int[] a = { 1, 4, 5, 6 };
        int n = a.length;
        int[] b = { 4, 5, 6, 7 };
        int m = b.length;
        System.out.println(test(a, n, b, m));
        // test(a, n, b, m);
    }

    public static int test(int[] a, int n, int[] b, int m) {
        int res = 0;
        HashSet<Integer> hs = new HashSet<>();
        for (int ans : a) {
            hs.add(ans);
        }
        for (int ans : b) {
            if (hs.contains(ans))
                res++;
            hs.remove(ans);
        }
        return res;
    }
}
