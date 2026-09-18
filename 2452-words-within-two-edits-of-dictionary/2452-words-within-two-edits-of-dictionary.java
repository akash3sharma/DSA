class Solution {
    public List<String> twoEditWords(String[] q, String[] d) {
        List <String> ans = new ArrayList<>();
        for(int i = 0 ; i < q.length ; i++ ){
            String a = q[i];
            for(int j = 0 ; j < d.length ; j++){
                int diff = 0;
                String b = d[j];
                int k = 0;
                while(k < a.length()){
                    if(a.charAt(k) != b.charAt(k))diff++;
                    if(diff > 2)break;
                    k++;
                }
                if(diff <= 2){ans.add(a);break;}
            }
        }
        return ans;
    }
}