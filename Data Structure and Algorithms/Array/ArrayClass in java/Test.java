import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int arr[] = { 0, 2, 1, 2, 0 };
        int n = arr.length;
        // System.out.println(test(a, n));
        test(arr, n);
    }

    public static void test(int[] arr, int n) {
        int count0 = 0, count1 = 0;
        int count2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                count0++;
            if (arr[i] == 1)
                count1++;
            if (arr[i] == 2)
                count2++;
        }

        for (int i = 0; i < count0; i++)
            arr[i] = 0;

        for (int i = count0; i < (count0 + count1); i++)
            arr[i] = 1;

        for (int i = (count0 + count1); i < n; i++)
            arr[i] = 2;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
