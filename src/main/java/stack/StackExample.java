package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("[{()}]");
        stringList.add("()()(()){{}]");
        stringList.add("(((())){})[[]()]");

        for (String string : stringList) {
            try {
                System.out.println(isValid(string));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static boolean isValid(String value) throws Exception {
        Stack<Character> stack = new Stack();
        for (Character c : value.toCharArray()) {
            Character reverse = getReverseBracket(c);
            if (reverse == null) throw new Exception("Undefined bracket");
            if (isLeftBracket(c)) {
                stack.push(c);
                continue;
            }
            if (!stack.isEmpty() && stack.peek() == reverse) {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    private static Character getReverseBracket(char c) {
        if (c == '{') return '}';
        if (c == '[') return ']';
        if (c == '(') return '(';
        if (c == '}') return '{';
        if (c == ']') return '[';
        if (c == ')') return '(';
        return null;
    }

    private static boolean isLeftBracket(char c) {
        if (c == '{' || c == '(' || c == '[') {
            return true;
        }
        return false;
    }
}
