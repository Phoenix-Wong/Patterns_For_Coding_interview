/*
Question : Given a string, find the length of the longest substring in it with no more than K distinct characters.
*/

package Sliding_Window_Pattern_Practice_Questions;

import java.util.HashMap;
import java.util.Map;

class LongestSubStringDistinctK {
    public static void main(String args[]) {
        /* TestCases

        Input: String="araaci", K=2
        Output: 4
        Explanation: The longest substring with no more than '2' distinct characters is "araa".

        Input: String="araaci", K=1
        Output: 2
        Explanation: The longest substring with no more than '1' distinct characters is "aa".

        Input: String="cbbebi", K=3
        Output: 5
        Explanation: The longest substrings with no more than '3' distinct characters are "cbbeb" & "bbebi".

        */

        String S = "cbbebi";
        char[] arr = S.toCharArray();
        int k = 2;
        int result = LongestSubStringDistinctK.longestSubString(arr, k);

        System.out.println(result);
    }


//    public static int longestSubString(char[] arr, int k)
//    {
//        if( arr == null || arr.length < k - 1)
//        {
//            throw new IllegalArgumentException();
//        }
//
//        int maxLength = Integer.MIN_VALUE;
//        int windowStart = 0;
//        Map<Character, Integer> map = new HashMap<>();
//
//        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++)
//        {
//            //insert two element in hashmap
//            while(windowEnd < arr.length)
//            {
//                //expand sliding array till get another element
//                if (map.containsKey(arr[windowEnd])) {
//                    map.put(arr[windowEnd], map.get(arr[windowEnd]) + 1);
//                } else {
//
//                    if (map.size() == k) {
//                        break;
//                    }
//
//                    map.put(arr[windowEnd], 0);
//                }
//                windowEnd++;
//            }
//
//            //set max length
//            maxLength = Math.max(maxLength, windowEnd - windowStart);
//
//
//            //put new element to increase size of map
//            map.put(arr[windowEnd],0);
//
//            //start shrinking sliding array till hashmap size is only 2
//            while(windowStart < windowEnd)
//            {
//                if(map.containsKey(arr[windowStart]))
//                {
//                    if (map.get(arr[windowStart]) == 0)
//                    {
//                        map.remove(arr[windowStart]);
//                    }
//                    else
//                    {
//                        map.put(arr[windowStart], map.get(arr[windowStart]) - 1);
//                    }
//                }
//
//                windowStart++;
//
//                if (map.size() == k)
//                {
//                    break;
//                }
//
//
//            }
//
//
//            //do it again
//        }
//
//
//
//
//
//        return maxLength;
//    }

    public static int longestSubString(char[] arr, int k) {
        if (arr == null || arr.length == 0 || arr.length < k) {
            throw new IllegalArgumentException();
        }
        int windowStart = 0;
        int maxLength = 0;
        Map<Character, Integer> charMap = new HashMap<>();
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            char rightChar = arr[windowEnd];
            charMap.put(rightChar, charMap.getOrDefault(rightChar, 0) + 1);
            while (charMap.size() > k) {
                char leftChar = arr[windowStart];
                charMap.put(leftChar, charMap.get(leftChar) - 1);
                if (charMap.get(leftChar) == 0) {
                    charMap.remove(leftChar);
                }
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
    }
}
