class Solution {
    public int minOperations(int[] nums) {
       
       int index = 0;

       for(int i = 0 ; i < nums.length ; i++){
          if(nums[i] == 0)
          {index = i;
          break;}
       }
       int n = nums.length;

       boolean asc = true;

       boolean dsc = true;

       for(int i = 1 ; i < n ; i++){
          
          int temp = nums[(index + i) % n];

          if(temp != i)asc = false;

          if(temp != (n - i))dsc = false;

          if(!asc && !dsc){
            return -1;
          }
       }
       if(asc){
          return Math.min(index , n - index + 2 );
       }

       return Math.min(n - index , index + 2);
    }
}