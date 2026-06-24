class Solution {
    boolean f(int[]nums, int curr, int target, int i, Boolean [][]dp ){
        if(curr > target) return false;
        if(curr == target)return true;
        if(i>=nums.length)return false;
        if(dp[i][curr]!=null)return dp[i][curr]; 
        return dp[i][curr] = f(nums,curr+nums[i],target,i+1,dp) || f(nums,curr,target,i+1,dp);
    }
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i:nums){
            sum+=i;
        }
        if(sum % 2 != 0) return false;
        Boolean [][]dp = new Boolean[nums.length][(sum/2)+1];
        
        return f(nums,0,sum/2,0,dp);
    }
}