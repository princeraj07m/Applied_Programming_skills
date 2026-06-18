class NumArray {
    int []ps;
    public NumArray(int[] nums) {
        ps = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            if(i==0){
                ps[i] = nums[i];
            }else{
                ps[i] = ps[i-1]+nums[i];
            }
        }

    }
    
    public int sumRange(int left, int right) {
        if(left ==0)return ps[right];
        return ps[right]-ps[left-1];
    }
}