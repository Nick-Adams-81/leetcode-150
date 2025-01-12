import ArraysAndHashing.*;
import Stack.CarFleet;
import Stack.DailyTemps;
import Stack.EvaluateReversePolishNotation;
import Stack.ValidParens;
import TwoPointers.MaxArea;
import TwoPointers.RainWater;
import TwoPointers.TwoSum2;
import TwoPointers.ValidPalindrome;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

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
        RainWater rainWater = new RainWater();
        ValidParens validParens = new ValidParens();
        EvaluateReversePolishNotation eval = new EvaluateReversePolishNotation();
        DailyTemps temps = new DailyTemps();
        CarFleet carFleet = new CarFleet();
        RearrangeLetters rearrangeLetters = new RearrangeLetters();
        LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();

        int[] nums = {1,2,3,4};
        int[] nums2 = {1, 2, 2, 3, 3, 3, 3};
        int[] nums3 = {1, 2, 4, 6};
        int[] heights = {1 ,7, 2, 5, 4, 7, 3 ,6};
        int[] water = {0, 2, 0, 3, 1, 0, 1, 3, 2, 1};
        int[] dailyTemps = {30, 38, 30, 36, 35, 40, 28};
        int[] position = {4, 1, 0, 7};
        int[] speed = {2, 2, 1, 1};
        int[] longest = {0, 3, 2, 5, 4, 1, 1};
        String[] strings = {"act", "pots", "tops", "cat", "stop", "hat"};
        String[] tokens = {"1", "2", "+", "3", "*", "4", "-"};

        System.out.println(longestConsecutiveSequence.longestConecutive(longest));


    }
}