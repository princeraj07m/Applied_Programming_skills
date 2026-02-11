class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null)return true;
        if(p!=null && q==null)return false;
        if(p==null && q!=null)return false;

        boolean ls = isSameTree(p.left, q.left);
        boolean rs = isSameTree(p.right,q.right);

        return (p.val == q.val) &&(ls && rs);
    }
}