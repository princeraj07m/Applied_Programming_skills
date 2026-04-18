class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> s = new HashSet<>();
        int i = 0;
        for(var n : nums){
            if(s.size() > k){
                s.remove(nums[i]);
                i++;
            }
            if(s.contains(n)){
                return true;
            }
            s.add(n);
        }
        return false;
    }
}