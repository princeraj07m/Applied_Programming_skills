class Solution {

    static int f(int idx, int[] nums, int[] dp) {

        if (idx >= nums.length - 1) return 0;

        if (dp[idx] != -1) return dp[idx];

        int mini = Integer.MAX_VALUE;

        for (int i = 1; i <= nums[idx]; i++) {

            int ans = f(idx + i, nums, dp);

            if (ans != Integer.MAX_VALUE) {
                mini = Math.min(mini, 1 + ans);
            }
        }

        return dp[idx] = mini;
    }

    public int jump(int[] nums) {

        int[] dp = new int[nums.length];

        Arrays.fill(dp, -1);

        return f(0, nums, dp);
    }
}