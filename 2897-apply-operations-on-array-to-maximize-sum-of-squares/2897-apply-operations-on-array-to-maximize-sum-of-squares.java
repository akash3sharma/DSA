class Solution {
    public int maxSum(List<Integer> nums, int k) {
        int mod = (int)1e9 + 7;
        int [] count = new int [31];
        for(int num : nums){
            for(int i = 0 ; i < 30 ; i++){
                if((num & (1 << i)) != 0)count[i]++;
            }
        }
        long res = 0;
        for(int j = 0 ; j < k ; j++){
            long curr = 0;
            for(int i = 29 ; i >= 0 ; i--){
                if(count[i] > 0){
                  curr |= 1L << i;
                  count[i]--;
                }
            }
            res = (res +  (curr * curr) % mod) % mod;
        }
        return (int)res;
    }
}