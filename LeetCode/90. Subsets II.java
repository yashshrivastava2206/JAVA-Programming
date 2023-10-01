/*
Given an integer array nums that may contain duplicates, return all possible 
subsets
 (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.
*/
class Solution {
     public static void dfs(List<List<Integer>> list , int[] nums, List<Integer> set,int start){
        list.add(new ArrayList(set));
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1]) continue;
            set.add(nums[i]);
            dfs(list,nums,set,i+1);
            set.remove(set.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        dfs(list,nums,new ArrayList(),0);
        return list;
    }
}
