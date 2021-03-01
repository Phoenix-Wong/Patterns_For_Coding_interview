/*
Question : Given a binary tree, populate an array to represent its zigzag level order traversal. You should populate the values of all nodes of the first level from left to right, then right to left for the next level and keep alternating in the same manner for the following levels.
*/

package Breadth_First_Search_Pattern_Practice_Questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class ZigZagLevelOrderTraversal {
    public static void main(String args[]) {
        //region TestCases

        //first test case

        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);

        //endregion

        List<List<Integer>> result = ZigZagLevelOrderTraversal.zigZagLevelOrderTraversal(root);
        System.out.println(result);

    }

    public static List<List<Integer>> zigZagLevelOrderTraversal(TreeNode root) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<>();
        boolean isLeftToRight = true;
        queue.offer(root);
        while (!queue.isEmpty()) {
            int level = queue.size();
            List<Integer> currentLevelList = new ArrayList<>();
            for (int i = 0; i < level; i++) {
                TreeNode currentNode = queue.poll();
                if (isLeftToRight) {
                    currentLevelList.add(currentNode.val);
                } else {
                    currentLevelList.add(0, currentNode.val);
                }

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }

                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            result.add(currentLevelList);
            isLeftToRight = !isLeftToRight;
        }
        return result;

    }
}
