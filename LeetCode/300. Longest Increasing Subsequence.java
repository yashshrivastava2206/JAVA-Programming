/*
Given an integer array nums, return the length of the longest strictly increasing 
subsequence
.
*/
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n= nums.length;
        int[] table = new int[n+1];
        // Arrays.fill(table,1);
        for(int i=1;i<n;++i){
            for(int j=0;j<i;++j){
                if(nums[i]>nums[j])
                table[i]=Math.max(table[i],table[j]+1);
            }
        }
        return Arrays.stream(table).max().orElse(0)+1;
    }
}
