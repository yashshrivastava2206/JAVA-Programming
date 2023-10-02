/*
You are given a 0-indexed integer array nums. An index i is part of a hill in nums if the closest non-equal neighbors of i are smaller than nums[i]. Similarly, an index i is part of a valley in nums if the closest non-equal neighbors of i are larger than nums[i]. Adjacent indices i and j are part of the same hill or valley if nums[i] == nums[j].

Note that for an index to be part of a hill or valley, it must have a non-equal neighbor on both the left and right of the index.

Return the number of hills and valleys in nums.
*/
class Solution {
    public int countHillValley(int[] nums) {
        int size=nums.length;
        
        int count=0;
        int i=0;
        while(i<size-1 && nums[i]==nums[i+1])
        i++;
        int left=nums[i];
        // System.out.println(i);
        i+=1;
        for(;i<size-1;i++){
            if(nums[i]==nums[i+1]) continue;
            if(left<nums[i] && nums[i+1]<nums[i]){
                // System.out.println(left+" Hill");
                left=nums[i];
                count++;
            }
            if(left>nums[i] && nums[i+1]>nums[i]){
                // System.out.println(left+" Valley");
                left=nums[i];
                count++;
            }
        }
        return count;
    }
}
