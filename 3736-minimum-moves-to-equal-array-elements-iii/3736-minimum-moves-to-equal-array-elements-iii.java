class Solution {
    public int minMoves(int[] nums) {
        int ans = 0;

        int max = nums[0];

        for(int i : nums){

            max = Math.max(max , i);
            
        }

        for(int i : nums){

            ans += Math.abs(i - max);

        }

        return ans;
    }
}