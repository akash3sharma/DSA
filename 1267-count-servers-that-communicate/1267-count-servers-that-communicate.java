class Solution {
    public int countServers(int[][] grid) {

       int ans = 0;

       for(int i = 0 ; i < grid.length ; i++){

           int count = 0;

           int [] first = new int [2];

           Arrays.fill(first , -1);

        for(int j = 0 ; j < grid[0].length ; j++){

            if(grid[i][j] == 1){

                count++;

                if(first[0] == -1){
                    first[0] = i;
                    first[1] = j;
                }

                if(count > 1)grid[i][j] = 2;
            }

        }
        if(count > 1){
            ans += count;
            grid[first[0]][first[1]] = 2;
        }
    }


       for(int i = 0 ; i < grid[0].length ; i++){

            int count = 0;

            int fakecount = 0;

        for(int j = 0 ; j < grid.length ; j++){

            if(grid[j][i] == 1){
                count++;
            }

            if(grid[j][i] == 2)fakecount++;

          }

          if(count + fakecount > 1)ans += count;

       }
       return ans;
    }
}