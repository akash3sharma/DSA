class Solution {
    public String[] createGrid(int m, int n) {
        String [] ans = new String [m];
   
        for(int i = 0 ; i < m - 1 ; i ++){
           StringBuilder temp = new StringBuilder ();
           temp.append(".");
           for(int j = 0 ; j < n - 1 ; j++){
                temp.append("#");
           }
           ans[i] = temp.toString();
        }
        StringBuilder temp = new StringBuilder ();
        for(int i = 0 ; i < n ; i++){
            temp.append(".");
        }
        ans[ans.length - 1] = temp.toString();
        return ans;
    }
}