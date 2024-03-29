/*
Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2x.
*/
class Solution {
    public boolean isPowerOfTwo(int n) {
        int pow=1;
        long rem=-1;
        if(n==1)
        return true;
        else if(n<0)
            return false;
        while(n!=rem && n>rem){
            rem=(long)Math.pow(2,pow);
            pow++;
        }
        if(rem==n)
           {return true;}

        return false;
    }
}
