/*
Given an integer array nums where every element appears three times except for one,
which appears exactly once. Find the single element and return it.

You must implement a solution with a linear runtime complexity and use only constant extra space.
*/
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i;
        for( i=0;i<nums.length-3;i=i+3){
            if(nums[i]!=nums[i+2])
            break;
        }
        return nums[i];
    }
}
