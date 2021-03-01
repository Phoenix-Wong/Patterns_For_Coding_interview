/*
Question : Given a binary tree where each node can only have a digit (0-9) value, each root-to-leaf path will represent a number. Find the total sum of all the numbers represented by all paths.
*/

package Depth_First_Search_Pattern_Practice_Questions;


class FindSumOfPathNumbers {
    public static void main(String args[]) {
        //region TestCases

        //first test case

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(7);
        root.right = new TreeNode(9);
        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(9);


        //endregion

        int result = FindSumOfPathNumbers.findSumOfPathNumbers(root, 0);
        System.out.println(result);

    }


    public static int findSumOfPathNumbers(TreeNode root, int pathSum) {
        if (root == null) {
            return pathSum;
        }

        pathSum = 10 * pathSum + root.val;

        if (root.left == null && root.right == null) {
            return pathSum;
        }

        return findSumOfPathNumbers(root.left, pathSum) + findSumOfPathNumbers(root.right, pathSum);

    }
}
