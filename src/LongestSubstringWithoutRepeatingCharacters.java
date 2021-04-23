public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if (s.length()==0) {
            return 0;
        }
        int[] nums = new int[128];
        int l = -1, r = 0;
        int ans = 0;
        while (r < s.length()){
            int index = s.charAt(r)-' ';
            if (nums[index] > 0) {
                l = Math.max(nums[index]-1, l);
            }
            ans = Math.max(ans, r-l);
            nums[index] = r+1;
            r++;
        }
        return ans;
    }
}
