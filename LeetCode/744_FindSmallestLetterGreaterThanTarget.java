/*
You are given an array of characters letters that is sorted in non-decreasing order, 
and a character target. There are at least two different characters in letters.

Return the smallest character in letters that is lexicographically 
greater than target. If such a character does not exist, return the first character in letters.
*/

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(char c: letters){
            int a=c;
            int tgt=target;
            if(a>tgt)
            return (char)(a);
        }
        return letters[0];
    }
}
