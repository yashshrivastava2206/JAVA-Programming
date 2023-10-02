/*
An array is monotonic if it is either monotone increasing or monotone decreasing.

An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].

Given an integer array nums, return true if the given array is monotonic, or false otherwise.

 
*/
class Solution {
    public boolean isMonotonic(int[] nums) {
        int size=nums.length;
        
        if(size==1 ||size==2)
        return true;
        int i=0;
        while(i<size-1 && nums[i]==nums[i+1]){
            i++;
        }
        if(i==size-1)
        return true;
        if(nums[i]<nums[i+1]){
            while(i<size-1 && nums[i]<=nums[i+1])
            i++;
        }
        else{
            while(i<size-1 && nums[i]>=nums[i+1])
            i++;
        }
        return i==size-1?true:false;
    }
}
