/*
Question :  You are given an array of integers and a pivot. Rearrange the array in the following order: [all elements less than pivot, elements equal to pivot, elements greater than pivot] For example, a = [5,2,4,4,6,4,4,3] and pivot = 4 --> result = [3,2,4,4,4,4,5,6]
*/

package Two_Pointer_Pattern_Practice_Questions;

import java.util.Arrays;

class IndiaNationalFlag
{
    public static void main (String args[])
    {
        //region TestCases
        
        //first test case
        
        int[] arr = new int[] {5,2,4,4,6,4,4,3};
        int pivot = 4;
        
        //endregion

        int[] result = IndiaNationalFlag.RearrangeUsingPivot(arr, pivot);

        System.out.println(Arrays.toString(result));            
        
    }


    public static int[] RearrangeUsingPivot(int[] arr, int pivot)
    {
        int start = 0;
        int end = arr.length-1;

        int i = 0;
        while(i < end)
        {
            if(arr[i] < pivot)
            {
                swap(arr, start, i);
                start++;
                i++;
            }
            else if(arr[i] > pivot)
            {
                swap(arr, end, i);
                end--;
            }
            else
            {
                i++;
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int t1, int t2)
    {
        int temp = arr[t1];
        arr[t1] = arr[t2];
        arr[t2] = temp;

    }
}