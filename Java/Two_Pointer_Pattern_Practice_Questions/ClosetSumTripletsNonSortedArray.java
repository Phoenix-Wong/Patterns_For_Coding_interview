/*
Question : Given an array of unsorted numbers and a target number, find a triplet in the array whose sum is as close to the target number as possible, return the sum of the triplet. If there are more than one such triplet, return the sum of the triplet with the smallest sum.
*/

package Two_Pointer_Pattern_Practice_Questions;

class ClosetSumTripletsNonSortedArray
{
    public static void main (String args[])
    {
        //region TestCases
        
        //first test case
        
        int[] arr = new int[] {-3, -1, 1, 2};
        int target = 1;
        //endregion

        int result = ClosetSumTripletsNonSortedArray.closetSumTripletsNonSortedArray(arr, target);

        
        System.out.println(result);            
        
    }



    public static int closetSumTripletsNonSortedArray(int[] arr, int target)
    {
        //sort the array
        int smallestDiff = Integer.MAX_VALUE;
        
        //pick one element and use two sum 
        //using triplets thats why length-2
        for (int i = 0; i < arr.length-2; i++)
        {
            int start = i + 1;
            int end = arr.length - 1;

            while (start < end) {

                int targetDiff = target - arr[i] - arr[start] - arr[end];
                if (targetDiff == 0) {
                    //we found exact match let's return 
                    return target - targetDiff;
                }
                
                if (Math.abs(targetDiff) < Math.abs(smallestDiff) ||
                    (Math.abs(targetDiff) == Math.abs(smallestDiff) && targetDiff > smallestDiff ))
                {
                    smallestDiff = targetDiff;
                }

                if(targetDiff > 0)
                {
                    start++;
                }
                else
                {
                    end--;
                }
            }
        }
        return target - smallestDiff;
    }
}