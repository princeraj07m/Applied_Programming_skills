class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int sum = 0;
        for(int n : nums){
            pq.add(n);
            sum += n;
        }

        while(k-- >0){
            int sel = pq.poll();
            if(sel ==0){
                break;
            }
            sum -= sel;
            pq.add(-sel);
            sum+=-sel;
        }
    return sum;
    }
} 