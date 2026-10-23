class Solution {
    public int sortPermutation(int[] nums) {
        int i = 0;
        int ans = -1;
        while(i < nums.length){
           if(nums[i] != i){
            ans = nums[i];
            break;
           }
           i++;
        }
        if(ans == -1)return 0;
        else{
            while(i < nums.length){
                if(nums[i] != i){
                    ans &= nums[i];
                }
                i++;
            }
        }
        return ans;
    }
}