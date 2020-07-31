/*
Question : Given ‘N’ ropes with different lengths, we need to connect these ropes into one big rope with minimum cost. The cost of connecting two ropes is equal to the sum of their lengths.
*/

package Top_K_Element_Pattern_Practice_Questions;

import java.util.PriorityQueue;



class ConnectRopes {
    public static void main(String args[]) {
        // region TestCases
        int[] arr = new int[] {1, 3, 11, 5};
        // endregion

        int result = ConnectRopes.connectRopes(arr);
        System.out.println(result);
    }

    public static int connectRopes(int[] arr )
    {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> a - b);
        
        for(int i = 0; i < arr.length; i++)
        {
            minHeap.offer(arr[i]);
        }

        int cost = 0;
        
        while(minHeap.size() != 1)
        {
            int tempSum = minHeap.poll() + minHeap.poll();
            cost += tempSum;
            minHeap.offer(tempSum);
        }

        return cost;
    }
}