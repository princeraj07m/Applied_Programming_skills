class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        int rem = numBottles;
        
        while(rem >= numExchange){
            int newBottles = rem / numExchange;
            int extra = rem%numExchange;
            
            ans+=newBottles;

            rem = newBottles + extra;
        }
        return ans;
    }
}