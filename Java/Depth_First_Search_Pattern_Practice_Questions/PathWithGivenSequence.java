/*
Question : Given a binary tree and a number sequence, find if the sequence is present as a root-to-leaf path in the given tree.
*/

package Depth_First_Search_Pattern_Practice_Questions;



class PathWithGivenSequence
{
    public static void main (String args[])
    {
        //region TestCases

        //first test case
        
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(7);
        root.right = new TreeNode(9);
        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(9);
        int[] arr = new int[] {1,9,9};

        //endregion

        boolean result = PathWithGivenSequence.pathWithGivenSequence(root, arr, 0);
        System.out.println(result);

    }


    public static boolean pathWithGivenSequence(TreeNode root, int[] arr, int level)
    {
        if(root == null)
        {
            return false;
        }

        if(level >= arr.length || arr[level] != root.val)
        {
            return false;
        }

        if(root.left == null && root.right == null && level == arr.length -1)
        {
            //leaf node and matching 
            return true;
        }
        
        level++;
        return pathWithGivenSequence(root.left, arr, level) || pathWithGivenSequence(root.right, arr, level);
    }
}