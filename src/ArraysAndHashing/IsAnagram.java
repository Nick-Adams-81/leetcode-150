package ArraysAndHashing;

public class IsAnagram {
    public boolean anagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for(int total : count) {
            if(total != 0) return false;
        }
        return true;
    }
}
