import java.util.Arrays;

public class Arrays_sort {

    public static void main(String[] args) {
        int[] a = { 50, 40, 10, 30, 20 };
        System.out.println(test(a));
    }

    public static String test(int[] a) {
        Arrays.sort(a);
        return Arrays.toString(a);

    }

}

