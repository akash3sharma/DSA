class Solution {
    public int maxPalindromes(String s, int k) {
        int n = s.length();
        boolean [] [] dp = new boolean [n][n];
        int [] dp2 = new int [s.length()];
        Arrays.fill(dp2 , -1);
        for(int l = 1 ; l <= n ; l++){
            for(int start = 0 ; start + l <= n ; start++){
               int end = l + start -1;
                if(start == end){
                    dp[start][end] = true;
                }else if(end == start + 1 ){
                    if(s.charAt(start) == s.charAt(end)){
                           dp[start][end] = true;
                    }
                }else{
                    if(s.charAt(end) == s.charAt(start) && dp[start+1][end-1]){
                           dp[start][end] = true;
                    }
                }
            }
        }
 
    return solve(s.length() , k , dp , dp2);

    }int solve (int len , int k , boolean [][] dp , int [] dp2){
        if( len < k )return 0;

        int j = len - 1;

        if(dp2[j] != -1){
            return dp2[j];
        }
        int result = solve(len - 1 , k , dp , dp2);
        for(int i = 0 ; j - i + 1 >=  k ; i ++){
            
            if(dp[i][j]){
               result = Math.max(result ,1 + solve(i , k , dp , dp2)  );
            }
        }
        return dp2[j] = result;
    }
}