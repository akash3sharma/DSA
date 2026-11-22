class Solution {
    public boolean checkString(String s) {
        if(s == "")return true;
        int a = -1;
        int b = s.length();
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if(c == 'a' && i > a)a = i;
            if(c == 'b' && i < b)b = i;
        }
        return a < b ;
    }
}