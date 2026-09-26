class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap <String , String> hp = new HashMap <>();
        for(int i = 0 ; i < knowledge.size() ; i++){
            List <String> temp = knowledge.get(i);
            String key = temp.get(0);
            String value = temp.get(1);
            hp.put(key , value);
        }
        StringBuilder ans = new StringBuilder();

        int i = 0;
        while(i < s.length()){
            char c = s.charAt(i);
            if(c == '('){
                int j = i;
                while(s.charAt(j) != ')'){
                    j++;
                }
                if(j - i + 1 > 12)ans.append('?');
                else{
                    String temp = s.substring(i+1 , j);
                    ans.append(hp.containsKey(temp) ? hp.get(temp) : '?');
                }
                i = j;
            }else{
                ans.append(c);
            }
            i++;
        }
       return ans.toString();
    }
}