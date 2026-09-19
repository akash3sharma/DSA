class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        int digit = n;
        int [] arr = new int [n + 1];
        arr[0] = 1;
        if(n == 0)return arr[0];
        arr[1] = 10;
        if(n == 1)return arr[1];
        arr[2] = 91;
        if(n == 2)return arr[2];
        for(int i = 3 ; i <= digit ; i++){
            int j = 81;
            int temp = 8;
            while(temp >= 11 - i){
                j = j * temp;
                temp--;
            }
            arr[i] = j + arr[i - 1];
        }
        return arr[n];
    }
}