/*
Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.
*/
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        
        if(s.length()==1)
        return false;
        String doubled = s + s;
        String sub = doubled.substring(1, doubled.length() - 1);
        return sub.contains(s);
        
    }
}
