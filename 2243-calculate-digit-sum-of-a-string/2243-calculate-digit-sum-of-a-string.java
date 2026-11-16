class Solution {
    public String digitSum(String s, int k) {
        while(s.length() > k){
            StringBuilder temp = new StringBuilder();
            for(int i = 0 ; i < s.length() ; i+=k){
               StringBuilder curr = new StringBuilder();
               if(i + k < s.length()){
                  curr = convert(s , i , i + k - 1);
               }else{
                  curr = convert(s , i , s.length() - 1);
               }
               temp.append(curr);
            }
            s = temp.toString();
        }
        return s;
    }StringBuilder convert(String s , int i , int j){
        int num = 0;
        for(int k = i ; k <= j ; k++){
            num += (s.charAt(k) - '0');
        }
        return new StringBuilder(num + "");
    }
}