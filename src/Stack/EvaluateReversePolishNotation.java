package Stack;

import java.util.Stack;

public class EvaluateReversePolishNotation {

    public int evaluateRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int val1;
        int val2;
        for (String token : tokens) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    val1 = stack.pop();
                    val2 = stack.pop();
                    stack.push(val2 - val1);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    val1 = stack.pop();
                    val2 = stack.pop();
                    stack.push(val2 / val1);
                    break;
                default:
                    stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
