import java.util.Stack;

public class VaildParent {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
            }else {
                char top = stack.peek();
                switch (s.charAt(i)) {
                    case '}':
                        if (top == '{') {
                            stack.pop();
                            break;
                        }
                    case ')':
                        if (top == '(') {
                            stack.pop();
                            break;
                        }
                    case ']':
                        if (top == '[') {
                            stack.pop();
                            break;
                        }
                    default:
                        stack.push(s.charAt(i));
                }
            }
            System.out.println(stack.size());

        }
        return stack.isEmpty();

    }
}
