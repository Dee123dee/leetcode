class Solution {
    public boolean isBalanced(TreeNode root)
    {
        return CheckHeight(root) != -1;
    }
    public int CheckHeight(TreeNode root) 
    {
        if(root == null)
        return 0;

        int left = CheckHeight(root.left);
        if(left == -1)
        {
            return -1;
        }
        int right = CheckHeight(root.right);
        if(right == -1)
        {
            return -1;
        }
        if(Math.abs(left - right)>1)
        {
            return -1;
        }
        return Math.max(left , right)+1;
    }
}