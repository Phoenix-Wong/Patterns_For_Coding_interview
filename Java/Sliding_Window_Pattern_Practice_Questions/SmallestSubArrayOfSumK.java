/*
Question : Given an array of positive numbers and a positive number ‘S’, find the length of the smallest contiguous subarray whose sum is greater than or equal to ‘S’. Return 0, if no such subarray exists.
*/

package Sliding_Window_Pattern_Practice_Questions;

class SmallestSubArrayOfSumK {
    public static void main(String args[]) {
        //region TestCases

        //first test case
        int sum = 10;
        int[] arr = new int[]{3, 4, 1, 1, 6};

        //2nd test case
        //int sum = 7;
        //int[] arr = new int[] { 2, 1, 5, 2, 3, 2 };

        //3rd test case
        //int sum = 7;
        //int[] arr = new int[] { 2, 1, 5, 2, 8 };

        //endregion

        int result = SmallestSubArrayOfSumK.findSmallestSubArray(arr, sum);

        System.out.println(result);
    }


//    public static int findSmallestSubArray(int[] arr, int k)
//    {
//        int minLength = Integer.MAX_VALUE;
//        int windowStart = 0;
//        int windowSum = 0;
//        int windowEnd = 0;
//        while(windowEnd < arr.length)
//        {
//            windowSum += arr[windowEnd];
//
//            while(windowSum >= k)
//            {
//                minLength = Math.min(minLength, windowEnd - windowStart + 1 );
//                windowSum -= arr[windowStart];
//                windowStart++;
//
//            }
//            windowEnd++;
//        }
//        return minLength == Integer.MAX_VALUE ? 0 : minLength;
//    }

    public static int findSmallestSubArray(int[] arr, int k) {
        int minLength = Integer.MAX_VALUE;
        int windowStart = 0;
        int windowSum = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd];

            while (windowSum >= k) {
                minLength = Math.min(minLength, windowEnd - windowStart + 1);
                //缩短路径
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}


