class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);
        if (lh == -1 || rh == -1)
            return -1;

        if (Math.abs(lh - rh) > 1)
            return -1;
        return 1 + Math.max(lh, rh);
    }

    public boolean isBalanced(TreeNode root) {
        int n = maxDepth(root);
        if (n == -1)
            return false;
        return true;
    }
}