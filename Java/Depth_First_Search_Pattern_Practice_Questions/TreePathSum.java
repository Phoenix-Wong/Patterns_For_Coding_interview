/*
Question : Given a binary tree and a number ‘S’, find if the tree has a path from root-to-leaf such that the sum of all the node values of that path equals ‘S’.
*/

package Depth_First_Search_Pattern_Practice_Questions;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class TreePathSum {
    public static void main(String args[]) {
        //region TestCases

        //first test case

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        int sum = 10;

        //endregion

        boolean result = TreePathSum.hasSum(root, sum);
        System.out.println(result);

    }


    public static boolean hasSum(TreeNode root, int target) {
        //get value of element
        if (root == null) {
            return false;
        }

        //if sum is not less than target add reverse call to left and right child
        if (root.val == target && root.left == null && root.right == null) {
            return true;
        }

        //else return true
        return hasSum(root.left, target - root.val) || hasSum(root.right, target - root.val);
    }
}
