class Solution {
    public String maximumXor(String s, String t) {
        int one = 0;
        int zero = 0;
        for(char c : t.toCharArray()){
            if(c == '1')one++;
            else{
                zero++;
            }
        }
        StringBuilder sb = new StringBuilder ();

        for(char c : s.toCharArray()){
            if(c == '1'){
                if(zero > 0){
                    sb.append("1");
                    zero--;
                }else{
                    sb.append("0");
                    one--;
                }
            }else{
                if(one > 0){
                    sb.append("1");
                    one--;
                }else{
                    sb.append("0");
                    zero--;
                }
            }
        }
        return sb.toString();
    }
}