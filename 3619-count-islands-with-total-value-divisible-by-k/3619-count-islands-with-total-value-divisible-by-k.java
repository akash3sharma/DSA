class Solution {
    public int countIslands(int[][] grid, int k) {
        int ans = 0;
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[0].length ; j++){
                if(grid[i][j] != 0){
                    long sum = mark(grid , i , j);
                    if(sum % k == 0)ans++;
                }
            }
        }
        return ans;
    }long mark(int [][] grid , int i , int j ){
        Queue <Integer> q = new ArrayDeque <>();
        int n = grid.length;
        int m = grid[0].length;

        int key = i * m + j;

    

        q.add(key);
        HashSet <Integer> hs = new HashSet<>();
        hs.add(key);
        long sum = 0;
        while(!q.isEmpty()){
            int temp1 = q.remove();
            int r = temp1 / m;
            int c = temp1 % m;
            
            sum += grid[r][c];

            grid[r][c] = 0;

            if(r - 1 >= 0){
                if(!hs.contains((r - 1) * m + c) && grid[r-1][c] != 0){
                    hs.add((r - 1) * m + c);
                    q.add((r - 1)* m + c);
                }
            }

            if(c - 1 >= 0){
                int temp = r * m + ( c - 1);
                if(!hs.contains(temp) && grid[r][c-1] != 0){
                    hs.add(temp);
                    q.add(temp);
                }
            }

            if(c + 1 < m){
                int temp = r * m + ( c + 1);
                if(!hs.contains(temp) && grid[r][c + 1] != 0){
                    hs.add(temp);
                    q.add(temp);
                }
            }

            if(r + 1 < n){
                int temp = (r + 1) * m + c ;
                if(!hs.contains(temp) && grid[r + 1][c] != 0){
                    hs.add(temp);
                    q.add(temp);
                }
            }
        }
        return sum;
    }
}