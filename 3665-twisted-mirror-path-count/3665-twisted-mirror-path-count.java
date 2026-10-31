class Solution {
    int [] [] [] dp ;
    int mod = 1000000007;
    public int uniquePaths(int[][] grid) {
        dp = new int [grid.length][grid[0].length][2];
        for(int [] [] a : dp){
            for( int [] b : a){
                Arrays.fill(b , -1);
            }
        }
        int a = path(0 , 0 , grid , 0);
        return a ;
    }int path(int i , int j , int [][] arr , int m){
        if(i == arr.length - 1 && j == arr[0].length - 1 ){
            return 1;
        }

        if( i >= arr.length) return 0;

        if( j >= arr[0].length) return 0;

        if(dp[i][j][m] != -1)return dp[i][j][m];
        
        int a = 0;
        int b = 0;
        if(arr[i][j] == 1){
            if(m == 0){
              a = a + (path(i , j + 1 , arr , 1)); 
            }else{
              a = a + path(i + 1 , j , arr , 0);
            }
        }else{
              a = a + path(i , j + 1 , arr , 1);
              b = b + path(i + 1 , j , arr , 0);
        }
        return dp[i][j][m] = (a + b) % mod ;
    }
}