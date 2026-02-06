class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        if(root==null)return arr;

        Stack<TreeNode> sc = new Stack<>();
        sc.push(root);

        while(!sc.isEmpty()){
            TreeNode temp = sc.pop();
            arr.add(temp.val);
            if(temp.left!=null){
                sc.push(temp.left);
            }
            
            if(temp.right!= null){
                sc.push(temp.right);
            }
        }
        Collections.reverse(arr);
        return arr;

    }
}