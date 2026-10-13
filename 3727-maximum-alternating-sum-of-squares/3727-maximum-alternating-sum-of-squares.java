class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = nums[i] * nums[i];
        }
        int i = 0;
        Arrays.sort(nums);
        int j = nums.length - 1;
        int mid = nums.length % 2 == 0 ? (i + j) / 2 + 1 : (i + j ) / 2;
        int temp = mid;
        long sum = 0;
        while(mid < nums.length){
            sum += nums[mid];
            mid ++;
        }
        mid = (i + j ) / 2;
        while(i < temp){
            sum -= nums[i];
            i++;
        }
        return sum;
    }
}