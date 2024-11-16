import ArraysAndHashing.ContainsDuplicate;
import ArraysAndHashing.IsAnagram;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContainsDuplicate duplicate = new ContainsDuplicate();
        IsAnagram anagram = new IsAnagram();
        int[] nums = {1,2,3,4};

        System.out.println(duplicate.hasDuplicate(nums));
        System.out.println(anagram.anagram("olleh", "hello"));

    }
}