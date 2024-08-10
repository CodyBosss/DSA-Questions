import java.util.Scanner;

class quick {

    // A utility function to swap two elements
    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // This function takes last element as pivot,
    // places the pivot element at its correct position
    // in sorted array, and places all smaller to left
    // of pivot and all greater elements to right of pivot
    static int partition(int[] a, int low, int high) {
        // Choosing the pivot
        int pivot = a[high];

        // Index of smaller element and indicates
        // the right position of pivot found so far
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            // If current element is smaller than the pivot
            if (a[j] < pivot) {

                // Increment index of smaller element
                i++;
                swap(a, i, j);
            }
        }
        swap(a, i + 1, high);
        return (i + 1);
    }

    void quick1(int a[], int low, int high) {
        if (low < high) {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(a, low, high);

            // Separately sort elements before
            // partition and after partition
            quick1(a, low, pi - 1);
            quick1(a, pi + 1, high);
        }
    }
}

class QuickSort {
    public static void main(String[] args) {
        int n, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element do you want to print : ");
        n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter elements : ");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        quick q1 = new quick();
        q1.quick1(a, 0, n - 1);

        for (i = 0; i < n; i++) {
            System.out.println(a[i] + " ");

        }
    }
}