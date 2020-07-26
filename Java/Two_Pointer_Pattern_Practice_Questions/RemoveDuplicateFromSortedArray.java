/*
Question : Given an array of sorted numbers and a target sum, find a pair in the array whose sum is equal to the given target.
*/

package Two_Pointer_Pattern_Practice_Questions;


class RemoveDuplicateFromSortedArray
{
    public static void main (String args[])
    {
        //region TestCases
        
        //first test case
        
        int[] arr = new int[] {2, 3, 3, 3, 6, 9, 9};
        
        //endregion

        int result = RemoveDuplicateFromSortedArray.removeDuplicateFromSortedArray(arr);

        System.out.println(result);
    }



    public static int removeDuplicateFromSortedArray(int[] arr)
    {
        int start = 1;
        
        for (int i = 1; i < arr.length; i++)
        {
            if(arr[start-1] != arr[i])
            {
                arr[start] = arr[i];
                start++;
            }
        }
        return start;
    }
}