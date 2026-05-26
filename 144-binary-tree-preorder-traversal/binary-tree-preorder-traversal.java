class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        if(root==null)return arr;
        Stack<TreeNode> sc = new Stack<>();
        sc.push(root);

        while(!sc.isEmpty()){
            TreeNode temp = sc.pop();
            arr.add(temp.val);
            if(temp.right != null){
                sc.push(temp.right);
            }if(temp.left != null){
                sc.push(temp.left);
            }
        }
        return arr;
    }
}