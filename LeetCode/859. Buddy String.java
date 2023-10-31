/*
Given two strings s and goal, return true if you can swap two letters in s so the result is equal to goal, otherwise, return false.

Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the characters at s[i] and s[j].

For example, swapping at indices 0 and 2 in "abcd" results in "cbad".
*/
class Solution {
    public boolean buddyStrings(String s, String goal) {
        int len1=s.length();
        int len2=goal.length();
        if(len1!=len2 || len1==1 || len2==1)
        return false;
        if(s.equals(goal)){
            char[] alphabet= new char[26];
            for(int i=0;i<len1;i++){
                alphabet[s.charAt(i)-97]++;
                if(alphabet[s.charAt(i)-97]==2)
                return true;
            }
            return false;
        }
        int i=-1,j=-1;
        for(int k=0;k<len1;k++){
            if(s.charAt(k)!=goal.charAt(k)){
                if(i==-1)
                i=k;
                else{
                    j=k;
                    break;
                }
            }
        }
        // System.out.println(i+" "+j);
        if(i!=-1 && j!=-1){char[] str = s.toCharArray();
        char temp=str[i];
        str[i]=str[j];
        str[j]=temp;
        s=new String(str);
        if(s.equals(goal))
        return true;
        }
        
        
        return false;
    }
}
