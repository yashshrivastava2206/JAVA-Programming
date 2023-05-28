//2696. Minimum String Length After Removing Substrings
/*
You are given a string s consisting only of uppercase English letters.

You can apply some operations to this string where, in one operation, you can remove any occurrence of one of the substrings "AB" or "CD" from s.

Return the minimum possible length of the resulting string that you can obtain.

Note that the string concatenates after removing the substring and could produce new "AB" or "CD" substrings.
*/
class Solution {
    public int minLength(String s) {
        while(s.contains("AB") || s.contains("CD")) {
            if(s.contains("AB")) {
                int index = s.indexOf("AB");
                s = s.substring(0, index) + s.substring(index + 2);
            } else {
                int index2 = s.indexOf("CD");
                s = s.substring(0, index2) + s.substring(index2 + 2);
            }
        }
        return s.length();
    }
}
