class Solution {
    void f(List<Integer> ds, List<List<Integer>> ans, HashMap<Integer, Integer> mp, int n) {

        if (ds.size() == n) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int key : mp.keySet()) {
            if (mp.get(key) > 0) {
                ds.add(key);
                mp.put(key, mp.get(key) - 1);

                f(ds, ans, mp, n);

                ds.remove(ds.size() - 1);
                mp.put(key, mp.get(key) + 1);
            }
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i : nums) {
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }
        List<Integer> ds = new ArrayList<>();
        f( ds, ans, mp,nums.length);
        return ans;
    }
}