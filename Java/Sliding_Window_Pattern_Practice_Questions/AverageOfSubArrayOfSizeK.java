/*
Question : Given an array, find the average of all contiguous sub-arrays of size ‘K’ in it.
*/

package Sliding_Window_Pattern_Practice_Questions;
import java.util.Arrays;

class AverageOfSubArrayOfSizeK
{
    public static void main (String args[])
    {

        int k = 5;
        int[] arr = new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2};

        double[] result = AverageOfSubArrayOfSizeK.findAverages(arr, k);

        System.out.println(Arrays.toString(result));
    }



    public static double[] findAverages(int[] arr, int k)
    {
        double[] result = new double[arr.length - k + 1];
        int windowStart = 0;
        double windowSum = 0;

        for(int windowEnd = 0; windowEnd < arr.length ; windowEnd++)
        {
            windowSum += arr[windowEnd];

            if (windowEnd >= k - 1) {
                result[windowStart] = windowSum / k;
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return result;
    }
}