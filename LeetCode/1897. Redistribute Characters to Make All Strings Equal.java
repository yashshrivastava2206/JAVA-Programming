/*
You are given an array of strings words (0-indexed).

In one operation, pick two distinct indices i and j, where words[i] is a non-empty string, and move any character from words[i] to any position in words[j].

Return true if you can make every string in words equal using any number of operations, and false otherwise.
*/
class Solution {
    public boolean makeEqual(String[] words) {
        HashMap<Character,Integer> map = new HashMap<>();
        int size = words.length;
        for(int i =0;i<size;i++){
            int j =0;
            while(j<words[i].length()){
                map.put(words[i].charAt(j),map.getOrDefault(words[i].charAt(j),0)+1);
                j++;
            }
        }
         for (Map.Entry<Character, Integer> e : map.entrySet()){
             if(!(e.getValue()%size==0))
             return false;
         }
        return true;
    }
}
