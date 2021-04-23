import java.util.ArrayList;
import java.util.List;

public class letter2num {
    static String[] alpha = new String[]{"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv","wxyz"};
    List<String> ans = new ArrayList<>();
    StringBuilder temp = new StringBuilder();
    public List<String> letterCombinations(String digits) {
        dfs(0, digits);
        return ans;
    }
    public void dfs (int index, String digits) {
        if (index == digits.length()) {
            ans.add(temp.toString());
            return;
        }
        String cur = alpha[digits.charAt(index)-'2'];
        for (int i = 0; i < cur.length(); i++ ) {
            temp.append(cur.charAt(i));
            dfs(index+1, digits);
            temp.deleteCharAt(temp.length()-1);
        }
    }
}
