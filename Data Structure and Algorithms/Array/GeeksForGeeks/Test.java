import java.util.Arrays;

class Test {

    public static void main(String[] args) {

        int a[] = { 1, 2, 2, 3, 4, 3, 5 };
        Arrays.sort(a);
        int n = a.length;

        System.out.println(dup(a, n));
    }

    public static int dup(int[] a, int n) {

        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[j] = a[i];
                j++;
            }
            a[j] = a[n - 1];
        }
        return j;

    }
}