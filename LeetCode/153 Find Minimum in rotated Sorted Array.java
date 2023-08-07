/*
Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:

[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums of unique elements, return the minimum element of this array.

You must write an algorithm that runs in O(log n) time.
*/
class Solution {
    public int findMin(int[] nums) {
      
     int j=nums.length-1;
     if(j==0)
     return nums[0];
     else if(nums[0]<nums[j])
     return nums[0];
     else
     for(int i=0;i<j;i++,j--){
         if(nums[i]<nums[j])
         return nums[i];
         else if(nums[i]>nums[i+1]){
             return nums[i+1];
         }
         else if(nums[j-1]>nums[j])
         break;
     }
     return nums[j];
    }
}
