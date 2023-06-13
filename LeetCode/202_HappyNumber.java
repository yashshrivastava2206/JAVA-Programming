/*
Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.
*/
class Solution {
    public boolean isHappy(int n) {
        int sum=0,count=0;
        while(n!=1){
            count++;
            while(n>0){
                int rem =n%10;
                sum+=rem*rem;
                n=n/10;
            }

            n=sum;
            sum=0;
            if(count==10)
            return false;
        }
        return true;
    }
}
