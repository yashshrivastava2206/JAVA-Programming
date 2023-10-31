/*
You are given an integer array pref of size n. Find and return the array arr of size n that satisfies:

pref[i] = arr[0] ^ arr[1] ^ ... ^ arr[i].
Note that ^ denotes the bitwise-xor operation.

It can be proven that the answer is unique.

 
*/
class Solution {
    public int[] findArray(int[] pref) {
        int length=pref.length;
        if(length==1)
        return pref;
        int[] prefXOR= new int[length];
        prefXOR[0]=pref[0];
        for(int i = 1; i < pref.length; i++) {
            prefXOR[i] = pref[i] ^ pref[i-1];
        }
        return prefXOR;
    }
}
