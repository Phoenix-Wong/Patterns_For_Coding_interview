/*
Question : Design a class to calculate the median of a number stream. The class should have the following two methods: 1: insertNum(int num): stores the number in the class. 2: findMedian(): returns the median of all numbers inserted in the class. If the count of numbers inserted in the class is even, the median will be the average of the middle two numbers.
*/

package Two_Heap_Search_Pattern_Practice_Questions;

import java.util.PriorityQueue;

class MedianOfStream {
    public static void main(String args[]) {
        // region TestCases

        // first test case

        MedianOfStream medianOfStream = new MedianOfStream();
        medianOfStream.insertValue(3);
        medianOfStream.insertValue(1);
        System.out.println("Median is : " + medianOfStream.findMedian());
        medianOfStream.insertValue(5);
        System.out.println("Median is : " + medianOfStream.findMedian());
        medianOfStream.insertValue(4);
        System.out.println("Median is : " + medianOfStream.findMedian());

        // endregion

    }

    PriorityQueue<Integer> minHeap;
    PriorityQueue<Integer> maxHeap;


    public MedianOfStream() {
        minHeap = new PriorityQueue<>((a, b) -> a - b); // increasing order
        maxHeap = new PriorityQueue<>((a,b) -> b - a); // decreasing order
    }

    public void insertValue(int num)
    {
        if(maxHeap.isEmpty() || maxHeap.peek() >= num)
        {
            maxHeap.add(num);
        }
        else
        {
            minHeap.add(num);
        }

        // both heap size need to be equal or max heap can have one extra element
        if(maxHeap.size() > minHeap.size() + 1)
        {
            //moving element from maxHeap to minHeap
            minHeap.add(maxHeap.poll());
        } else if (maxHeap.size() < minHeap.size())
        {
            maxHeap.add(minHeap.poll());
        }

    }

    public double findMedian()
    {
        
        if (maxHeap.size() == minHeap.size())
        {
            return maxHeap.peek() / 2.0 + minHeap.peek() / 2.0;
        }
        
        return minHeap.peek();
    }


   
    
    
}