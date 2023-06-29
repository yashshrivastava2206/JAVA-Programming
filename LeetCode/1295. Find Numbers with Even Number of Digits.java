/*
Given an array nums of integers, return how many of them contain an even number of digits.
*/
class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i: nums){
            int temp=0;
            while(i>0){
                temp++;
                i=i/10;
            }
            if(temp%2==0)
            count++;
        }
        return count;
    }
}
