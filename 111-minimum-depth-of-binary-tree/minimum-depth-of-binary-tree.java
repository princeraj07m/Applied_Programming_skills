class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;

        Deque<TreeNode> dq = new ArrayDeque<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        dq.add(root);
        while(!dq.isEmpty()){
            int n = dq.size();
            ArrayList<Integer> level = new ArrayList<>();
            for(int i = 0;i<n;i++){
                TreeNode temp = dq.peek();
                level.add(temp.val);

                dq.poll();
                if(temp.left!=null)dq.offer(temp.left);
                if(temp.right != null)dq.offer(temp.right);

                if(temp.left == null && temp.right == null){
                    return ans.size()+1;
                } 
            }
            ans.add(level);
        }
        return 0;
    }
}
