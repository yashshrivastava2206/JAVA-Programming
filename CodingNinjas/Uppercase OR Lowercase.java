/*

*/
public class Solution {
    
    static String uppercaseORLowercase(int n, String s) {
        int countUpr=0;
        int countLwr=0;
        for(int i=0;i<n;i++){
            if(Character.isUpperCase(s.charAt(i))){
                countUpr++;
            }
            else countLwr++;
        }
        if(countLwr>=countUpr)
        return s.toLowerCase();
        return s.toUpperCase();
        
    }
}
