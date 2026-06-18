class Solution {
    private void reverse(int[] nums, int l, int r) {
        while (l < r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        // array ko plt denge
        reverse(nums,0,nums.length-1);

        //phle k element plt denge
        int l = 0;
        int r = k-1;
        reverse(nums,l,r);
        //bache hue element plt denge
        l = k;
        r = nums.length-1;
        reverse(nums,l,r);
    }
}