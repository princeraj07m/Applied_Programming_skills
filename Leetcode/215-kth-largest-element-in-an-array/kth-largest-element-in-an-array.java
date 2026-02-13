class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> mHeap = new PriorityQueue<>();
        for(int n : nums){
            mHeap.offer(n);
            if(mHeap.size()>k){
                mHeap.poll();
            }
        }
        return mHeap.peek();
    }
}