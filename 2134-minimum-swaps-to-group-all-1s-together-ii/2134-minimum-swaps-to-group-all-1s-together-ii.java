class Solution {
    public int minSwaps(int[] nums) {
        int countof1 = 0;
        int countof0 = 0;
        for(int i : nums){
            if(i == 1){
                countof1++;
            }else{
                countof0++;
            }
        }
        int count = 0;
        int j = 0;
        int ans = Integer.MAX_VALUE;
        for(int i = 0 ; i < nums.length ; i++){
                if(nums[i] == 1)count++;
                if(i - j + 1 == countof1){
                    ans = Math.min(countof1 - count , ans);
                    if(nums[j] == 1){
                    count--;
                }
                j++;
            }
        }
        count = 0;
        int ans0 = Integer.MAX_VALUE;
        j = 0;
        for(int i = 0 ; i < nums.length ; i++){
                if(nums[i] == 0)count++;
                if(i - j + 1 == countof0){
                    ans = Math.min(countof0 - count , ans);
                    if(nums[j] == 0){
                    count--;
                }
                j++;
            }
        }
        return Math.min(ans , ans0);
    }
}