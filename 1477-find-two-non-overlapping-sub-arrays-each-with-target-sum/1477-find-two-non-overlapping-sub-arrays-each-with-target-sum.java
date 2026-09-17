class Solution {
    public int minSumOfLengths(int[] arr, int target) {
       int bestmin = arr.length + 100;
       int [] temp = new int [arr.length];
       Arrays.fill(temp , -1);
       int sum = 0;
       int j = 0;
       int result = arr.length + 1;
       for(int i = 0 ; i < arr.length ; i++){
            sum += arr[i];
            while(sum > target){
                sum -= arr[j];
                j ++;
            }
            if(sum == target){
                int len = i - j + 1;
                if(j > 0 && temp[j - 1] != -1){
                    result = Math.min(result , len + temp[j - 1]);
                }
                bestmin = Math.min(len , bestmin);
            }
             temp[i] = bestmin;
       }
       return result == arr.length + 1 ? -1 : result;
    }
}