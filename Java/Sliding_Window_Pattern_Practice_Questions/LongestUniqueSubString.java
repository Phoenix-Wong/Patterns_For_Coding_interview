/*
Question : Given a String, find the longest substring with unique characters. For example: "whatwhywhere" --> "atwhy".
*/

package Sliding_Window_Pattern_Practice_Questions;

import java.util.HashMap;

class LongestUniqueSubString
{
    public static void main (String args[])
    {
        //region TestCases
        
        String s = "whatwhywhere";
        
        //endregion

        String result = LongestUniqueSubString.uniqueSubString(s);

        System.out.println(result);
    }

    public static String uniqueSubString(String input)
    {
        String output = "";
        int start = 0;
        int end = 0;
        HashMap<Character,Integer> map = new HashMap<>();

        while(end < input.length())
        {
            if(map.containsKey(input.charAt(end)))
            {
                if(output.length() < end-start)
                {
                    output = input.substring(start, end );
                }
                start = map.get(input.charAt(end)) + 1;
            }

            map.put(input.charAt(end), end);
            end++;
        }
        return output;
    }
}