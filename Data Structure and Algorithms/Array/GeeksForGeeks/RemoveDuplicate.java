import java.util.HashSet;
import java.util.Set;

class RemoveDuplicate {
    public static void main(String[] args) {
        int a[] = { 1, 2, 2, 3, 1, 2, 4, 5, 2 };
        int n = a.length;
        System.out.println(dup(a, n));
        // dup(a, n);
    }

    public static int dup(int[] a, int n) {

        if (n == 0 || n == 1) {
            System.out.println(n);
        }

        Set<Integer> hs = new HashSet<>();
        int i = 0;
        for (int value : a) {
            if (hs.add(value)) {
                i++;
            }
        }
        return i;
    }
}