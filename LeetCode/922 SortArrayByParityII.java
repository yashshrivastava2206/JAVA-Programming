/*
Given an array of integers nums, half of the integers in nums are odd, and the other half are even.

Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.

Return any answer array that satisfies this condition.
*/
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int size=nums.length;
        int[] result=new int[size];
        int i=0,j=1;
        for(int k=0;k<size;k++){
            if(nums[k]%2==0){
                result[i]=nums[k];
                i=i+2;
            }
            else{
                result[j]=nums[k];
                j=j+2;
            }
        }
        return result;
    }
}
