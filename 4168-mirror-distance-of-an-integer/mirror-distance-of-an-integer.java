class Solution {
    int rev(int n){
        int ans = 0;
        while(n>0){
            int rem = n%10;
            n=n/10;
            ans = ans*10;
            ans += rem;
        }
        return ans;
    }
    public int mirrorDistance(int n) {
        return Math.abs(n-rev(n));
    }
}