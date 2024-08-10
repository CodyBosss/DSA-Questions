import java.util.Map;
import java.util.HashMap;

public class twoSumArray {

    int nums[] = { 2, 7, 11, 15 };
    int target = 9;

    public int[] twoSum(int nums[], int target) {

        int n = nums.length;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        return null;
    }

}