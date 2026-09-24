class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        int count = 0;
        int i = 0;
        int j = 0;
        while(i < arr.length){
            sum += arr[i];
            if(i - j + 1 == k){
                int average = sum / k;
                if(average >= threshold)count++;
                sum -= arr[j];
                j++;
            }
            i++;
        }
        return count;
    }
}