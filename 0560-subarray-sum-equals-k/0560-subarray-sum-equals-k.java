class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap <Integer , Integer> hp = new HashMap <>();

        int sum = 0;

        int count = 0;

        hp.put(0 , 1);

        for(int i = 0 ; i < nums.length ; i++){
            
            sum += nums[i];

            if(hp.containsKey(sum - k)){
                count += hp.get(sum - k);
            }

            hp.put(sum , hp.getOrDefault(sum , 0) + 1);
        }

        return count;
    }
}