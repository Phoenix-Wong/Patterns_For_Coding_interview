/*
Question : Given a binary tree and a number ‘S’, find all paths from root-to-leaf such that the sum of all the node values of each path equals ‘S’.
*/

package Depth_First_Search_Pattern_Practice_Questions;


class FindAllTreePaths {
    public static void main(String args[]) {
        //region TestCases

        //first test case

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(7);
        root.right = new TreeNode(9);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(7);
        int sum = 12;

        //endregion

        int result = FindAllTreePaths.findAllTreePaths(root, sum);
        System.out.println(result);

    }


    public static int findAllTreePaths(TreeNode root, int target) {
        if (root == null) {
            return 0;
        }

        if (root.val == target && root.left == null && root.right == null) {
            return 1;
        }

        return findAllTreePaths(root.left, target - root.val) + findAllTreePaths(root.right, target - root.val);

    }
}
