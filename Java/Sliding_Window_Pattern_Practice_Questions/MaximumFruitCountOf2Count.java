/*
Question : Given an array of positive numbers and a positive number ‘k’, find the maximum sum of any contiguous subarray of size ‘k’.
*/

package Sliding_Window_Pattern_Practice_Questions;

import java.util.HashMap;

class MaximumFruitCountOf2Count
{
    public static void main (String args[])
    {
        /*
        region TestCases    
        
        Input: Fruit = ['A', 'B', 'C', 'A', 'C']
        Output: 3
        Explanation: We can put 2 'C' in one basket and one 'A' in the other from the subarray ['C', 'A', 'C']
        
        endregion
        */

        char[] arr = new char[] {'A', 'B', 'C', 'B', 'B', 'C'};

        int result = MaximumFruitCountOf2Count.findMaximumSubArray(arr);

        System.out.println(result);
    }


    //sliding window
    public static int findMaximumSubArray(char[] arr)
    {
        
        int windowStart = 0;
        int maxCount = 0;
        HashMap<Character, Integer> map = new HashMap<>();        

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++)
        {
            
            //till we have 2 different element in map

            if(map.size() <= 2)
            {
                if (map.containsKey(arr[windowEnd])) {
                    map.put(arr[windowEnd], map.get(arr[windowEnd]) + 1);
                }
                else
                {
                    map.put(arr[windowEnd], 0);
                }
            }
            
            maxCount = Math.max(maxCount, windowEnd - windowStart + 1);

            //start shrinking till one element is completely removed
            while(map.size() > 2)
            {    
                if(map.containsKey(arr[windowStart]))
                {
                    int result = map.get(arr[windowStart]) == 0 ? map.remove(arr[windowStart])
                            : map.put(arr[windowStart], map.get(arr[windowStart]) - 1);
                }
                
                windowStart++;
            }

            //do it again

        }

        return maxCount;
    }
}