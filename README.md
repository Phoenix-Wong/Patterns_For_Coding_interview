# Coding_Interview_Patterns

## Pattern

| # | Title | Basic idea (One line) | Practice Questions |
|---| ----- | --------------------- | ------------------ |
| 1 | Reverse_Traversal_Pattern | Reverse traverse an array. | [Go Here](#Reverse_Traversal_Pattern_Practice_Questions) |
| 2 | Sliding Window Pattern | Contiguous sub-array as a sliding window | [Go Here](#Sliding_Window_Pattern_Practice_Questions) |
| 3 | Two Pointer Pattern | Contiguous sub-array using two pointers | [Go Here](#Two_Pointer_Pattern_Practice_Questions) |
| 4 | Fast Slow Pointer Pattern | using one fast and one slow pointers | [Go Here](#Fast_Slow_Pointer_Pattern_Practice_Questions) |
| 5 | Merge Intervals Pattern Practice Questions | merging intervals using start and end values. | [Go Here](#Merge_Intervals_Pattern_Practice_Questions) |
| 6 | Cyclic Sort Pattern Practice Questions | cycling over one element while its not correct. | [Go Here](#Cyclic_Sort_Pattern_Practice_Questions) |
| 7 | In Place Reversal Pattern Practice Questions | reverse linked list. | [Go Here](#In_Place_Reversal_Pattern_Practice_Questions) |
| 8 | Breadth First Search Pattern Practice Questions | BFS tree traversal. | [Go Here](#Breadth_First_Search_Pattern_Practice_Questions) |
| 9 | Depth First Search Pattern Practice Questions | DFS tree traversal. | [Go Here](#Depth_First_Search_Pattern_Practice_Questions) |
| 10 | Two Heap Pattern Practice Questions | Using max and min heap. | [Go Here](#Two_Heap_Search_Pattern_Practice_Questions) |
| 11 | Subset Pattern Practice Questions | Using BFS for permutation and combination. | [Go Here](#Subset_Pattern_Practice_Questions) |
| 12 | Binary Search Pattern Practice Questions | Modifying binary search. | [Go Here](#Binary_Search_Pattern_Practice_Questions) |
| 13 | Bitwise XOR Pattern Practice Questions | use XOR gate. | [Go Here](#Bitwise_XOR_Pattern_Practice_Questions) |
| 14 | Top K Element Pattern Practice Questions | use heap to find top k element | [Go Here](#Top_K_Element_Pattern_Practice_Questions) |

## Reverse_Traversal_Pattern_Practice_Questions

| # | Question | Solution |
|---| -------- | -------- |
| 1 | Given an array of numbers, replace each even number with two of the same number. e.g, [1,2,5,6,8, , , ,] -> [1,2,2,5,6,6,8,8]. Assume that the array has the exact amount of space to accommodate the result. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Reverse_Traversal_Pattern_Practice_Questions/DuplicateEvenNumbers.java) |
| 2 | Given a sentence, reverse the words of the sentence. For example, "i live in a house" becomes "house a in live i". | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Reverse_Traversal_Pattern_Practice_Questions/ReverseString.java) |

## Sliding_Window_Pattern_Practice_Questions

| # | Question | Solution |
|---| -------- | -------- |
| 1 | Given an array, find the average of all contiguous sub-arrays of size ‘K’ in it. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Sliding_Window_Pattern_Practice_Questions/AverageOfSubArrayOfSizeK.java) |
| 2 | Given an array of positive numbers and a positive number ‘k’, find the maximum sum of any contiguous subarray of size ‘k’. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Sliding_Window_Pattern_Practice_Questions/MaximumSubArrayOfSizeK.java) |
| 3 | Given an array of positive numbers and a positive number ‘S’, find the length of the smallest contiguous subarray whose sum is greater than or equal to ‘S’. Return 0, if no such subarray exists. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Sliding_Window_Pattern_Practice_Questions/SmallestSubArrayOfSumK.java) |
| 4 | Given a string, find the length of the longest substring in it with no more than K distinct characters. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Sliding_Window_Pattern_Practice_Questions/LongestSubStringDistinctK.java) |
| 5 | Given an array of characters where each character represents a fruit tree, you are given two baskets and your goal is to put maximum number of fruits in each basket. The only restriction is that each basket can have only one type of fruit. You can start with any tree, but once you have started you can’t skip a tree. You will pick one fruit from each tree until you cannot, i.e., you will stop when you have to pick from a third fruit type. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Sliding_Window_Pattern_Practice_Questions/MaximumFruitCountOf2Count.java) |
| 6 | Given an array of integers that can be both +ve and -ve, find the contiguous subarray with the largest sum. For example: [1,2,-1,2,-3,2,-5] -> first 4 elements have the largest sum. Return (0,3). | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Sliding_Window_Pattern_Practice_Questions/MaximumSubArray.java) |
| 7 | Given a String, find the longest substring with unique characters. For example: "whatwhywhere" --> "atwhy" | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Sliding_Window_Pattern_Practice_Questions/LongestUniqueSubString.java) |

## Two_Pointer_Pattern_Practice_Questions

| # | Question | Solution |
|---| -------- | -------- |
| 1 | Given an array of sorted numbers and a target sum, find a pair in the array whose sum is equal to the given target. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Two_Pointer_Pattern_Practice_Questions/SmallestSubArrayOfSumK.java) |
| 2 | Given an array of sorted numbers, remove all duplicates from it. You should not use any extra space; after removing the duplicates in-place return the new length of the array. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Two_Pointer_Pattern_Practice_Questions/RemoveDuplicateFromSortedArray.java) |
| 3 | Given a sorted array, create a new array containing squares of all the number of the input array in the sorted order. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Two_Pointer_Pattern_Practice_Questions/SquaresFromSortedArray.java) |
| 4 | Given an array of unsorted numbers, find all unique triplets in it that add up to zero. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Two_Pointer_Pattern_Practice_Questions/UniqueTripletsNonSortedArray.java) |
| 5 | Given an array of unsorted numbers and a target number, find a triplet in the array whose sum is as close to the target number as possible, return the sum of the triplet. If there are more than one such triplet, return the sum of the triplet with the smallest sum. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Two_Pointer_Pattern_Practice_Questions/ClosetSumTripletsNonSortedArray.java) |
| 6 | Given an array, reverse the order of its elements. For example, [3,5,2,5,2,3,9] → [9,3,2,5,2,5,3]. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Two_Pointer_Pattern_Practice_Questions/ReverseArray.java) |
| 7 | 2 Sum Problem: Given a sorted array of integers, find two numbers in the array that sum to a given integer target. For example, if a = [1,2,3,5,6,7] and target = 11, the answer will be 5 and 6. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Two_Pointer_Pattern_Practice_Questions/TwoSum.java) |
| 8 | Given an array of integers, find the shortest sub array, that if sorted, results in the entire array being sorted. For example: [1,2,4,5,3,5,6,7] --> [4,5,3] - If you sort from indices 2 to 4, the entire array is sorted. [1,3,5,2,6,4,7,8,9] --> [3,5,2,6,4] - If you sort from indices 1 to 5, the entire array is sorted. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Two_Pointer_Pattern_Practice_Questions/SmallestSubArraytoSort.java) |
| 9 | You are given an array of integers. Rearrange the array so that all zeroes are at the beginning of the array. For example, a = [4,2,0,1,0,3,0] -> [0,0,0,4,1,2,3] | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Two_Pointer_Pattern_Practice_Questions/MoveZeroesToFront.java) |
| 10 | You are given an array of integers and a pivot. Rearrange the array in the following order: [all elements less than pivot, elements equal to pivot, elements greater than pivot] For example, a = [5,2,4,4,6,4,4,3] and pivot = 4 --> result = [3,2,4,4,4,4,5,6] | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Two_Pointer_Pattern_Practice_Questions/IndiaNationalFlag.java) |

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

## Depth_First_Search_Pattern_Practice_Questions

| # | Question | Solution |
|---| -------- | -------- |
| 1 | Given a binary tree and a number ‘S’, find if the tree has a path from root-to-leaf such that the sum of all the node values of that path equals ‘S’. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Depth_First_Search_Pattern_Practice_Questions/TreePathSum.java) |
| 2 | Given a binary tree and a number ‘S’, find all paths from root-to-leaf such that the sum of all the node values of each path equals ‘S’. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Depth_First_Search_Pattern_Practice_Questions/FindAllTreePaths.java) |
| 3 | Given a binary tree where each node can only have a digit (0-9) value, each root-to-leaf path will represent a number. Find the total sum of all the numbers represented by all paths. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Depth_First_Search_Pattern_Practice_Questions/FindSumOfPathNumbers.java) |
| 4 | Given a binary tree and a number sequence, find if the sequence is present as a root-to-leaf path in the given tree. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Depth_First_Search_Pattern_Practice_Questions/PathWithGivenSequence.java) |

## Two_Heap_Search_Pattern_Practice_Questions

| # | Question | Solution |
|---| -------- | -------- |
| 1 | Design a class to calculate the median of a number stream. The class should have the following two methods: 1: insertNum(int num): stores the number in the class. 2: findMedian(): returns the median of all numbers inserted in the class. If the count of numbers inserted in the class is even, the median will be the average of the middle two numbers. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Two_Heap_Search_Pattern_Practice_Questions/MedianOfStream.java) |
| 2 | Given an array of numbers and a number ‘k’, find the median of all the ‘k’ sized sub-arrays (or windows) of the array. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Two_Heap_Search_Pattern_Practice_Questions/SlidingWindowMedian.java) |

## Subset_Pattern_Practice_Questions

| # | Question | Solution |
|---| -------- | -------- |
| 1 | Given a set with distinct elements, find all of its distinct subsets. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Subset_Pattern_Practice_Questions/Subsets.java) |
| 2 | Given a set of numbers that might contain duplicates, find all of its distinct subsets. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Subset_Pattern_Practice_Questions/SubsetsWithDuplicates.java) |

## Binary_Search_Pattern_Practice_Questions

| # | Question | Solution |
|---| -------- | -------- |
| 1 | Given a sorted array of numbers, find if a given number ‘key’ is present in the array. Though we know that the array is sorted, we don’t know if it’s sorted in ascending or descending order. You should assume that the array can have duplicates. Write a function to return the index of the ‘key’ if it is present in the array, otherwise return -1. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Binary_Search_Pattern_Practice_Questions/OrderAgnosticBinarySearch.java) |
| 2 | Given an array of numbers sorted in an ascending order, find the ceiling of a given number ‘key’. The ceiling of the ‘key’ will be the smallest element in the given array greater than or equal to the ‘key’. Write a function to return the index of the ceiling of the ‘key’. If there isn’t any ceiling return -1. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Binary_Search_Pattern_Practice_Questions/SearchCeilingOfNumber.java) |
| 3 | Given an array of lowercase letters sorted in ascending order, find the smallest letter in the given array greater than a given ‘key’. Assume the given array is a circular list, which means that the last letter is assumed to be connected with the first letter. This also means that the smallest letter in the given array is greater than the last letter of the array and is also the first letter of the array. Write a function to return the next letter of the given ‘key’. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Binary_Search_Pattern_Practice_Questions/SearchNextNumber.java) |

## Bitwise_XOR_Pattern_Practice_Questions

| # | Question | Solution |
|---| -------- | -------- |
| 1 | Given an array of n-1n−1 integers in the range from 11 to nn, find the one number that is missing from the array. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Bitwise_XOR_Pattern_Practice_Questions/BitwiseMissingElement.java) |
| 2 | In a non-empty array of integers, every number appears twice except for one, find that single number. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Bitwise_XOR_Pattern_Practice_Questions/BitwiseSingleElement.java) |

## Top_K_Element_Pattern_Practice_Questions

| # | Question | Solution |
|---| -------- | -------- |
| 1 | Given an unsorted array of numbers, find the ‘K’ largest numbers in it. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Top_K_Element_Pattern_Practice_Questions/KLargestNumbers.java) |
| 2 | Given an unsorted array of numbers, find Kth smallest number in it. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Top_K_Element_Pattern_Practice_Questions/KSmallestNumbers.java) |
| 3 | Given an array of points in the a 2D plane, find ‘K’ closest points to the origin. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Top_K_Element_Pattern_Practice_Questions/FindClosestPoints.java) |
| 4 | Given ‘N’ ropes with different lengths, we need to connect these ropes into one big rope with minimum cost. The cost of connecting two ropes is equal to the sum of their lengths. | [Java](https://github.com/AkshantVats/Patterns_For_Coding_interview/blob/master/Java/Top_K_Element_Pattern_Practice_Questions/ConnectRopes.java) |
