class Solution {
    public int[] canSeePersonsCount(int[] he) {
        int n = he.length;
        Stack <Integer > st = new Stack <>();
        int [] arr = new int [n];
        for(int i = n - 1; i >= 0; i--){
            int count = 0;

            while(!st.isEmpty() && he[st.peek()] < he[i]){
             count++;
             st.pop();
            }

           if(!st.isEmpty()) count++;

          arr[i] = count;
          st.push(i);
      }
        return arr;
    }
}