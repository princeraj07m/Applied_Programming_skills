class Solution {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> maxD = new ArrayDeque<>();
        Deque<Integer> minD = new ArrayDeque<>();
        
        int left = 0, ans = 0;

        for (int right = 0; right < nums.length; right++) {
            
            while (!maxD.isEmpty() && maxD.peekLast() < nums[right]) {
                maxD.pollLast();
            }
            maxD.offerLast(nums[right]);

            while (!minD.isEmpty() && minD.peekLast() > nums[right]) {
                minD.pollLast();
            }
            minD.offerLast(nums[right]);

            while (maxD.peekFirst() - minD.peekFirst() > limit) {
                if (nums[left] == maxD.peekFirst()) {
                    maxD.pollFirst();
                }
                if (nums[left] == minD.peekFirst()) {
                    minD.pollFirst();
                }
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}
