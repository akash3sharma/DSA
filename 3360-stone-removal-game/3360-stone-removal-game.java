class Solution {
    public boolean canAliceWin(int n) {
        int turn = 1 ;

        int last = 10;

        while(n >= last){
            n -= last;
            turn = turn == 1 ? 0 : 1;
            last --;
            if(last == 0){
                if(turn == 1)return false;
                else{
                    return true;
                }
            }
        }

        if(turn == 1)return false;
        return true;
    }
}