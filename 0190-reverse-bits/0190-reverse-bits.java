class Solution {
    public int reverseBits(int n) {
      int [] bit = new int [32];
      int i = 31;
      while( n > 0){
        int temp = n % 2;
        bit[i] = temp;
        n /= 2;
        i--;
      } 
      i = 0 ;
      int j = 31 ;
      while(i <= j){
        int temp = bit[i];
        bit[i] = bit[j];
        bit[j] = temp;
        i++;
        j--;
      } 
      long ans = 0;
      long prod = 1;
      for(int k = 31 ; k >= 0 ;k--){
        ans += (prod * bit[k]);
        prod = prod * 2;
      }

      return  (int)ans;
    }
}