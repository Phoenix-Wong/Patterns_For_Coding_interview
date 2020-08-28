/*
Question : 2 Sum Problem: Given a sorted array of integers, find two numbers in the array that sum to a given integer target. For example, if a = [1,2,3,5,6,7] and target = 11, the answer will be 5 and 6.
*/

package Two_Pointer_Pattern_Practice_Questions;

import java.util.Arrays;

class TwoSum
{
    public static void main (String args[])
    {
        //region TestCases
        
        //first test case
        
        int[] arr = new int[] {1,2,3,5,6,7};
        int target = 11; 
        
        //endregion

        int[] result = TwoSum.FindTwoSum(arr, target);

        System.out.println(Arrays.toString(result));            

    }

    public static int[] FindTwoSum(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;

        while(start < end)
        {
            if(arr[start] + arr[end] == target)
            {
                return new int[] { arr[start], arr[end]};
            }
            else if(arr[start] + arr[end] > target)
            {
                end--;
            }
            else
            {
                start++;
            }
        }
        return null;
    }
}