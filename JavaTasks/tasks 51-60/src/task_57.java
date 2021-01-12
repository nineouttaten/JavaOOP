import java.util.*;
public class task_57 {
    public static String longestNonRepeatingSubstring(String str) { // 6.7
        Map<Character, Integer> visitedChars = new HashMap<>();
        String output = "";
        for (int start = 0, end = 0; end < str.length(); end++) {
            char currChar = str.charAt(end);
            if (visitedChars.containsKey(currChar))
                start = Math.max(visitedChars.get(currChar)+1, start);
            if (output.length() < end - start + 1)
                output = str.substring(start, end + 1);
            visitedChars.put(currChar, end);
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(longestNonRepeatingSubstring("abcabcbb"));
        System.out.println(longestNonRepeatingSubstring("aaaaaa"));
        System.out.println(longestNonRepeatingSubstring("abcde"));
    }
}
