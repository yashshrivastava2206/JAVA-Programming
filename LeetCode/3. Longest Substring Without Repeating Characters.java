/*
Given a string s, find the length of the longest 
substring
 without repeating characters.
*/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        Set<Character> set = new HashSet<>();
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            if (!set.contains(s.charAt(right))) {
                
                set.add(s.charAt(right));
                // System.out.println(set);
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                while (set.contains(s.charAt(right))) {
                    // System.out.println(left + " "+ right);
                    set.remove(s.charAt(left));
                    left++;
                }
                // System.out.println(set);
                set.add(s.charAt(right));
            }
        }
        
        return maxLength;
    }
}
