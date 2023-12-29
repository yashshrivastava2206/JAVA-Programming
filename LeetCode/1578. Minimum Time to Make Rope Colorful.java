/*
Alice has n balloons arranged on a rope. You are given a 0-indexed string colors where colors[i] is the color of the ith balloon.

Alice wants the rope to be colorful. She does not want two consecutive balloons to be of the same color, 
so she asks Bob for help. Bob can remove some balloons from the rope to make it colorful. 
You are given a 0-indexed integer array neededTime where neededTime[i] is the time (in seconds) that Bob needs to remove the ith balloon from the rope.

Return the minimum time Bob needs to make the rope colorful.
*/
class Solution {
    public static int minValue(int start,int end,int[] time){
        if((end-start)==1) return 0;
        int sum =time[start];
        int max = time[start++];
        
        while(start<end){
            sum+=time[start];
            if(max<time[start])
            max=time[start];
            start++;
        }
        return sum-max;
    }
    
    public int minCost(String colors, int[] neededTime) {
        int idx=0,sum=0,size=colors.length();
        while(idx<size){
            int next=idx+1;
            while(next<size){
                if(colors.charAt(idx)!= colors.charAt(next)) break;
                next++;
                
            }
            
            sum+=minValue(idx,next,neededTime);
            idx=next;
        } 
        return sum;
    }
}
