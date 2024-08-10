// binarySearch() Method.
// This methods search for the specified element in the array with 
// the help of the binary search algorithm

import java.io.ObjectStreamException;
import java.util.Arrays;

public class Arrays_binarySearch {
    public static void main(String[] args) {
        int[] a = { 10, 20, 15, 22, 35 };
        int index = 15;

        System.out.println(Arrays.binarySearch(a, index));
    }

}