class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> mHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int []m : matrix){
            for(int n : m){
            
            mHeap.offer(n);
            if(mHeap.size()>k){
                mHeap.poll();
            }
        }
        }
        return mHeap.peek();
    }
}


