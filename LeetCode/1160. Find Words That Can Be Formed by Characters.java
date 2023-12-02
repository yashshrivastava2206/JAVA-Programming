/*
You are given an array of strings words and a string chars.

A string is good if it can be formed by characters from chars (each character can only be used once).

Return the sum of lengths of all good strings in words.
*/
class Solution {
    public int countCharacters(String[] words, String chars) {
        int result = 0;
        for(String word : words){
            StringBuffer str = new StringBuffer(chars);
            boolean isSame = true;
            for(int i=0;i<word.length();i++){
                int idx;
                if((idx=str.indexOf(word.charAt(i)+""))==-1){
                    isSame = false;
                    break;
                }
                str.delete(idx,idx+1);
                
            }
            if(isSame)
            result +=word.length();
        }
        return result;
    }
}
