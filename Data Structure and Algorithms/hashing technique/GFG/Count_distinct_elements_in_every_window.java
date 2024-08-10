import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Count_distinct_elements_in_every_window {
    public static void main(String[] args) {
        int[] A = { 10, 20, 50, 30, 40, 80, 60 };
        System.out.println(countDistinct(A, 0, 0));
    }

    static ArrayList<Integer> countDistinct(int A[], int n, int k) {
        ArrayList<Integer> al = new ArrayList<>();
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < k; i++) {
            hm.put(A[i], hm.getOrDefault(A[i], 0) + 1);
        }
        al.add(hm.size());
        for (int i = k; i < n; i++) {
            if (hm.get(A[i - k]) == 1) {
                hm.remove(A[i - k]);
            } else {
                hm.put(A[i - k], hm.get(A[i - k]) - 1);
            }
            hm.put(A[i], hm.getOrDefault(A[i], 0) + 1);
            al.add(hm.size());
        }

        return al;

    }

}