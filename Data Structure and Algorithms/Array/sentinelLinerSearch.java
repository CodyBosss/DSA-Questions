public class sentinelLinerSearch {

    public static int search(int a[], int n, int f) {
        int last = a[n - 1];
        a[n - 1] = f;
        int i = 0;
        while (a[i] != f)
            i++;
        a[n - 1] = last;
        if ((i < n - 1) || (a[n - 1] == f))
            System.out.println(f + " is present at index : " + i);
        else
            System.out.println("element not found");
        return -1;
    }

    public static void main(String[] args) {
        int a[] = { 30, 70, 180, 40, 80, 20, 90, 10 };
        int f = 180;
        int n = a.length;
        search(a, n, f);
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