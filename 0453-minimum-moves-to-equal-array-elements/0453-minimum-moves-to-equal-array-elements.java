class Solution {
    public int minMoves(int[] nums) {

     int sum = 0;

     int min = nums[0];

     for(int i : nums){

        min = Math.min(i , min);

        sum += i;

     }

     return sum - (min * nums.length);
    
    }
}