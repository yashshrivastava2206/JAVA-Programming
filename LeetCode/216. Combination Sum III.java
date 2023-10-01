/*
Find all valid combinations of k numbers that sum up to n such that the following conditions are true:

Only numbers 1 through 9 are used.
Each number is used at most once.
Return a list of all possible valid combinations. The list must not contain the same combination twice, and the combinations may be returned in any order.
*/
class Solution {
        public static void dfs(int[] nums,List<List<Integer>> list,List<Integer> set,int sum,int start,int target,int k){
        if(sum==target && set.size()==k){
            
            list.add(new ArrayList(set));
            return;
        }
        else if(sum>target) return;
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1] ) continue;
            set.add(nums[i]);
            dfs(nums,list,set,sum+nums[i],i+1,target,k);
            set.remove(set.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int target) {
     List<List<Integer>> list = new ArrayList<>();
     int[] nums ={1,2,3,4,5,6,7,8,9};
        dfs(nums,list,new ArrayList<>(),0,0,target,k);
        return list;   
    }
}
