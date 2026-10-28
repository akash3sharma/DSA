class Solution {
    int [] [] [] dp;
    public int minCost(int[][] grid) {
      int n = grid.length;
      int m = grid[0].length;
      dp = new int [n] [m] [1024];
      dp[0][0][grid[0][0]] = 1;
      for(int i = 0 ; i < n ; i++){
        for(int j = 0 ; j < m ; j++){
            if(i == 0 && j == 0)continue;
            
            int [] up = new int [1024];
            int [] down = new int [1024];
            if(i > 0){
                up = dp[i - 1][j];
            }
            if(j > 0){
                down = dp[i][j-1];
            }

            int [] comb = new int [1024];
            for(int k = 0 ; k < 1024 ; k++){
                comb[k] = up[k] | down[k];
                if(comb[k] == 1)
                {int temp = k ^ grid[i][j];
                dp[i][j][temp] = 1;}
            }
        }
      } 
      int [] temp = dp[n - 1][m - 1];

      for(int i = 0 ;i < temp.length ; i++){
        if(temp[i] != 0)return i;
      }
      return 1023;
    }
}