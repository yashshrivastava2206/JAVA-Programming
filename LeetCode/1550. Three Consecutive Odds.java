/*
Given an integer array arr, return true if there are three consecutive odd numbers in the array. Otherwise, return false.
*/
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        for(int i=0;i<=arr.length-3;i++){
            if((arr[i]&1)==1 && (arr[i+1]&1)==1 && (arr[i+2]&1)==1)
            return true;
        }
        return false;
    }
}
