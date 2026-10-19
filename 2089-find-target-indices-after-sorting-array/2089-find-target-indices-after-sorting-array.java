class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int [] freq = new int [101];
        for(int i : nums){
            freq[i] ++;
        }
        List <Integer> ans = new ArrayList<>();
        int p = 0;
        for(int i = 0 ; i < freq.length ; i++){
            if(freq[i] > 0){
                if(i == target){
                    while(freq[i] > 0){
                        ans.add(p);
                        p++;
                        freq[i]--;
                    }
                }else{
                  p += freq[i];
                }
            }
        }
        return ans;
    }
}