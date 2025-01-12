package ArraysAndHashing;

public class ProductOfArrayExceptSelf {

    public int[] products(int[] nums) {
        int n = nums.length;
        int[] leftProducts = new int[n];
        int[] rightProducts = new int[n];
        int[] result = new int[n];
        leftProducts[0] = 1;
        rightProducts[n - 1] = 1;
        for (int i = 1; i < n; i++) {
            leftProducts[i] = nums[i -1] * leftProducts[i - 1];
        }
        for(int i = n - 2; i >= 0; i--) {
            rightProducts[i] = nums[i + 1] * rightProducts[i + 1];
        }
        for(int i = 0; i < n; i++) {
            result[i] = leftProducts[i] * rightProducts[i];
        }
        return result;
    }

    public int[] productsOptimized(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        result[0] = 1;
        for(int i = 1; i < n; i++) {
            result[i] = result[i -1] * nums[i - 1];
        }
        int postfix = 1;
        for(int i = n -1; i >= 0; i--) {
            result[i] += postfix;
            postfix *= nums[i];
        }
        return result;
    }
}
