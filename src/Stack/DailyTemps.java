package Stack;

import java.util.Stack;

public class DailyTemps {

    public int[] temps(int[] temps) {
        int N = temps.length;
        int[] result = new int[N];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < N; i++) {
            while(!stack.isEmpty() && temps[stack.peek()] < temps[i]) {
                int top = stack.pop();
                int diff = i - top;
                result[top] = diff;
            }
            stack.push(i);
        }
        while(!stack.isEmpty()) {
            int top = stack.pop();
            result[top] = 0;
        }
        return result;
    }
}
