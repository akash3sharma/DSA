class Solution {
    public int countDaysTogether(String a, String la, String b , String lb) {
        int ar = days(a);
        int al = days(la);
        int br = days(b);
        int bl = days(lb);
        return Math.max(0 , Math.min(al , bl) - Math.max(ar , br) + 1);
    }int days (String s){
        int m = 0;
        for(int i = 0; i < 2 ; i++){ 
             m = m * 10 + (s.charAt(i) - '0');
        }
        int day = 0;
        int [] arr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for(int i = 1 ; i < arr.length ; i++){
            arr[i] = arr[i] + arr[i - 1];
        }
        
        day += (m == 1) ? 0 : arr[m - 2];

        int temp = 0;
        for(int i = 3 ; i < s.length();i++){
            temp = temp * 10 + (s.charAt(i) - '0');
        }
        return day + temp;
    }
}