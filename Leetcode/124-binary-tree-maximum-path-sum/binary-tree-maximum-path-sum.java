class Solution {
    int ans = Integer.MIN_VALUE;
    public int height(TreeNode root){
        if(root==null)return 0;
        int lh = Math.max(0,height(root.left));
        int rh = Math.max(0,height(root.right));
        ans = Math.max(ans , root.val +lh+rh);
        return root.val + Math.max(lh,rh);
    }
    public int maxPathSum(TreeNode root) {
        height(root);
        return ans;
    }
}