/*
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1.
If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.
*/
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int size1=word1.length();
        int size2=word2.length();
        if(size1==0 || size2==0)
        return word1+word2;
        int i=0;
        StringBuilder str= new StringBuilder();
        while(i<size1 && i<size2){
            
            str.append(word1.charAt(i));
            str.append(word2.charAt(i));
            i++;
        }
        while(i<size1){
            str.append(word1.charAt(i));
            i++;
        }
        while(i<size2){
            str.append(word2.charAt(i));
            i++;
        }
        return str.toString();
    }
}1768.
