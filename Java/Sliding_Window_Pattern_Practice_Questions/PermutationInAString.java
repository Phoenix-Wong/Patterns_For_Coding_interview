package Sliding_Window_Pattern_Practice_Questions;

import java.util.HashMap;
import java.util.Map;

/**
 * @author MikeWang
 * @date 2021/3/2 10:38 上午
 * Given a string and a pattern, find out if the string contains any permutation of the pattern.
 */
public class PermutationInAString {
    public static boolean findPermutation(String str,String pattern){
        int windowStart = 0;
        int matched = 0;
        Map<Character,Integer> charFrequencyMap = new HashMap<>();
        for(char chr : pattern.toCharArray()) {
          charFrequencyMap.put(chr, charFrequencyMap.getOrDefault(chr, 0)+1);
        }
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);
            if (charFrequencyMap.containsKey(rightChar)){
                charFrequencyMap.put(rightChar,charFrequencyMap.get(rightChar)-1);
                if (charFrequencyMap.get(rightChar)==0){
                    matched++;
                }
            }

            if (matched==charFrequencyMap.size()) {
                return true;
            }

            if (windowEnd>=pattern.length()-1){
                char leftChar = str.charAt(windowStart++);
                if (charFrequencyMap.containsKey(leftChar)){
                    if (charFrequencyMap.get(leftChar) == 0) {
                        //before putting the character back,decrement the matched count
                        matched--;
                        charFrequencyMap.put(leftChar,charFrequencyMap.get(leftChar)+1);

                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Permutation exist:"+PermutationInAString.findPermutation("oidbcaf","abc"));
        System.out.println("Permutation exist:"+PermutationInAString.findPermutation("odicf","dc"));
        System.out.println("Permutation exist:"+PermutationInAString.findPermutation("aaacb","abc"));
    }
}
