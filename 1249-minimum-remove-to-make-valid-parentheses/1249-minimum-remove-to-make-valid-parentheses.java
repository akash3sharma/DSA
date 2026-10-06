class Solution {
    public String minRemoveToMakeValid(String s) {
        char [] arr = s.toCharArray();
        Stack <Integer> st = new Stack <>();
        for(int i = 0 ; i < arr.length ; i++){
            char c = arr[i];
            if(c == '('){
                st.push(i);
            }else if( c == ')' ){
                if(!st.isEmpty() && arr[st.peek()] == '(')st.pop();
                else{
                    st.push(i);
                }
            }
        }
        while(!st.isEmpty()){
            arr[st.pop()] = '0';
        }

        StringBuilder ans = new StringBuilder ();

        for(char c : arr){
            if(c != '0')ans.append(c);
        }
        return ans.toString();
    }
}