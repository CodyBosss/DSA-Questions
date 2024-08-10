
// Java code to find largest three elements
// in an array

public class Findlargestthreedistinctelementsinarray {

    // Function to print three largest elements
    public static void print3Largest(int a[], int n) {
        int first, second, third;

        // There should be atleast three elements
        if (n < 3) {
            System.out.println("Invalid Input");
            return;
        }
        third = second = first = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {

            // If current element is greater than first
            if (a[i] > first) {
                third = second;
                second = first;
                first = a[i];

                // If arr[i] is in between first and second then update second
            } else if (a[i] > second && a[i] != first) {
                third = second;
                second = a[i];
            } else if (a[i] > third && a[i] != second) {
                third = a[i];
            }
        }
        System.out.println("Three largest elements are : " + first + " " + second + " " + third);
    }

    // Driver program to test above function
    public static void main(String[] args) {
        int a[] = { 1, 90, 4, 6, 7, 8, 3, 45, 2, 9, 10, 54, 100 };
        int n = a.length;
        print3Largest(a, n);
    }

}
