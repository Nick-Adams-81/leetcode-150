package ArraysAndHashing;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class RearrangeLetters {

    public String rearrange(String s) {
        if(s.isEmpty()) return "";
        // Count the frequency of each character
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        // Use a priority queue to store chars by frequency
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        pq.addAll(map.keySet());
        // create return string with string builder class
        StringBuilder sb = new StringBuilder();
        char prevChar = '#'; // placeholder for previous character
        int prevCount = 0; // frequency count of previous character
        // Build the result string
        while(!pq.isEmpty()) {
            char currentChar = pq.poll();
            sb.append(currentChar);
            // Decrease the count of the character used, put it back in priority queue
            map.put(currentChar, map.get(currentChar) - 1);
            if(prevCount > 0) {
                pq.add(prevChar);
            }
            // update prevChar and prevCount for the next iteration
            if(map.get(currentChar) > 0) {
                prevChar = currentChar;
                prevCount = map.get(currentChar);
            } else {
                prevChar = '#'; // if there's no more current characters, reset prevChar
                prevCount = 0;
            }
        }
        // if the length of the result string matches the length of the input string, return it
        return sb.length() == s.length() ? sb.toString() : "not possible";
    }
}
