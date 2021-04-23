import java.util.ArrayList;
import java.util.List;

public class Generate_Parentheses {
    List<String> ans = new ArrayList<String>();
    StringBuilder s = new StringBuilder();
    public List<String> generateParenthesis(int n) {
        dfs(n,0,0);
        return ans;

    }
    public void dfs(int n, int left, int right) {
        if (left > n || right > left){
            return;
        }
        if (s.length() == n) {
            ans.add(s.toString());
            return;
        }
        s.append('(');
        dfs(n, left+1, right);
        s.deleteCharAt(s.length()-1);
        s.append(')');
        dfs(n, left, right+1);
        s.deleteCharAt(s.length()-1);

    }

}
