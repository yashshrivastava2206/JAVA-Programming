/*
Given a string of English letters s, return the greatest English letter which occurs as both a lowercase and uppercase letter in s. The returned letter should be in uppercase. If no such letter exists, return an empty string.

An English letter b is greater than another letter a if b appears after a in the English alphabet.
*/
class Solution {
    public String greatestLetter(String s) {
        String str=" ";
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                int str1=s.charAt(i)+32;
                if(s.indexOf(String.valueOf((char)str1))!=-1){
                    int ss=s.charAt(i);
                    if(ss-(int)str.charAt(0)>0)
                    str=String.valueOf((char)ss);
                }
                
            }
        }
        return (str==" "?"":str);   
    }
}
