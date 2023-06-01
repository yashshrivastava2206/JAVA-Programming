/*
Given an integer array nums, return the most frequent even element.

If there is a tie, return the smallest one. If there is no such element, return -1.

 
*/

class Solution {
    public int mostFrequentEven(int[] nums) {
        int min=-1,count=0,count1=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                count++;
                if(count>count1){
                    count1=count;
                    min=nums[i];
                }
            }
            if((i<nums.length-1)){
            if(nums[i]!=nums[i+1]){
            count=0;
            }
        }
        return min;
    }
}
