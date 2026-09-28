class Solution {
    public int maxDepth(String s) {
        int count = 0;
        int ans = 0;
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if( c == '(')count++;
            else if (c == ')'){
                count--;
            }
            ans = Math.max(ans , count);
        }
        return ans;
    }
}