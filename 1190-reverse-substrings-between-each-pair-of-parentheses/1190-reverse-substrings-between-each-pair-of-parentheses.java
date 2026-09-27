class Solution {
    public String reverseParentheses(String s) {
        char [] arr = s.toCharArray();
        Stack <Integer> st = new Stack <>();
        for(int i = 0; i < s.length() ; i++){
            char c = s.charAt(i);
            if(c == ')'){
                while(s.charAt(st.peek()) != '('){
                    st.pop();
                }
                reverse(st.pop() , i , arr);
            }else{
                st.push(i);
            }
        }
        String ans = "";
        for(char c : arr){
            if(c != '(' && c != ')'){
                ans += c;
            }
        }
        return ans;
    }void reverse(int i , int j , char [] arr){
        i++;
        j--;
        while(j >= i){
           char temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
           j--;
           i++;
        }
        return;
    }
}