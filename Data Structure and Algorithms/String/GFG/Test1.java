import java.util.Arrays;

public class Test1 {

    public static void main(String[] args) {
        String str = "20-3+5*2";
        int n = str.length();
        // System.out.println(test(str, n));
        test(str, n);
    }

    public static void test(String str, int n) {
        String[] a = str.split(" ");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}
