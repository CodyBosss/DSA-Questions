
//2nd approach

public class sentinelLinearSearch {

    public static int seantinelSearch(int a[], int n, int key) {
        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = { 80, 30, 60, 20, 50, 300, 180 };
        int n = a.length;
        int key = 20;
        int res = seantinelSearch(a, n, key);
        if (res == 0)
            System.out.println("element not found");
        else
            System.out.println(key + " is found at index : " + res);
    }

}

// Initialize the search index variable i to 0.

// Set the last element of the array to the search key.

// While the search key is not equal to the current element of the array
// (i.e., arr[i]), increment the search index i.

// If i is less than the size of the array or arr[i] is equal to the search key,
// return the value of i (i.e., the index of the search key in the array).

// Otherwise, the search key is not present in the array, so return -1
// (or any other appropriate value to indicate that the key is not found).