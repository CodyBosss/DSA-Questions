import java.util.Arrays;

public class LongestCommonPrefixInAnArray {
    public static void main(String[] args) {
        String[] a = { "geeksforgeeks", "geeks", "geek", "geezer" };
        int n = a.length;
    }

    public static String test(String[] a, int n) {

        // Approach 1:
        // Arrays.sort(a);
        // int end = Math.min(a[0].length(), a[n - 1].length());
        // int i = 0;
        // while (i < end && a[0].charAt(i) == a[n - 1].charAt(i))
        // i++;

        // String str = a[0].substring(0, i);
        // return str;

        // Approach 2:
        String res = a[0];
        for (int i = 1; i < n; i++) {
            while (a[i].indexOf(res) != 0) {
                res = res.substring(0, res.length() - 1);

                if (res.isEmpty()) {
                    return "-1";
                }
            }
        }
        return res;
    }
}
