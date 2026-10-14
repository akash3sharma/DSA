class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder ans = new StringBuilder ();
        while(sum > 9 && num > 0){
            sum -= 9;
            ans.append('9');
            num--;
        }
        if(num == 0 && sum == 0)return ans.toString();
        if(num == 0 && sum != 0)return "";
        else{
            if(num > 0){
                String toadd = sum + "";
                sum -= sum;
                ans.append(toadd);
                num--;
            }
            while(num > 0){
                ans.append('0');
                num--;
            }
        }
        if(num == 0 && sum != 0)return "";
        else{
            return ans.toString();
        }
    }
}