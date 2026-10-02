class Solution {
    List <String> ans = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        solve(0 , 0 , n , "");
        return ans;
    }void solve(int l , int r , int n , String s){
        if((l + r) == 2 * n){
            ans.add(s);
            return ;
        }

        if(l < n){
            solve(l + 1 , r , n , s + '(');
        }
        if(r < l){
            solve(l , r + 1 , n , s + ')');
        }

        return ;
    }
}