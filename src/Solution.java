import java.util.*;
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
class Solution1 {
    public int numDecodings(String s) {
        int n=s.length();
        int dp=0;
        if(s.charAt(0)=='0'){
            dp=0;
        }else{
            dp=1;
        }
        if(n<2){
            return dp;
        }
        for(int i=1;i<n;i++){
            if((s.charAt(i)>='7'&&s.charAt(i-1)=='2')){
                dp=dp;
            }
            else if(s.charAt(i)==0){
                dp--;
            }
            else{
                dp++;
            }
        }
        return dp;
    }

}