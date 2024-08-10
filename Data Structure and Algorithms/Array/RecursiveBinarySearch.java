// Java implementation of recursive Binary Search
public class RecursiveBinarySearch {

    // Returns index of x if it is present in arr[l..
    // r], else return -1
    public int recursiveBinarySearch(int a[], int l, int r, int f) {
        if (r >= l) {
            int m = l + (r - 1) / 2;

            // If the element is present at the
            // middle itself
            if (a[m] == f)
                return m;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (a[m] > f)
                return recursiveBinarySearch(a, m - 1, l, f);

            // Else the element can only be present
            // in right subarray
            return recursiveBinarySearch(a, m + 1, r, f);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }

    public static void main(String[] args) {
        RecursiveBinarySearch rbs = new RecursiveBinarySearch();
        int a[] = { 2, 3, 4, 10, 40 };
        int f = 4;
        int n = a.length;
        int res = rbs.recursiveBinarySearch(a, 0, n - 1, f);
        if (res == -1)
            System.out.println("Element is found");
        else
            System.out.println("Element is found at index : " + res);

    }

}
