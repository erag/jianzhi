import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String s="0123";
        System.out.println(splitIntoFibonacci(s));
//        ListNode head=new ListNode(0);
//        ListNode q=head;
//        for (int i=0;i<5;i++){
//            q.next= new ListNode(i+1);
//            q=q.next;
//        }
////        int[] a=new int[]{1,2,3,4};
////        int[] pre=java.util.Arrays.copyOfRange(a,0,1);
////        System.out.println(pre);
//        reversel a=new reversel();
//        System.out.println(ReverseList(head));
//        StringBuffer s=new StringBuffer("we are h");
//        LISTRE a=new LISTRE();
//    Mypow m = new Mypow();
//        System.out.println(m.Power(2,9));
    }
    public static List<Integer> splitIntoFibonacci(String S) {
        List<Integer> digit = new ArrayList<>();
        if(S.length()<3){
            return digit;
        }
        backtrace(S.toCharArray(), digit,0);
        return digit;

    }
    public static boolean backtrace(char s[], List<Integer> digit, int index){
        if(index == s.length&&digit.size()>=3)
        {
            return true;
        }
        int len = s.length;
        for(int i = index; i <len; i++)
        {
            System.out.println(s[index]+":"+i+">"+index);
            if(s[index]=='0' && i>index ){
                System.out.println("break");
                break;
            }
            int a = (int)subDigit(s,index,i+1);
            // System.out.println(a);
            if (digit.size() >= 2 && a > digit.get(digit.size() - 1) + digit.get(digit.size() - 2)) {
                break;
            }
            if(digit.size()<=1||digit.get(digit.size()-1)+digit.get(digit.size()-2)==a){
                if(digit.size()>1)
                    System.out.println(digit.get(digit.size()-2)+":"+digit.get(digit.size()-1)+":"+a);
                digit.add(a);

                if(backtrace(s, digit, i+1)){
                    return true;
                }
                digit.remove(digit.size()-1);
            }

        }
        return false;

    }
    private static long subDigit(char[] digit, int start, int end) {
        long res = 0;
        for (int i = start; i < end; i++) {
            res = res * 10 + digit[i] - '0';
        }
        return res;
    }
}
