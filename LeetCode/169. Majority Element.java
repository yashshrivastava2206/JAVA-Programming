/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
*/
//Solution 1
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }
}

//Solution 2
class Solution {
    public int majorityElement(int[] nums) {
        int size=nums.length;
        int major=size/2;
        Arrays.sort(nums);
        int temp=nums[0];
        for(int i=0;i<size;i++){
            int count=1;
            temp=nums[i];
            for(int j=i+1;j<size && nums[i]==nums[j];j++){
                count++;
                if(count>major)
                return temp;
            }
            
        }
        return temp;
    }
}

//Solution 3
class Solution {
    public int majorityElement(int[] nums) {
        int size=nums.length;
        int major=size/2;
        // Arrays.sort(nums);
        int temp=nums[0];
        for(int i=0;i<size;i++){
            int count=1;
            temp=nums[i];
            for(int j=i+1;j<size;j++){
                if(nums[i]==nums[j])
                count++;
                if(count>major)
                return temp;
            }
            
        }
        return temp;
    }
}
