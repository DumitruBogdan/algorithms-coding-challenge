import java.util.Stack;

public class Problem3 {
    public static String game(Stack<Character> jenny, Stack<Character> stephanie) {
        String result = "";
        while (!jenny.isEmpty() || !stephanie.isEmpty()) {
            if (jenny.isEmpty())
                result += stephanie.pop();
            else if (stephanie.isEmpty())
                result += jenny.pop();
            else if (jenny.peek() <= stephanie.peek())
                result += jenny.pop();
            else
                result += stephanie.pop();
        }
        return result;
    }
}
