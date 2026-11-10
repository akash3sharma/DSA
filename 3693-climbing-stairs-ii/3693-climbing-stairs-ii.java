class Solution {
    public int climbStairs(int n, int[] costs) {
        int [] dp = new int [ n + 3 ];

        for(int i = 1 ; i <= n ; i++){
            
            int a = i - 1;
            int b = i - 2;
            int c = i - 3;

            int costOfa = a >= 0 ?
                dp[a] + costs[i - 1] + 1 : Integer.MAX_VALUE;

            int costOfb = b >= 0 ?
                dp[b] + costs[i - 1] + 4 : Integer.MAX_VALUE;

            int costOfc = c >= 0 ?
                dp[c] + costs[i - 1] + 9 : Integer.MAX_VALUE;

            dp[i] = Math.min(costOfa, Math.min(costOfb, costOfc));


        }

        return dp[n];
    }
}