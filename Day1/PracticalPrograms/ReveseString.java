
import java.util.Stack;

class Main  {

    public static void main(String[] args) {

        String str = "my name is asha";
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch != ' ') {
                stack.push(ch);
            } else {
                while (!stack.isEmpty()) {
                    result.append(stack.pop());
                }
                result.append(' ');
            }
        }

        // Reverse the last word
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        System.out.println(result);
    }
}
