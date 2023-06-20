/*
Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.
*/
class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> ans= new ArrayList<String>();
        
        int i=1;
        while(i<=n){
            if(i%3==0){
                if(i%5==0){
                    ans.add("FizzBuzz");
                    i++;
                    continue;
                }
                
                ans.add("Fizz");
                i++;
                
            }
            else if(i%5==0){
                
                ans.add("Buzz");
                i++;
                continue;
            }
            else{
                ans.add(Integer.toString(i));
                i++;
            }
        }
        return ans;
    }
}412_FizzBuzz.java
