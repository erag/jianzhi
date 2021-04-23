import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans  = new ArrayList<>();
        for (int i = 0; i< nums.length-2; i++) {
            if (i != 0 && nums[i] == nums[i-1] ) {
                continue;
            }
            int target = -nums[i];
            int l = i+1, r = nums.length-1;
            while (l < r) {
                while (l != i+1 && nums[l] == nums[l-1] ) {
                    l++;
                }
                while (r != nums.length-1 && nums[r] == nums[r+1] ) {
                    r--;
                }
                if (nums[l]+nums[r] == target) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[l]);
                    temp.add(nums[r]);
                    ans.add(temp);
                } else if (nums[l]+nums[r] < target) {
                    l++;
                } else {
                    r--;
                }
            }

        }
        return ans;


    }
}
