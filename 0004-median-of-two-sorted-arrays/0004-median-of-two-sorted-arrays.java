class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length){
            return findMedianSortedArrays(nums2 , nums1);
        }

        int m = nums1.length ;
        int n = nums2.length;

        int low = 0;
        int high = m;

        while(low <= high){
            int i = low + (high - low) / 2;

            int j = (m + n + 1) / 2 - i;

            int x1 = i == 0 ? Integer.MIN_VALUE : nums1[i - 1];

            int x2 = i == m ? Integer.MAX_VALUE : nums1[i];

            int y1 = j == 0 ? Integer.MIN_VALUE : nums2[j - 1];

            int y2 = j == n ? Integer.MAX_VALUE : nums2[j];

            if(x1 <= y2 && y1 <= x2){
                if((m + n) % 2 == 0){
                    return (Math.max(x1 , y1 ) + Math.min(x2 , y2)) / 2.0;
                }else{
                    return (double) Math.max(x1 , y1);
                }
            }

            if(x1 > y2){
                high = i - 1;
            }else{
                low = i + 1;
            }
        }

        return -1;
    }
}