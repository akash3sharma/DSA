class Solution {
    public int totalNumbers(int[] digits) {
        int [] arr = new int [ 11];
        for(int i = 0 ; i < digits.length ; i++){
            arr[digits[i]] ++;
        }
        int count = 0;
        for(int i = 100 ; i < 999 ; i = i + 2){
            int temp = i;
            int a = temp % 10;
            temp /= 10;
            int b = temp % 10;
            temp/= 10;
            int c = temp % 10;

            int [] need = new int [10];
            need[a] ++;
            need[b] ++ ;
            need[c] ++;
            boolean ok = true;
            for(int d = 0 ; d < 10 ; d++){
                if(need[d] > arr[d]){
                    ok = false;
                    break;
                }
            }
            if(ok)count++;
        }
        return count;
        
    }
}