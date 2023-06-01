/*
A phrase is a palindrome if, after converting all uppercase letters into 
lowercase letters and removing all non-alphanumeric characters, it reads the 
same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise
*/
class Solution {
    public boolean isPalindrome(String s) {
        
        s=s.toLowerCase();
        StringBuffer str=new StringBuffer();
        for(int k=0;k<=s.length()-1;k++){
            if((s.charAt(k)>='a' && s.charAt(k)<='z') || ( s.charAt(k)>='0' && s.charAt(k)<='9'))
            str.append(s.charAt(k));
        }
        
        int j=str.length();
        if(j==0)
        return true;
        j--;
        
        for(int i=0;i<=(str.length())/2 && str.length()>=2;i++){
            
            if(str.charAt(i)!=str.charAt(j))
            return false;
            j--;
        }
        return true;
    }
}
