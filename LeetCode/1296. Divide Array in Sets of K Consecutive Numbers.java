/*
Given an array of integers nums and a positive integer k, 
check whether it is possible to divide this array into sets of k consecutive numbers.

Return true if it is possible. Otherwise, return false.
*/
class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        Arrays.sort(nums);
        int size=nums.length,a=0;
    
        for(int i=0;i<size;i++){
            if(nums[i]==0)
            continue;
            a=0;
            int next=nums[i]+1;
           
            for(int j=i+1;j<size && a<k-1;j++){
                if(nums[j]==0)
                continue;
                if(nums[j]==next){
                    ++next;
                    
                    nums[j]=0;
                    ++a;
                    
                }
            }
            if(a!=k-1)
            return false;
        }
        return (a==k-1?true:false);
    }
}
