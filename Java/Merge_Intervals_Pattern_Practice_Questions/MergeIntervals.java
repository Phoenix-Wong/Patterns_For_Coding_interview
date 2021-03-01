/*
Question : Given a list of intervals, merge all the overlapping intervals to produce a list that has only mutually exclusive intervals.
*/

package Merge_Intervals_Pattern_Practice_Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Interval {
    public int start;
    public int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

class MergeIntervals {
    public static void main(String args[]) {
        //region TestCases

        //first test case
        List<Interval> listOfIntervals = new ArrayList<>();
        listOfIntervals.add(new Interval(1, 4));
        listOfIntervals.add(new Interval(2, 5));
        listOfIntervals.add(new Interval(7, 9));

        //endregion

        List<Interval> result = MergeIntervals.mergeIntervals(listOfIntervals);

        for (Interval i : result) {
            System.out.println(i.start + " , " + i.end);
        }
    }


    public static List<Interval> mergeIntervals(List<Interval> list) {
        List<Interval> result = new ArrayList<>();

        //sort the list using start
        Collections.sort(list, (a, b) -> Integer.compare(a.start, b.start));

        //get first
        int start = list.get(0).start;
        int end = list.get(0).end;

        //iterate through the list and merge
        for (Interval i : list.subList(1, list.size())) {
            if (end > i.start) // overlapping
            {
                end = Math.max(end, i.end);
            } else //not overlapping add previous one i.e. tempInterval
            {
                result.add(new Interval(start, end));
                start = i.start;
                end = i.end;
            }
        }

        result.add(new Interval(start, end));
        return result;
    }
}
