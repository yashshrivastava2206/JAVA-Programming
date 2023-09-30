/*
Given an array of n integers nums, a 132 pattern is a subsequence of three integers nums[i], nums[j] and nums[k] such that i < j < k and nums[i] < nums[k] < nums[j].

Return true if there is a 132 pattern in nums, otherwise, return false.
*/
public class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int third = Integer.MIN_VALUE;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < third) return true;
            while (!stack.isEmpty() && stack.peek() < nums[i]) {
                third = stack.pop();
                System.out.println(third);
            }
            stack.push(nums[i]);
        }
        return false;
    }
}

// class Solution {
//     public boolean find132pattern(int[] nums) {
//         int size=nums.length;
//         if(size<3)
//         return false;
//         for(int i=2;i<size;i++){
//             if(nums[i-2]<nums[i] && nums[i]<nums[i-1]){
//                 return true;
                
//             }
            
//         }
//         return false;
//     }
// }
