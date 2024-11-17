package TwoPointers;

public class MaxArea {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int result = 0;
        while(left < right) {
            int len = right - left;
            if(height[left] < height[right]) {
                result = Math.max(result, height[left] * len);
                left++;
            } else {
                result = Math.max(result, height[right] * len);
                right--;
            }
        }
        return result;
    }
}
