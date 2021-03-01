/*
Question : Given a set with distinct elements, find all of its distinct subsets.
*/

package Subset_Pattern_Practice_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Subsets {
    public static void main(String args[]) {
        // region TestCases

        // first test case

        int[] arr = new int[]{1, 5, 3};

        // endregion

        List<List<Integer>> result = Subsets.findSubsets(arr);

        for (List<Integer> i : result) {
            System.out.println(Arrays.toString(i.toArray()));
        }
    }

    public static List<List<Integer>> findSubsets(int[] arr) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        //Add empty array
        result.add(new ArrayList<>());

        //traverse through every element
        for (int num : arr) {
            //take current size of the all subsets
            int n = result.size();
            //for every subset add new element to it
            for (int i = 0; i < n; i++) {
                List<Integer> set = new ArrayList<>(result.get(i));
                set.add(num);
                result.add(set);
            }
        }
        return result;
    }


}
