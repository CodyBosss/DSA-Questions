/*Given an array Arr of N positive integers and another number X. \
Determine whether or not there exist two elements in Arr whose sum is exactly X.

Example 1:

Input:
N = 6, X = 16
Arr[] = {1, 4, 45, 6, 10, 8}
Output: Yes
Explanation: Arr[3] + Arr[4] = 6 + 10 = 16*/

import java.util.Arrays;

public class KeyPair {


    
    public static void main(String[] args) {
        int a[] = { 1, 2, 5, 6, 7 };
        int n = a.length;
        int x = 4;
        System.out.println(test(a, n, x));
    }

    public static boolean test(int[] a, int n, int x) {

        Arrays.sort(a);
        int l, r;
        l = 0;
        r = n - 1;
        while (l < r) {
            if (a[l] + a[r] == x)
                return true;

            else if (a[l] + a[r] < x)
                l++;

            else
                r--;
        }
        return false;
    }

}
