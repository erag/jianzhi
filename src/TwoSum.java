import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> h  = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (h.containsKey(target-nums[i])) {
                return new int[]{i, h.get(target-nums[i])};
            } else {
                h.put(nums[i], i);
            }
        }
        return null;
    }
}
