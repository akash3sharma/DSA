class Solution {
    public int longestValidParentheses(String s) {
       Stack <Integer> st = new Stack <>();
       for(int i = 0 ; i < s.length() ; i++){
        char c = s.charAt(i);
        if(st.size() == 0){
            st.push(i);
        }else{
            if(c == ')' && s.charAt(st.peek()) == '('){
                st.pop();
            }else{
                st.push(i);
            }
        }
       }
       int [] arr = new int [st.size()];
       if(st.size() == 0)return s.length();
       if(st.size() == 1)return Math.max(st.peek() - 0 , s.length() - 1 - st.peek());
       int i = st.size() - 1;
       int ans = 0;
       while(!st.isEmpty()){
         arr[i] = st.pop();
         i--;
       }
       int one = arr[0] - 0;
       int two = s.length() - 1 - arr[arr.length - 1];
       for(int j = 0 ; j < arr.length - 1 ; j++){
        ans = Math.max(arr[j + 1] - arr[j] - 1 , ans);
       }
       ans = Math.max(one , Math.max(ans , two));
       return ans;
    }
}