class Solution {
    Boolean [] [] [] dp = new Boolean [101][101][101];
    public boolean checkValidString(String s) {
        
    boolean ans = solve(0 , 0 , 0 , s);

    return ans ;
       
    }boolean solve (int i , int close , int open , String s){
        if(i == s.length()){
            if(close == open)return true;
            else{
                return false;
            }
        }
        if(close > open)return false;
        if(dp[i][close][open] != null) return dp[i][close][open];
        boolean ans;
        if(s.charAt(i) == '*'){
            boolean a = solve(i + 1 , close + 1 , open  , s);
            boolean b = solve( i + 1 , close , open + 1 , s);
            boolean c = solve(i+ 1 , close , open , s);
            ans =   a || b || c;
        }

        else if(s.charAt(i) == '('){
            ans = solve(i + 1 , close ,open + 1, s);
        }else{
            ans = solve(i + 1 , close + 1 , open , s);
        }
        return dp[i][close][open] = ans;
    }
}