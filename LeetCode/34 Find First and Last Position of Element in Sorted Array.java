class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] result= new int[2];
        result[0]=-1;
        result[1]=-1;
        int i;
        for(i=0;i<nums.length;i++){
            if(nums[i]==target){
                result[1]=result[0]=i;
                break;
            }
        }
        if(i<nums.length){
            for(int j=nums.length-1;j>i;j--){
                if(nums[j]==target){
                result[1]=j;
                break;
                }
            }
        }
        return result;
    }
}
