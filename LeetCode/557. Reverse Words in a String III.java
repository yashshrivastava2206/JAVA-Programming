/*
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
*/
class Solution {
    public static String revWord(String s,int start, int end){
        StringBuilder word = new StringBuilder();
        for(int i=end-1;i>=start;i--){
            word.append(s.charAt(i));
        }
        return word.toString();
    }
    public String reverseWords(String s) {
        StringBuilder str = new StringBuilder();
        int i=0;
        while(s.indexOf(" ",i)!=-1){
            int idx=s.indexOf(" ",i);
            str.append(revWord(s,i,idx));
            str.append(" ");
            i=idx+1;
        }
        str.append(revWord(s,i,s.length()));
        return str.toString();
    }
}
