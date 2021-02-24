package Sliding_Window_Pattern_Practice_Questions;

import java.util.HashMap;
import java.util.Map;

/**
 * Question:Given a string, find the length of the longest substring which has no repeating characters.
 */
public class NoRepeatSubstring {

    public static int findLength(String str){
        int windowStart = 0;
        int maxLength = 0;
        Map<Character,Integer> charIndexMap = new HashMap<>();
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);
            if (charIndexMap.containsKey(rightChar)){
                windowStart = Math.max(windowStart,charIndexMap.get(rightChar)+1);
            }
            charIndexMap.put(rightChar,windowEnd);
            maxLength = Math.max(maxLength,windowEnd-windowStart+1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println("Length of the longest substring:"+NoRepeatSubstring.findLength("aabccbb"));
        System.out.println("Length of the longest substring:"+NoRepeatSubstring.findLength("abbb"));
        System.out.println("Length of the longest substring:"+NoRepeatSubstring.findLength("abcdcde"));
    }
}
