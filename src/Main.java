import ArraysAndHashing.*;
import TwoPointers.MaxArea;
import TwoPointers.TwoSum2;
import TwoPointers.ValidPalindrome;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContainsDuplicate duplicate = new ContainsDuplicate();
        IsAnagram anagram = new IsAnagram();
        TwoSum twoSum = new TwoSum();
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        TopKFrequentElement el = new TopKFrequentElement();
        ProductOfArrayExceptSelf products = new ProductOfArrayExceptSelf();
        ValidPalindrome validPalindrome = new ValidPalindrome();
        TwoSum2 twoSum2 = new TwoSum2();
        MaxArea maxArea = new MaxArea();

        int[] nums = {1,2,3,4};
        int[] nums2 = {1, 2, 2, 3, 3, 3, 3};
        int[] nums3 = {1, 2, 4, 6};
        int[] heights = {1 ,7, 2, 5, 4, 7, 3 ,6};
        String[] strings = {"act", "pots", "tops", "cat", "stop", "hat"};

        System.out.println(duplicate.hasDuplicate(nums));
        System.out.println(anagram.anagram("olleh", "hello"));
        System.out.println(Arrays.toString(twoSum.twoSum(nums, 4)));
        System.out.println(groupAnagrams.anagrams(strings));
        System.out.println(Arrays.toString(el.kthElement(nums2, 2)));
        System.out.println(Arrays.toString(products.products(nums3)));
        System.out.println(validPalindrome.isPal("A man, a plan, a canal: Panama!"));
        System.out.println(Arrays.toString(twoSum2.twoSum2(nums3, 8)));
        System.out.println(maxArea.maxArea(heights));

    }
}