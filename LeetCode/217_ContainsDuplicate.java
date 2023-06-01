/*
Given an integer array nums, return true if any value appears at 
least twice in the array, and return false if every element is distinct.
*/
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int len= nums.length;
        int j=len-1;
        for(int i=0;i<=len-2;i++,j--){
            if(nums[i]==nums[i+1])
            return true;
            // if(nums[j]==nums[j-1])
            // return true;
        }
        return false;
    }
}
