class Solution {
    public int leastBricks(List<List<Integer>> wall) {
         HashMap <Long , Long> hp = new HashMap <>();
        
        for(int i = 0 ; i < wall.size() ; i++){
          long sum = 0;
          for(int j = 0 ; j < wall.get(i).size() ; j++){
             sum += wall.get(i).get(j);
             if(j != wall.get(i).size() - 1){
               if(!hp.containsKey(sum)){
                hp.put(sum , 1L);
             }else{
              hp.put(sum , hp.get(sum) + 1);
             }
             }
          }
        }

        long max = 0;
        for(long i : hp.keySet()){
          max = Math.max(max , hp.get(i));
        }
      return (int) (wall.size() - max);
    }
}