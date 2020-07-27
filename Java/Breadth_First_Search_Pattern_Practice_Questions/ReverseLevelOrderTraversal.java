/*
Question : Given a binary tree, populate an array to represent its level-by-level traversal in reverse order, i.e., the lowest level comes first. You should populate the values of all nodes in each level from left to right in separate sub-arrays.
*/

package Breadth_First_Search_Pattern_Practice_Questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class ReverseLevelOrderTraversal
{
    public static void main (String args[])
    {
        //region TestCases

        //first test case
        
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);

        //endregion

        List<List<Integer>> result = ReverseLevelOrderTraversal.reverseLevelOrderTraversal(root);
        System.out.println(result);

    }

    public static List<List<Integer>> reverseLevelOrderTraversal(TreeNode root)
    {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while(!queue.isEmpty())
        {
            int level = queue.size();
            List<Integer> levelValues = new ArrayList<Integer>();
            for(int i = 0; i < level; i++)
            {
                TreeNode temp = queue.poll();
                levelValues.add(temp.val);
                
                if(temp.left != null)
                {
                    queue.offer(temp.left);
                }

                if(temp.right != null)
                {
                    queue.offer(temp.right);
                }
            }
            result.add(0, levelValues);
        }
        return result;
    }
}