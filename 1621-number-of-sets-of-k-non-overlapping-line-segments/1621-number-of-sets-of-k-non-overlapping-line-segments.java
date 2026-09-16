class Solution {
    public int numberOfSets(int n, int K) {
        int mod = (int)1e9 + 7;

        int [] [] dp = new int [1001] [1001];

        for(int i = 0 ; i <= n-1 ; i++){
            dp[i][0] = 1;
        }
        
        for(int k = 1 ; k <= K ; k++){

            int [] prevsum = new int [n + 1];

            for(int i = n -1 ; i >= 0 ; i--){
               
               prevsum[i] = (prevsum[i + 1]) % mod + (dp[i][k - 1] % mod);
              
            }
            
            for(int i = n - 1 ; i >= 0 ; i--){
                int take = prevsum[i + 1] % mod;
                int skip = dp[i+1][k] % mod;
                dp[i][k] = (take + skip) % mod;
            }

        }
        return dp[0][K];
    }
}