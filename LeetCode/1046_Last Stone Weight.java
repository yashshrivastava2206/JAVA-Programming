class Solution {
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        for(int i=(stones.length-1);i>0;i--){
            if(stones[i]==stones[i-1]){
                stones[i-1]=0;
            }
            else{
                Arrays.sort(stones);
                stones[i-1]=stones[i]-stones[i-1];
            }
        }
        return stones[0];
    }
}
