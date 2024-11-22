package Stack;

import java.util.Arrays;
import java.util.Stack;

public class CarFleet {

    public int carFleet(int target, int[] position, int[] speed) {
        int N = position.length;
        int[][] pair = new int[N][2];
        for(int i = 0; i < N; i++) {
            pair[i][0] = position[i];
            pair[i][1] = speed[i];;
        }
        Arrays.sort(pair, (a, b) -> Integer.compare(b[0], a[0]));
        Stack<Double> stack = new Stack<>();
        for(int[] p : pair) {
            stack.push((double) (target - p[0]) / p[1]);
            if(stack.size() >= 2 && stack.peek() <= stack.get(stack.size() - 2)) {
                stack.pop();
            }
        }
        return stack.size();
    }
}
