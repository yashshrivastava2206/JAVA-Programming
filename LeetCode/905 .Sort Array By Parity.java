/*
Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

Return any array that satisfies this condition.
*/
//Solution 1:
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int even=0;
        int size=nums.length;
        for(int i=0;i<size;i++){
            if((nums[i]&1)==0)
            even++;
        }
        int[] result= new int[size];
        {
            int e=0,o=even;
            for(int i=0;i<size;i++){
                if((nums[i]&1)==0)
                {
                    result[e]=nums[i];
                    e++;
                }
                else{
                    result[o]=nums[i];
                    o++;
                }
            }
        }
        return result;
    }
}

//Solution 2:
class Solution {
     public int[] sortArrayByParity(int[] nums) {
         int size= nums.length;
         for(int i=0;i<size;i++){
             if((nums[i]&1)!=0){
                 int j=0;
                 for(j=i+1;j<size;j++){
                     if((nums[j]&1)==0){
                         int temp=nums[i];
                         nums[i]=nums[j];
                         nums[j]=temp;
                         break;
                     }
                 }
                 if(j==size){
                     break;
                 }
             }
         }
         return nums;
     }
 }
