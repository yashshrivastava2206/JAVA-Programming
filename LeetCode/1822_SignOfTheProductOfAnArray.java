/*
There is a function signFunc(x) that returns:

1 if x is positive.
-1 if x is negative.
0 if x is equal to 0.
You are given an integer array nums. Let product be the product of all values in the array nums.

Return signFunc(product).
*/
class Solution {
    public int arraySign(int[] nums) {
        double product=1;
        for(int n: nums){
            product=product*n;
        }
        if(product>0)
        return 1;
        else if(product<0)
        return -1;
        return 0;
    }
}
