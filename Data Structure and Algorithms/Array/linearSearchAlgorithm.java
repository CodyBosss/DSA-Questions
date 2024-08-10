
//linear search

public class linearSearchAlgorithm {

    public static int search(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i;
        }
        return 0;
    }

    // Driver code
    public static void main(String args[]) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;

        // Function call
        int result = search(arr, x);
        if (result == 0)
            System.out.print(
                    "Element is not present in array");
        else
            System.out.print("Element is present at index "
                    + result);
    }
}

// Q)How Does Linear Search Algorithm Work?
// In Linear Search Algorithm,

// Every element is considered as a potential match for the key and checked for
// the same.
// If any element is found equal to the key, the search is successful and the
// index of that element is returned.
// If no element is found equal to the key, the search yields No match found.

// Q)When to use Linear Search?
// When we are dealing with a small dataset.
// When you are searching for a dataset stored in contiguous memory.