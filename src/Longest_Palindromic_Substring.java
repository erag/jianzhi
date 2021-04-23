public class Longest_Palindromic_Substring {
    public String longestPalindrome(String s) {
        int len = 0;
        int l = 0, r = 0;
        for (int i = 0; i < s.length()-1; i++) {
            int l1 = getlength(s, i, i);
            int l2 = getlength(s, i, i+1);
            len = Math.max(len, Math.max(l1,l2));
            if (len == l1) {
                l = i-l1/2;
                r = i +l1/2;
            }
            if (len == l2) {
                l = i-l2/2+1;
                r = i +l2/2;
            }
        }
        return s.substring(l,r+1);
    }
    public int getlength(String s, int l1, int l2){
        while (s.charAt(l1) == s.charAt(l2)) {
            l1--;
            l2++;
            if (l1 < 0 || l2 >= s.length()) {
                break;
            }
        }
        return l2-l1-1;
    }
}
