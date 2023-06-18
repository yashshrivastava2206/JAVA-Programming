/*
Given an integer array nums, return the number of elements that 
have both a strictly smaller and a strictly greater element appear in nums.
*/
class Solution {
    public int countElements(int[] nums) {
        int count=0;
        int size=nums.length;
        Arrays.sort(nums);
        for(int i=1;i<size-1;i++){
            int j=i+1;
            if(nums[i-1]==nums[i] && count!=0)
            count++;
            if(nums[i-1]<nums[i]){
            while(j<size){
                if(nums[i]<nums[j])
                break;
                j++;
            }
            if(j==size)
            break;
            count++;
            }
           
        }
       return count;
    }
}
