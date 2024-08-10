import java.util.ArrayList;
import java.util.List;

public class ReverseArraynInGroup {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        int k = 3;
        int n = arr.size();
        test(arr, n, k);
    }

    public static void test(List<Integer> arr, int n, int k) {

        for (int i = 0; i < n; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1); // 3+3-1, 4
            int temp;
            while (left < right) {
                temp = arr.get(left);
                arr.set(left, arr.get(right));
                arr.set(right, temp);
                left++;
                right--;
            }
        }
        for (int print : arr) {
            System.out.print(print + " ");
        }
    }
}
