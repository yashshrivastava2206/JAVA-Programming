/*
Given an unsorted array of integers nums, return the length of the longest continuous increasing subsequence 
(i.e. subarray). The subsequence must be strictly increasing.

A continuous increasing subsequence is defined by two indices l and r (l < r)
such that it is [nums[l], nums[l + 1], ..., nums[r - 1], nums[r]] and for each l <= i < r, nums[i] < nums[i + 1].
*/
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count =1,max=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1])
            count++;
            else{
                if(count>max)
                max=count;
                count=1;
            }
        }
        
        return (max<count? count:max);
    }
}
