class Solution {
    public int scoreOfParentheses(String s) {
        int count = 0;
        int score = 0;
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if(c == '('){
                count ++;
            }
            else{
                count --;
                if(s.charAt(i-1) == '('){
                    score += (1 << count);
                }
            }
        }
        return score;
    }
}