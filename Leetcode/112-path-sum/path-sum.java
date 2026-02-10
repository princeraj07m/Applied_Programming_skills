class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;
        int sum = targetSum;

        sum -= root.val;
        if ((root.left == null && root.right == null) && sum == 0) {
            return true;
        }
        return (hasPathSum(root.left, sum)
                || hasPathSum(root.right, sum));
    }
}