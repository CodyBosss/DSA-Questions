// binarySearch(array, fromIndex, toIndex, key, Comparator) Method 
// This method searches a range of the specified array for the specified object 
// using the binary search algorithm.

import java.util.Arrays;

public class Arrays_binarySearch1 {

    public static void main(String[] args) {
        int a[] = { 50, 20, 10, 60, 20 };
        int n = a.length;
        int key = 60;

        System.out.println(test(a, n, key));
    }

    public static int test(int[] a, int n, int key) {

        Arrays.sort(a);
        return Arrays.binarySearch(a, 1, 3, key);
    }

}
