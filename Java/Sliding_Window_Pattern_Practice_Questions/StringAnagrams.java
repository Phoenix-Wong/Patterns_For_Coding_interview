package Sliding_Window_Pattern_Practice_Questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author MikeWang
 * @date 2021/3/5 3:30 下午
 * Given a string and a pattern, find all anagrams of the pattern in the given string.
 */
public class StringAnagrams {
    public static List<Integer> findStringAnagrams(String str,String pattern){
        int windowStart =0;
        int matched = 0;
        Map<Character,Integer> charFrequencyMap = new HashMap<>();
        for (char chr :pattern.toCharArray()){
            charFrequencyMap.put(chr,charFrequencyMap.getOrDefault(chr,0)+1);
        }
        List<Integer> resultIndices = new ArrayList<>();
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);
            if (charFrequencyMap.containsKey(rightChar)){
                charFrequencyMap.put(rightChar,charFrequencyMap.get(rightChar) - 1);
                if (charFrequencyMap.get(rightChar)==0){
                    matched++;
                }
            }

            if (matched==charFrequencyMap.size()){
                resultIndices.add(windowStart);
            }
            //shrink the window
            if (windowEnd>=pattern.length()-1) {
                char leftChar = str.charAt(windowStart++);
                if (charFrequencyMap.containsKey(leftChar)){
                    if (charFrequencyMap.get(leftChar) == 0) {
                     matched--;//before putting the character back, decrement the matched count
                    }
                    //put the character back
                    charFrequencyMap.put(leftChar,charFrequencyMap.get(leftChar)+1);
                }
            }

        }
        return resultIndices;
    }

    public static void main(String[] args) {
        System.out.println(StringAnagrams.findStringAnagrams("ppqp","pq"));
        System.out.println(StringAnagrams.findStringAnagrams("abbcabc","abc"));
    }
}
