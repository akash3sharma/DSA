class Solution {
    public int maxProduct(int[] nums) {

        int ans = Integer.MIN_VALUE;

        int pod = 1;
        for (int i = 0; i < nums.length; i++) {
            pod *= nums[i];
            ans = Math.max(ans, pod);
            if (pod == 0)
                pod = 1;
        }

        pod = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            pod *= nums[i];
            ans = Math.max(ans, pod);
            if (pod == 0)
                pod = 1;
        }

        return ans;
    }
}