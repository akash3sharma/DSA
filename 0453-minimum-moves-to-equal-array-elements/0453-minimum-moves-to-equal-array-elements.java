class Solution {
    public int minMoves(int[] nums) {

     int sum = 0;

     int min = nums[0];

     for(int i : nums){

        min = Math.min(i , min);

        sum += i;

     }

     return sum - min * nums.length;
     
     // basically we need to reach every element at min so final array will have sum 
     // min * n
     // this sum can be acheived by sum - m
     // min * n = sum - m
    }
}