
// Java implementation of iterative Binary Search

public class BinarySearch {

    // Returns index of x if it is present in arr[]
    public int binarySearch(int a[], int x) {
        int l = 0, r = a.length - 1;
        while (l <= r) {
            int m = l + (r - 1) / 2;
            // check if x is present at mid
            if (a[m] == x)
                return m;
            // if x is greater, ignore left half
            if (a[m] < x)
                l = m + 1;
            // if x is smaller, ignore right half
            else
                r = m - 1;
        }
        // If we reach here, then element was
        // not present
        return -1;
    }

    // Driver class
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int a[] = { 2, 3, 4, 10, 40 };
        int x = 10;
        int res = bs.binarySearch(a, x);
        if (res == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index : " + res);
    }

}

// Divide the search space into two halves by finding the middle index mid.
// Compare the middle element of the search space with the key.
// If the key is found at middle element, the process is terminated.
// If the key is not found at middle element, choose which half will be used as
// the next search space.
// If the key is smaller than the middle element, then the left side is used for
// next search.
// If the key is larger than the middle element, then the right side is used for
// next search.
// This process is continued until the key is found or the total search space is
// exhausted.

// EX.
// Consider an array arr[] = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91}, and the
// target = 23.

// First Step: Calculate the mid and compare the mid element with the key.
// If the key is less than mid element, move to left and if it is greater than
// the mid then move search space to the right.

// Key (i.e., 23) is greater than current mid element (i.e., 16).
// The search space moves to the right.

// Key is less than the current mid 56. The search space moves to the left.

// Second Step: If the key matches the value of the mid element,
// the element is found and stop search.
