class Solution {
    public int minMoves(int[] nums) {

     int steps = 0;

     int min = nums[0];

     for(int i : nums){

        min = Math.min(i , min);

     }

     for(int i : nums){
        if(i != min){
            steps += (i - min);
        }
     }

     return steps;
     
     

     

    }
}