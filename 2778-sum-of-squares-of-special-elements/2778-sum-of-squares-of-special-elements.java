class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i = 0 ; i < n ; i++){
            int j = i + 1;
            if(n % j == 0){
                ans += nums[i]*nums[i];
            }
        }
        return ans;
    }
}