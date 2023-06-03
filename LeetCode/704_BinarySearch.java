/*
Given an array of integers nums which is sorted in ascending order, 
and an integer target, write a function to search target in nums. 
If target exists, then return its index. Otherwise, return -1.
You must write an algorithm with O(log n) runtime complexity.
*/class Solution {
    public int search(int[] nums, int target) {
        int end=nums.length-1;
        int start=0;
        int mid=(start+end)/2;
        while(start<=end){
            if(nums[mid]==target)
            return mid;
            if(nums[mid]>target)
           { end=mid-1;
           mid=(start+end)/2;
           }
            if(nums[mid]<target){
                start=mid+1;
                mid=(start+end)/2;
            }

        }
        return -1;
    }
}
