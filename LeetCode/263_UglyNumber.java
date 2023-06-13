/*
An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.

Given an integer n, return true if n is an ugly number.
*/
class Solution {
    public boolean isUgly(int n) {
        if(n==0)return false;

        while(n%5==0)
        {
            n=n/5;
        }

        while(n%3==0)
        {
            n=n/3;
        }

        while(n%2==0)
        {
            n=n/2;
        }

        if(n==1)return true;
        else return false;
    }
}263
