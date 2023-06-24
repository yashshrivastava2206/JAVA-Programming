/*
You are given a sorted unique integer array nums.

A range [a,b] is the set of all integers from a to b (inclusive).

Return the smallest sorted list of ranges that cover all the numbers 
in the array exactly. That is, each element of nums is covered by exactly 
one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.

Each range [a,b] in the list should be output as:

"a->b" if a != b
"a" if a == b
*/
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list =new ArrayList<>();
        int start=0;
        int end=nums.length;

        for(int i=0;i<nums.length;i++){
            start=i;
            
            while(i!=nums.length-1 && nums[i]+1==nums[i+1]){
               i++; 
               
            }
            end=i;
            if(start==end)
            list.add(""+nums[start]);
            else
            list.add(nums[start]+"->"+nums[end]);
        }
        return list;
    }
}228_Summa
