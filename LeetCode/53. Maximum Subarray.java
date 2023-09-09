/*
Given an integer array nums, find the 
subarray
 with the largest sum, and return its sum.
*/
class Solution {
    public int maxSubArray(int[] nums) {
        int size = nums.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here
                = 0;
        int[] res= new int[2];
        res[0]=0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + nums[i];
            if (max_so_far < max_ending_here) {
                
                max_so_far = max_ending_here;
            }
            if (max_ending_here < 0){
                
                max_ending_here = 0;
            }
        }
        return max_so_far;
    }
}
