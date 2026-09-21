class Solution {
    public long[] resultArray(int[] nums, int k) {
       long [] ans = new long [k];
       long [] result = new long [k];
       long [] dp = new long [k];
       for(int i = 0 ; i < nums.length ; i++){
        long [] next = new long [k];
        int value = nums[i] % k;
        next [value]++;
        for(int r = 0 ; r < k ; r++){
            next[(int)((r * value) % k)] += dp[r];
        }
        dp = next;
        for(int r = 0 ; r < k ; r++){
            result [r] += dp[r];
        }

       }
       return result;
    }
}