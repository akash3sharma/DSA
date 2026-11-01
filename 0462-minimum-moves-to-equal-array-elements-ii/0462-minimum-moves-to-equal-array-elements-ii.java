class Solution {
    public int minMoves2(int[] nums) {
        
        Arrays.sort(nums);

        int medain ;

        int n = nums.length;

        if(n % 2 == 0){
            medain = (nums[(n - 1)/2] + nums[n / 2] ) / 2;
        }else{
            medain = nums[n / 2];
        }
        
        int steps = 0;

        for(int i : nums){
            steps += Math.abs(i - medain);
        }
        
        return steps;
    }
}