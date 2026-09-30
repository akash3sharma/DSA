class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int [] arr = new int[seq.length()];
        Stack <Integer> st = new Stack <>();
        for(int i = 0 ; i < seq.length() ; i++){
            char c = seq.charAt(i);
            if(st.size() == 0){
                st.push(0);
                arr[i] = 0;
            }else{
                if(c == '('){
                    if(seq.charAt(i - 1) == ')'){
                        arr[i] = arr[i - 1];
                        st.push(arr[i - 1]);
                    }
                    else if(arr[i - 1] == 0){
                        arr[i] = 1;
                        st.push( 1);
                    }else{
                        arr[i] = 0;
                        st.push( 0);
                    }
                }else{
                    int temp = st.pop();
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
}