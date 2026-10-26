class Solution {
    public int countIslands(int[][] grid, int k) {
       int ans = 0;
       for(int i = 0 ; i < grid.length ; i++){
        for(int j = 0 ; j < grid[0].length ; j++){
            if(grid[i][j] != 0){
                long sum = solve(grid , i , j);
                if(sum % k == 0)ans ++;
            }
        }
       }
       return ans;
    }long solve(int [][] grid , int i , int j){
        long sum = grid[i][j];
        grid[i][j] = 0;
        if(i - 1 >= 0 && grid[i - 1][j] != 0)sum +=solve(grid , i - 1 , j);
        if(j - 1 >= 0 && grid[i][j - 1] != 0)sum +=solve(grid , i , j - 1);
        if(i + 1 < grid.length && grid[i + 1][j ] != 0)sum +=solve(grid , i + 1, j );
        if(j + 1 < grid[0].length && grid[i][j + 1] != 0)sum +=solve(grid , i , j + 1);

        return sum;
    }
}