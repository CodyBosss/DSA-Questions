import java.util.Arrays;

/**
 * CheckIfTwoArraysEqualOrNot
 */
public class CheckIfTwoArraysEqualOrNot {

    public static void main(String[] args) {
        int[] a = { 2, 3, 4, 5, 6 };

        System.out.println(test(a));
    }

    public static long test(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    count++;
                }
            }
        }
        return count;
    }

}