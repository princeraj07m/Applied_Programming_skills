class Solution {
    void f(int[] nums, int i, int n, List<Integer> ds, HashSet<List<Integer>> ans) {
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

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n = nums.length;
        HashSet<List<Integer>> ans = new HashSet<>();
        List<Integer> ds = new ArrayList<>();
        f(nums, 0, n, ds, ans);

        List<List<Integer>> fans = new ArrayList<>(ans);
        return fans;
    }
}