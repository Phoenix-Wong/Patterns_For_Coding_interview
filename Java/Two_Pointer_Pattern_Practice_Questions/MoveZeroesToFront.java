/*
Question :  You are given an array of integers. Rearrange the array so that all zeroes are at the beginning of the array. For example, a = [4,2,0,1,0,3,0] -> [0,0,0,4,1,2,3]
*/

package Two_Pointer_Pattern_Practice_Questions;

import java.util.Arrays;

class MoveZeroesToFront
{
    public static void main (String args[])
    {
        //region TestCases
        
        //first test case
        
        int[] arr = new int[] {4,2,0,1,0,3,0};
        
        //endregion

        int[] result = MoveZeroesToFront.moveZeroes(arr);

        System.out.println(Arrays.toString(result));            
        
    }

    public static int[] moveZeroes(int[] arr)
    {
        int start = 0;
        int curr_Pointer = getNextZeroIndex(arr, 0);
        while(curr_Pointer < arr.length)
        {
            swap(arr, start, curr_Pointer);
            curr_Pointer = getNextZeroIndex(arr, curr_Pointer++);
            start++;
        }
        return arr;
    }

    public static void swap(int[] arr, int t1 , int t2)
    {
        int temp = arr[t1];
        arr[t1] = arr[t2];
        arr[t2] = temp;
    }

    public static int getNextZeroIndex(int[] arr, int index)
    {
        while(index < arr.length)
        {
            if(arr[index] == 0) return index;
            index++;
        }
        return index;
    }
}