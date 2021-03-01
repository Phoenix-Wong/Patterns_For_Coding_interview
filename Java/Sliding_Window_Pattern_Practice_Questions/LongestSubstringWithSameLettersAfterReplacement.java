package Sliding_Window_Pattern_Practice_Questions;

import java.util.HashMap;
import java.util.Map;

/**
 * @author MikeWang
 * @date 2021/2/25 2:19 下午
 */
public class LongestSubstringWithSameLettersAfterReplacement {

    public static int findLength(String str, int k) {
        int windowStart = 0;
        int maxLength = 0;
        int maxRepeatLetterCount = 0;
        Map<Character, Integer> letterFrequencyMap = new HashMap<>();
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);
            letterFrequencyMap.put(rightChar, letterFrequencyMap.getOrDefault(rightChar, 0) + 1);
            maxRepeatLetterCount = Math.max(maxRepeatLetterCount, letterFrequencyMap.get(rightChar));

            if (windowEnd - windowStart + 1 - maxRepeatLetterCount > k) {
                char leftChar = str.charAt(windowStart);
                letterFrequencyMap.put(leftChar, letterFrequencyMap.get(leftChar) - 1);
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(LongestSubstringWithSameLettersAfterReplacement.findLength("aabccbb", 2));
        System.out.println(LongestSubstringWithSameLettersAfterReplacement.findLength("abbcb", 1));
        System.out.println(LongestSubstringWithSameLettersAfterReplacement.findLength("abccde", 1));
    }
}
