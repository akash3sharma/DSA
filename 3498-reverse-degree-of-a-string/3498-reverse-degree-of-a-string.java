class Solution {
    public int reverseDegree(String s) {
       int ans = 0;
       for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            int d = 'z' - c;
            ans += ((d + 1) * (i + 1));
       } 
       return ans;
    }
}