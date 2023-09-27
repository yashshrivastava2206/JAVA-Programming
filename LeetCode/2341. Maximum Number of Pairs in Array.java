/*
You are given a 0-indexed integer array nums. In one operation, you may do the following:

Choose two integers in nums that are equal.
Remove both integers from nums, forming a pair.
The operation is done on nums as many times as possible.

Return a 0-indexed integer array answer of size 2 where answer[0] is the number of pairs that are formed and answer[1] is the number of leftover integers in nums after doing the operation as many times as possible.
*/
class Solution {
    public int[] numberOfPairs(int[] nums) {
        Arrays.sort(nums);
        int size=nums.length;
        if(size==1)
        {
            int[] result={0,1};
            return result;
        }
        int pairs=0;
        int single=0;
        int i=0;
        for(i=0;i<size-1;){
            if(nums[i+1]==nums[i]){
                pairs++;
                i+=2;
                continue;
            }
            single++;
            i++;
        }
        if(i!=size)
        single++;
        int[] result={pairs,single};
        return result;
    }
