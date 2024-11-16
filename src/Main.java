import ArraysAndHashing.ContainsDuplicate;
import ArraysAndHashing.IsAnagram;
import ArraysAndHashing.TwoSum;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContainsDuplicate duplicate = new ContainsDuplicate();
        IsAnagram anagram = new IsAnagram();
        TwoSum twoSum = new TwoSum();
        int[] nums = {1,2,3,4};

        System.out.println(duplicate.hasDuplicate(nums));
        System.out.println(anagram.anagram("olleh", "hello"));
        System.out.println(Arrays.toString(twoSum.twoSum(nums, 4)));

    }
}