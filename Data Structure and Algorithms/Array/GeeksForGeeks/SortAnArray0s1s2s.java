public class SortAnArray0s1s2s {

    public static void main(String[] args) {
        int[] a = { 0, 2, 1, 2, 0 };
        int n = a.length;
        test(a, n);
    }

    public static void test(int[] a, int n) {

        int c0 = 0, c1 = 0, c2 = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0)
                c0++;
            if (a[i] == 1)
                c1++;
            if (a[i] == 2)
                c2++;
        }
        for (int i = 0; i < c0; i++)
            a[i] = 0;
        for (int i = c0; i < (c0 + c1); i++)
            a[i] = 1;
        for (int i = (c0 + c1); i < n; i++)
            a[i] = 2;

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

    }

}