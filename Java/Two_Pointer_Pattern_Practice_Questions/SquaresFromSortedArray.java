/*
Question : Given a sorted array, create a new array containing squares of all the number of the input array in the sorted order.
*/

package Two_Pointer_Pattern_Practice_Questions;

import java.util.Arrays;

class SquaresFromSortedArray
{
    public static void main (String args[])
    {
        //region TestCases
        
        //first test case
        
        int[] arr = new int[] {-2, -1, 0, 2, 3};
        
        //endregion

        int[] result = SquaresFromSortedArray.squaresFromSortedArray(arr);

        System.out.println(Arrays.toString(result));
    }



    public static int[] squaresFromSortedArray(int[] arr)
    {
        int[] newArr = new int[arr.length];

        int startPointer = 0;
        int endPointer = arr.length - 1;
        int i = arr.length-1;
        while(startPointer <= endPointer)
        {
            if (Math.abs(arr[startPointer]) < Math.abs(arr[endPointer])) {
                newArr[i] = Math.abs(arr[endPointer]) * Math.abs(arr[endPointer]);
                endPointer--;
            } else {
                newArr[i] = Math.abs(arr[startPointer]) * Math.abs(arr[startPointer]);
                startPointer++;
            }

            i--;
        }
        
        return newArr;
    }
}