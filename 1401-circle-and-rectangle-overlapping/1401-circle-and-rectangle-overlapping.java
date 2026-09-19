class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int a = xCenter;
        int b = yCenter;

        if(x1 > xCenter){
            a = x1;
        }else if(xCenter > x2){
            a = x2;
        }
        if(y1 > yCenter){
            b = y1;
        }else if(yCenter > y2){
            b = y2;
        }

        double d = Math.sqrt(Math.pow(xCenter - a , 2) + Math.pow(yCenter - b , 2));
        if(d > radius)return false;
        else{
            return true;
        }
    }
}