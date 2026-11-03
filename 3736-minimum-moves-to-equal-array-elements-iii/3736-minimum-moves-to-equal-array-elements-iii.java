class Solution {
    public int minMoves(int[] nums) {
        int sum = 0;

        int max = nums[0];

        for(int i : nums){

            max = Math.max(max , i);

            sum += i;

        }

        return max * nums.length - sum ;
    }
}