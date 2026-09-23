class Solution {
    public int minOperations(int[] nums, int x) {
        int sum = 0;
        for(int i : nums){
            sum += i;
        }
        sum -= x;
        if(sum < 0)return -1;
        int i = 0;
        int j = 0;
        int ans = -1;
        int curr = 0;
        while(i < nums.length){
            curr += nums[i];
            while(j < nums.length && curr > sum){
                curr -= nums[j];
                j++;
            }
            if(curr == sum){
                ans = Math.max(ans , (i - j + 1));
            }
            i++;
        }
        return ans == -1 ? -1 : nums.length - ans;
    }
}