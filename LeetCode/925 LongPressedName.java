/*
Your friend is typing his name into a keyboard. Sometimes, when typing a character c, the key might get long pressed, and the character will be typed 1 or more times.

You examine the typed characters of the keyboard. Return True if it is possible that it was your friends name, with some characters (possibly none) being long pressed.
*/
class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if(name.length()>typed.length())
        return false;
        int i=0,j=0,k;
        char ch=name.charAt(0);
        while(i<name.length()){
            while(j<typed.length()){
                if(typed.charAt(j)!=name.charAt(i) && typed.charAt(j)!=ch)
                return false;
                else if(typed.charAt(j)==name.charAt(i))
                break;
                j++;
            }
            if(j==typed.length())
            return false;
            j++;
            ch=name.charAt(i);
            i++;
        }
        while(j<typed.length()){
            if(name.charAt(i-1)!=typed.charAt(j))
            return false;
            j++;
        }
        return true;
    }
}
