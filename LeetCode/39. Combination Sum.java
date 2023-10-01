/*
Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the 
frequency
 of at least one of the chosen numbers is different.

The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.
*/
class Solution {
    public static void dfs(int[] nums,List<List<Integer>> list,List<Integer> set,int sum,int start,int target){
        if(sum==target){
            list.add(new ArrayList(set));
            return;
        }
        else if(sum>target) return;
        for(int i=start;i<nums.length;i++){
            if(start>i && nums[i]==nums[i-1] ) continue;
            set.add(nums[i]);
            dfs(nums,list,set,sum+nums[i],i,target);
            set.remove(set.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        dfs(candidates,list,new ArrayList<>(),0,0,target);
        return list;
    }
}
