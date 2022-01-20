import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        String string1 = "s * (s – a) * (s – b) * (s – c)";
        String string2 = "s * (s – a) * (s – b * (s – c)    ";
        System.out.println(parenthesesCheck(string1));
        System.out.println(parenthesesCheck(string2));
    }

    public static boolean parenthesesCheck(String string) {
        final char OPEN = '(';
        final char CLOSE = ')';
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == OPEN) {
                stack.push(OPEN);
            }
            if (string.charAt(i) == CLOSE) {
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}