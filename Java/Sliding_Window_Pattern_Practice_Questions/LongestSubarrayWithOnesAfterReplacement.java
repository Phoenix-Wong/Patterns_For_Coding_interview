package Sliding_Window_Pattern_Practice_Questions;

/**
 * @author MikeWang
 * @date 2021/3/1 4:05 下午
 * Question:Given an array containing 0s and 1s, if you are allowed to replace no more than ‘k’ 0s with 1s, find the length of the longest contiguous subarray having all 1s.
 */
public class LongestSubarrayWithOnesAfterReplacement {

    public static int findLength(int[] arr,int k){
        int windowStart = 0;
        int maxLength = 0;
        int maxOnesCount  =0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            if (arr[windowEnd] ==1){
                maxOnesCount++;
            }
            if (windowEnd-windowStart+1-maxOnesCount>k){
                if (arr[windowStart] == 1){
                    maxOnesCount--;
                }
                windowStart++;
            }
            maxLength = Math.max(maxLength,windowEnd-windowStart+1);
        }
        return maxLength;
    }


    public static void main(String[] args) {
        System.out.println(LongestSubarrayWithOnesAfterReplacement.findLength(new int[]{0,1,1,0,0,0,1,1,0,1,1},2));
        System.out.println(LongestSubarrayWithOnesAfterReplacement.findLength(new int[]{0,1,0,0,1,1,0,1,1,0,0,1,1},3));
    }
}
