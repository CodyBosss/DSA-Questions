import java.util.Arrays;

public class Find_Triplet_With_Zero_Sum {

    public static void main(String[] args) {
        int a[] = { 60, -65, 5, -21, 8, 93 };
        Arrays.sort(a);
        int n = a.length;
        System.out.println(Arrays.toString(a));
        System.out.println(test(a, n));
    }

    public static boolean test(int[] a, int n) {

        int i = 0;
        int l = i + 1;
        int r = n - 1;
        int x = a[i];

        while (l < r) {
            if (x + a[l] + a[r] == 0) {
                // l++;
                // r--;
                return true;
            } else if (x + a[l] + a[r] < 0) {
                l++;
            } else {
                r--;
            }
        }

        return false;
    }

}
