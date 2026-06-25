class Solution {
    void f(int[] nums,List<Integer> ds, List<List<Integer>> ans, HashSet<Integer> used){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<Integer>(ds));
            return;
        }
        for(int i:nums){
            if(!used.contains(i)){
                ds.add(i);
                used.add(i);
                f(nums,ds,ans,used);
                ds.remove(ds.size()-1);
                used.remove(i);
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<Integer> used = new HashSet<>();
        List<Integer> ds = new ArrayList<>();
        f(nums,ds,ans,used);
        return ans;
    }
}