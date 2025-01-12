package ArraysAndHashing;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public int longestConecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        int result = 0;
        for(int num : nums) {
            if(!set.contains(num - 1)) {
                int len = 1;
                while(set.contains(num + len)) {
                    len++;
                }
                result = Math.max(result, len);
            }
        }
        return result;
    }
}
