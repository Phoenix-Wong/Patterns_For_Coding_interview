/*
Question : Given an array of integers that can be both +ve and -ve, find the contiguous subarray with the largest sum. For example: [1,2,-1,2,-3,2,-5] -> first 4 elements have the largest sum. Return (0,3).
*/

package Sliding_Window_Pattern_Practice_Questions;

import java.util.Arrays;

class MaximumSubArray
{
    public static void main (String args[])
    {
        //region TestCases
        
        int[] arr = new int[] { 1,2,-1,2,-3,2,-5 };
        
        //endregion

        int[] result = MaximumSubArray.maximumSubArray(arr);

        System.out.println(Arrays.toString(result));
    }

    public static int[] maximumSubArray(int[] arr)
    {
        int final_Start = 0;
        int final_End = 0;
        int maxSum = 0;
        int tempSum = Integer.MIN_VALUE;
        int tempStart = 0;
        int tempEnd = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] < tempSum+arr[i])
            {
                tempSum += arr[i];
                tempEnd = i;
            }
            else
            {
                tempSum = arr[i];
                tempStart = tempEnd = i;
            }

            if(maxSum < tempSum)
            {
                maxSum = tempSum;
                final_End = tempEnd;
                final_Start = tempStart;
            }
        }

        return new int[] {final_Start , final_End};
    }
}