class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inlong = 1;
        int declong = 1;
        int countin = 1;
        int countdec = 1;
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] > nums[i - 1]){
                countin++;
                countdec = 1;
            }else if(nums[i] < nums[i - 1]){
                countdec ++;
                countin = 1;
            }else{
                countdec = 1;
                countin = 1;
            }
            inlong = Math.max(inlong , countin);
            declong = Math.max(declong , countdec);
        }
        return Math.max(inlong , declong);
    }
}