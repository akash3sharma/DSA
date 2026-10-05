class Solution {
    Boolean [][][] dp = new Boolean [101][101][400];
    int m ;
    int n ;
    public boolean hasValidPath(char[][] grid) {
         m = grid.length;
         n = grid[0].length;
         if(grid[m-1][n-1] == '(')return false;
        if((m + n - 1) % 2 != 0){
            return false;
        }
        return solve(0 , 0 , 0 , grid);
    }
    boolean solve(int i , int j , int count , char [][]grid){
        if(i == m-1 && j == n-1){
            count--;
            if(count == 0)return true;
            else{
                return false;
            }
        }
        if(i > m-1 || j > n-1)return false;
        if(count < 0)return false;
        if(dp[i][j][count] != null)return dp[i][j][count];
        
        char c = grid[i][j];
        if(i < m && j < n){
            if(c == '(')return dp[i][j][count] = solve(i + 1 , j , count+1 , grid) || solve(i , j + 1 , count + 1 , grid);
            else{
               return dp[i][j][count] = solve(i + 1 , j , count - 1 , grid) || solve(i , j + 1 , count - 1 , grid);
            }
        }
        return false;
    }
}