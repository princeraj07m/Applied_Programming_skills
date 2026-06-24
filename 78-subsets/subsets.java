class Solution {
    void f(int[] nums, int i, int n, List<Integer> ds, List<List<Integer>> ans) {
        if (i >= n) {
            List<Integer> temp = new ArrayList<>(ds);
            Collections.sort(temp);
            ans.add(temp);
            return;
        }

        ds.add(nums[i]);
        f(nums, i + 1, n, ds, ans);

        ds.remove(ds.size() - 1);
        f(nums, i + 1, n, ds, ans);

    }

    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        f(nums, 0, n, ds, ans);

        return ans;
    }
}