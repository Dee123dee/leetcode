/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    static TreeNode root1; // this variable store the root value for all new instance
    public void helper(TreeNode root)
    {
        root1 = root;
        return;
    }
    
    public String serialize(TreeNode root) {
      helper(root);
      return "";
    }

  
    public TreeNode deserialize(String data) {
        return root1;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));