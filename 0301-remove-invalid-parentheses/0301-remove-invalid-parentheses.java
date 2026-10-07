class Solution {
    Set<String> ans1 = new HashSet<>();
    public List<String> removeInvalidParentheses(String s) {
        ans(0  , new StringBuilder() , s , 0);
        List <String> temp = new ArrayList<>(ans1);
        List <String > ans = new ArrayList <>();
        int size = 0;
        for(String a : temp){
            size = Math.max(size , a.length());
        }
        for(String a : temp){
            if(a.length() == size)ans.add(a);
        }
        return ans;
    }void ans (int i ,  StringBuilder sb , String s , int count){
        if(i == s.length()){
            if(count == 0)ans1.add(sb.toString());
            return ;
        }
        char c = s.charAt(i);
        if(count < 0)return ;
        // taking the char
        if(c == '('){
            sb.append(c);
            ans(i + 1 , sb , s , count + 1);
            sb.deleteCharAt(sb.length() - 1);
            ans(i + 1 , sb , s ,  count );
        }else if(c == ')'){
            sb.append(c);
            ans(i + 1 , sb , s , count - 1);
            sb.deleteCharAt(sb.length() - 1);
            ans(i + 1 , sb , s , count );
        }else{
            sb.append(c);
            ans(i + 1 , sb , s , count );
            sb.deleteCharAt(sb.length() - 1);
        }
        return;
    }
}