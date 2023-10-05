/*
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
*/
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int size= nums.length;
        if(size == 1)
        {
            list.add(nums[0]);
            return list;
        }
        int major=size/3;
        int count=1;
        Arrays.sort(nums);
        for(int i=0;i<size;i++){
            int temp=nums[i];
            while(i>0 && i<size && nums[i]==nums[i-1]){
                i++;
                ++count;
                
                
            }
            // System.out.println(count+" "+major);
            if(count>major){
                if(!list.contains(temp))
                list.add(temp);  
            }
            count=1;
        }
        return list;
    }
}
