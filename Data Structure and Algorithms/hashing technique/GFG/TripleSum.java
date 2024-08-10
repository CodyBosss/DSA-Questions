import java.util.HashSet;

public class TripleSum {
    static boolean findTriplet(int A[], int arr_size, int sum) {
        // Fix the first element
        for (int i = 0; i < arr_size - 2; i++) {
            // Find pair in subarray A[i+1..n-1]
            // // with sum equal to sum - A[i]
            HashSet<Integer> s = new HashSet<Integer>();
            int curr_sum = sum - A[i];
            for (int j = i + 1; j < arr_size; j++) {
                if (s.contains(curr_sum - A[j])) {
                    // System.out.printf("Triplet is " + A[i] + ", " + A[j] + ", " +
                    // (curr_sum - A[j]));
                    return true;
                }
                s.add(A[j]);
            }
        }

        // If no triplet was found
        return false;
    }

    public static void main(String[] args) {
        int A[] = { 1, 2, 3, 4, 5, 6 };
        int sum = 9;
        int arr_size = A.length;

        System.out.println(findTriplet(A, arr_size, sum));
    }
}
