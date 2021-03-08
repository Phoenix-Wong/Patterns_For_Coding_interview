package Sliding_Window_Pattern_Practice_Questions;

import java.util.HashMap;
import java.util.Map;

/**
 * @author MikeWang
 * @date 2021/3/8 3:19 下午
 * Given a string and a pattern, find the smallest substring in the
 * given string which has all the characters of the given pattern.
 */
public class SmallestWindowContainingSubstring {

    public static String findSubstring(String str, String pattern){
        int windowStart =0;
        int matched = 0;
        int minLength = str.length()+1;
        int subStrStart = 0;
        Map<Character,Integer> charFrequencyMap = new HashMap<>();
        for (char chr : pattern.toCharArray()) {
            charFrequencyMap.put(chr,charFrequencyMap.getOrDefault(chr,0)+1);
        }
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);
            if (charFrequencyMap.containsKey(rightChar)){
                charFrequencyMap.put(rightChar,charFrequencyMap.get(rightChar)-1);
                //count every matching of a character
                if (charFrequencyMap.get(rightChar) >= 0){
                    matched++;
                }
            }
            //shrink the window if we can,finish as soon as we remove a matched character
            while (matched==pattern.length()){
                if (minLength>windowEnd-windowStart+1){
                    minLength = windowEnd-windowStart+1;
                    subStrStart = windowStart;
                }
                char leftChar = str.charAt(windowStart++);
                if (charFrequencyMap.containsKey(leftChar)){
                    //note that we could have redundant characters,therefore we'll decrement the
                    //matched count only when a useful occurrence of a matched character is going out of the window
                    if (charFrequencyMap.get(leftChar)==0){
                        matched--;
                    }
                    charFrequencyMap.put(leftChar,charFrequencyMap.get(leftChar)+1);
                }
            }
        }
       return  minLength>str.length()?"":str.substring(subStrStart,subStrStart+minLength);
    }

    public static void main(String[] args) {
        System.out.println(SmallestWindowContainingSubstring.findSubstring("aabdec","abc"));
        System.out.println(SmallestWindowContainingSubstring.findSubstring("addabca","abc"));
        System.out.println(SmallestWindowContainingSubstring.findSubstring("adcad","abc"));
    }
}
