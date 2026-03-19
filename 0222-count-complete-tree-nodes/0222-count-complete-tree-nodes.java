/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static int count=0;
    private static void dfs(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        count+=1;
        dfs(root.left);
        dfs(root.right);
    }
    public int countNodes(TreeNode root) {
        dfs(root);
        int result=count;
        count=0;
        return result;
    }
}