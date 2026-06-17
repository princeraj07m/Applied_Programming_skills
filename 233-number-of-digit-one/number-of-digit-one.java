class Solution {
    static int f(String s, int idx, boolean tight, int count, int[][][] dp) {
        int t = tight ? 1 : 0;

        if (idx == s.length()) {
            return count;
        }
        if (dp[idx][t][count] != -1)
            return dp[idx][t][count];

        int lb = 0;
        int ub = tight ? s.charAt(idx) - '0' : 9;
        int res = 0;
        for (int dig = lb; dig <= ub; dig++) {
            res += f(s, idx + 1, (tight && dig == ub), count + (dig == 1 ? 1 : 0), dp);
        }
        return dp[idx][t][count] = res;
    }

    public int countDigitOne(int n) {
        int[][][] dp = new int[11][2][10];
        for (int i = 0; i < 11; i++)
            for (int j = 0; j < 2; j++)
                Arrays.fill(dp[i][j], -1);
                
        String s = "" + n;
        return f(s, 0, true, 0, dp);
    }
}