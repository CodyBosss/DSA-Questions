
//merge array by using initialization of array after declaring the array

import java.util.Arrays;

public class mergeTwoAraayTogether {

    public static void main(String[] args) {
        int[] a = new int[3];

        a[0] = 10;
        a[1] = 20;
        a[2] = 30;

        int a1 = a.length;

        int b[] = new int[2];

        b[0] = 40;
        b[1] = 50;

        int b1 = b.length;

        int c1 = a1 + b1;

        int[] c = new int[c1];

        System.arraycopy(a, 0, c, 0, a1);
        System.arraycopy(b, 0, c, a1, b1);

        System.out.println(Arrays.toString(c));
    }

}
