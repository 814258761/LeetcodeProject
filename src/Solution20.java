import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution20 {
    public static boolean isValid(String s) {
        if (s.length()%2 == 1){
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        Map<Character,Character> map = new HashMap<Character,Character>(){
            {
                put(')','(');
                put(']','[');
                put('}','{');
            }
        };
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)){
                if (stack.isEmpty() || stack.peek() != map.get(c)){
                    return false;
                }
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid(""));
    }
}
