/*
Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.

Each number in candidates may only be used once in the combination.

Note: The solution set must not contain duplicate combinations.
*/
class Solution {
        public static void dfs(int[] nums,List<List<Integer>> list,List<Integer> set,int sum,int start,int target){
        if(sum==target){
            
            list.add(new ArrayList(set));
            return;
        }
        else if(sum>target) return;
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1] ) continue;
            set.add(nums[i]);
            dfs(nums,list,set,sum+nums[i],i+1,target);
            set.remove(set.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
     List<List<Integer>> list = new ArrayList<>();
     Arrays.sort(candidates);
        dfs(candidates,list,new ArrayList<>(),0,0,target);
        return list;   
    }
}
