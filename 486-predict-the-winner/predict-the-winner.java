class Solution {

    private int solve(int[] nums, int i, int j) {

        if (i == j) {
            return nums[i];
        }
        int takeLeft = nums[i] - solve(nums, i + 1, j);
        int takeRight = nums[j] - solve(nums, i, j - 1);

        return Math.max(takeLeft, takeRight);
    }

    public boolean predictTheWinner(int[] nums) {

        int diff = solve(nums, 0, nums.length - 1);
        return diff >= 0;
    }
}