/*
You are given an integer array nums where the largest integer is unique.

Determine whether the largest element in the array is at least twice as much as every other number in the array. 
If it is, return the index of the largest element, or return -1 otherwise.
*/
class Solution {
    public int dominantIndex(int[] nums) {
        int max=nums[0];
        int secondLarge=nums[1];
        int result=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                secondLarge=max;
                result=i;
                max=nums[i];
            }
            else if(nums[i]>secondLarge)
            secondLarge=nums[i];
            
        }
        return max>=2*secondLarge?result:-1;
    }
}
