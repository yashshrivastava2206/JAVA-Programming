/*
Write a function that takes the binary representation of an unsigned integer and returns 
the number of '1' bits it has (also known as the Hamming weight).
*/
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        
        int count=0;
        
        while(n!=0){
            if((n&1)!=0)
            count++;
            n = n>>>1;
        }
        
        
        return count;
    }
}
