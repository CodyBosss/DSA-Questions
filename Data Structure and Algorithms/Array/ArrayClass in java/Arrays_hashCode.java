import java.util.Arrays;

public class Arrays_hashCode {

    public static void main(String[] args) {
        int[] a = { 10, 20, 15, 22, 35 };
        System.out.println(test(a));
    }

    public static int test(int[] a) {

        return Arrays.hashCode(a);

    }

}
