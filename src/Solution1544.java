import java.util.Stack;

public class Solution1544 {
    public static String makeGood(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.isEmpty() || Math.abs(c-stack.peek()) != 32){
                stack.push(c);
            }else{
                stack.pop();
            }
        }
        char[] chars = new char[stack.size()];
        for (int i = chars.length - 1; i >= 0; i--) {
            chars[i] = stack.pop();
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        System.out.println(makeGood(""));
    }
}
