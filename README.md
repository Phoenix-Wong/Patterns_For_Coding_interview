# Coding_Interview_Patterns

## Pattern

| # | Title | Basic idea (One line) | Practice Questions |
|---| ----- | --------------------- | ------------------ |
| 1 | Sliding Window Pattern | Contiguous sub-array as a sliding window | [Go Here](#Sliding_Window_Pattern_Practice_Questions) |
| 2 | Two Pointer Pattern | Contiguous sub-array using two pointers | [Go Here](#Two_Pointer_Pattern_Practice_Questions) |
| 3 | Fast Slow Pointer Pattern | using one fast and one slow pointers | [Go Here](#Fast_Slow_Pointer_Pattern_Practice_Questions) |
| 4 | Merge Intervals Pattern Practice Questions | merging intervals using start and end values. | [Go Here](#Merge_Intervals_Pattern_Practice_Questions) |
| 5 | Cyclic Sort Pattern Practice Questions | cycling over one element while its not correct. | [Go Here](#Cyclic_Sort_Pattern_Practice_Questions) |
| 6 | In Place Reversal Pattern Practice Questions | reverse linked list. | [Go Here](#In_Place_Reversal_Pattern_Practice_Questions) |
| 7 | Breadth_First_Search_Pattern_Practice_Questions | BFS tree traversal. | [Go Here](#Breadth_First_Search_Pattern_Practice_Questions) |





## Sliding_Window_Pattern_Practice_Questions

| # | Question | Solution |
|---| -------- | -------- |
| 1 | Given an array, find the average of all contiguous sub-arrays of size ‘K’ in it. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Sliding_Window_Pattern_Practice_Questions/AverageOfSubArrayOfSizeK.java) |
| 2 | Given an array of positive numbers and a positive number ‘k’, find the maximum sum of any contiguous subarray of size ‘k’. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Sliding_Window_Pattern_Practice_Questions/MaximumSubArrayOfSizeK.java) |
| 3 | Given an array of positive numbers and a positive number ‘S’, find the length of the smallest contiguous subarray whose sum is greater than or equal to ‘S’. Return 0, if no such subarray exists. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Sliding_Window_Pattern_Practice_Questions/SmallestSubArrayOfSumK.java) |
| 4 | Given a string, find the length of the longest substring in it with no more than K distinct characters. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Sliding_Window_Pattern_Practice_Questions/LongestSubStringDistinctK.java) |
| 5 | Given an array of characters where each character represents a fruit tree, you are given two baskets and your goal is to put maximum number of fruits in each basket. The only restriction is that each basket can have only one type of fruit. You can start with any tree, but once you have started you can’t skip a tree. You will pick one fruit from each tree until you cannot, i.e., you will stop when you have to pick from a third fruit type. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Sliding_Window_Pattern_Practice_Questions/MaximumFruitCountOf2Count.java) |


## Two_Pointer_Pattern_Practice_Questions

| # | Question | Solution |
|---| -------- | -------- |
| 1 | Given an array of sorted numbers and a target sum, find a pair in the array whose sum is equal to the given target. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Two_Pointer_Pattern_Practice_Questions/SmallestSubArrayOfSumK.java) |
| 2 | Given an array of sorted numbers, remove all duplicates from it. You should not use any extra space; after removing the duplicates in-place return the new length of the array. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Two_Pointer_Pattern_Practice_Questions/RemoveDuplicateFromSortedArray.java) |
| 3 | Given a sorted array, create a new array containing squares of all the number of the input array in the sorted order. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Two_Pointer_Pattern_Practice_Questions/SquaresFromSortedArray.java) |
| 4 | Given an array of unsorted numbers, find all unique triplets in it that add up to zero. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Two_Pointer_Pattern_Practice_Questions/UniqueTripletsNonSortedArray.java) |
| 5 | Given an array of unsorted numbers and a target number, find a triplet in the array whose sum is as close to the target number as possible, return the sum of the triplet. If there are more than one such triplet, return the sum of the triplet with the smallest sum. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Two_Pointer_Pattern_Practice_Questions/ClosetSumTripletsNonSortedArray.java) |

## Fast_Slow_Pointer_Pattern_Practice_Questions

| # | Question | Solution |
|---| -------- | -------- |
| 1 | Given the head of a Singly LinkedList, write a function to determine if the LinkedList has a cycle in it or not. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Fast_Slow_Pointer_Pattern_Practice_Questions/CheckIsCyclicLinkedList.java) |
| 2 | Given the head of a LinkedList with a cycle, find the length of the cycle. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Fast_Slow_Pointer_Pattern_Practice_Questions/FindLengthCyclicLinkedList.java) |

## Merge_Intervals_Pattern_Practice_Questions

| # | Question | Solution |
|---| -------- | -------- |
| 1 | Given a list of intervals, merge all the overlapping intervals to produce a list that has only mutually exclusive intervals. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Merge_Intervals_Pattern_Practice_Questions/MergeIntervals.java) |
| 2 | Given a set of intervals, find out if any two intervals overlap. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Merge_Intervals_Pattern_Practice_Questions/OverlapIntervals.java) |
| 3 | Given a list of non-overlapping intervals sorted by their start time, insert a given interval at the correct position and merge all necessary intervals to produce a list that has only mutually exclusive intervals. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Merge_Intervals_Pattern_Practice_Questions/InsertIntervals.java) |

## Cyclic_Sort_Pattern_Practice_Questions

| # | Question | Solution |
|---| -------- | -------- |
| 1 | Write a function to sort the objects in-place on their creation sequence number in O(n) and without any extra space. For simplicity, let’s assume we are passed an integer array containing only the sequence numbers, though each number is actually an object. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Cyclic_Sort_Pattern_Practice_Questions/CyclicSortArray.java) |
| 2 | We are given an array containing ‘n’ distinct numbers taken from the range 0 to ‘n’. Since the array has only ‘n’ numbers out of the total ‘n+1’ numbers, find the missing number. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Cyclic_Sort_Pattern_Practice_Questions/CyclicSearchArray.java) |

## In_Place_Reversal_Pattern_Practice_Questions

| # | Question | Solution |
|---| -------- | -------- |
| 1 | Given the head of a Singly LinkedList, reverse the LinkedList. Write a function to return the new head of the reversed LinkedList. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/In_Place_Reversal_Pattern_Practice_Questions/ReverseLinkedList.java) |
| 2 | Given the head of a LinkedList and two positions ‘p’ and ‘q’, reverse the LinkedList from position ‘p’ to ‘q’. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/In_Place_Reversal_Pattern_Practice_Questions/ReverseLinkedList.java) |

## Breadth_First_Search_Pattern_Practice_Questions

| # | Question | Solution |
|---| -------- | -------- |
| 1 | Given a binary tree, populate an array to represent its level-by-level traversal. You should populate the values of all nodes of each level from left to right in separate sub-arrays. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Breadth_First_Search_Pattern_Practice_Questions/LevelOrderTraversal.java) |
| 2 | Given a binary tree, populate an array to represent its level-by-level traversal in reverse order, i.e., the lowest level comes first. You should populate the values of all nodes in each level from left to right in separate sub-arrays. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Breadth_First_Search_Pattern_Practice_Questions/ReverseLevelOrderTraversal.java) |
| 3 | Given a binary tree, populate an array to represent its zigzag level order traversal. You should populate the values of all nodes of the first level from left to right, then right to left for the next level and keep alternating in the same manner for the following levels. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Breadth_First_Search_Pattern_Practice_Questions/ZigZagLevelOrderTraversal.java) |

