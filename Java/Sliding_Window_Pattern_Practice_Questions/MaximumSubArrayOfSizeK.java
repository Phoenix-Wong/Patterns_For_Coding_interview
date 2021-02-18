/*
Question : Given an array of positive numbers and a positive number ‘k’, find the maximum sum of any contiguous subarray of size ‘k’.
*/

package Sliding_Window_Pattern_Practice_Questions;

class MaximumSubArrayOfSizeK
{
    public static void main (String args[])
    {
        //region TestCases

        //first test case
        //int k = 2;
        //int[] arr = new int[] {2, 1, 5, 1, 3, 2};


        //2nd test case
        int k = 3;
        int[] arr = new int[] { 2, 3, 4, 1, 5 };

        //endregion

        int result = MaximumSubArrayOfSizeK.findMaximumSubArray(arr, k);

        System.out.println(result);
    }



//    public static int findMaximumSubArray(int[] arr, int k)
//    {
//        int maxSum = 0;
//        int windowSum = 0;
//        int windowStarts = 0;
//        for(int windowEnd = 0; windowEnd < arr.length; windowEnd++)
//        {
//            windowSum += arr[windowEnd];
//
//            if (windowEnd >= k - 1) {
//                maxSum = Math.max(maxSum, windowSum);
//                windowSum -= arr[windowStarts];
//                windowStarts++;
//            }
//        }
//        return maxSum;
//    }

    public static int findMaximumSubArray(int[] arr, int k){
        int maxSum = 0;
        int windowSum = 0;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum+=arr[windowEnd];
            if (windowEnd>=k-1){
                maxSum = Math.max(maxSum,windowSum);
                //删除首位,保留重复sum
                windowSum -=arr[windowStart];
                windowStart++;
            }
        }
        return maxSum;
    }
}
