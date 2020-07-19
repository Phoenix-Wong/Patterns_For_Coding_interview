/*
Question : Given an array of positive numbers and a positive number ‘S’, find the length of the smallest contiguous subarray whose sum is greater than or equal to ‘S’. Return 0, if no such subarray exists.
*/

package Two_Pointer_Pattern_Practice_Questions;
import java.util.Arrays;


class FindGivenSumInSortedArray
{
    public static void main (String args[])
    {
        //region TestCases
        
        //first test case
        int sum = 6;
        int[] arr = new int[] {1,2,3,4,6};
        
        //endregion

        int[] result = FindGivenSumInSortedArray.findGivenSumInSortedArray(arr, sum);

        System.out.println(Arrays.toString(result));
    }



    public static int[] findGivenSumInSortedArray(int[] arr, int sum)
    {
        int startPointer = 0;
        int endPointer = arr.length - 1;

        while(startPointer <= endPointer)
        {
            if (arr[startPointer] + arr[endPointer] > sum) {
                endPointer--;
            } else if (arr[startPointer] + arr[endPointer] < sum) {
                startPointer++;
            } else {
                return new int[] { startPointer, endPointer };
            }
        }
        return null;
    }
}