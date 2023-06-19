/*
You have a long flowerbed in which some of the plots are planted, and some are not. However, 
flowers cannot be planted in adjacent plots.

Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, 
and an integer n, return true if n new 
flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
*/
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int size=flowerbed.length;
        if(size==1 && flowerbed[0]==0)
        return true;
        if(size==2){
            if(flowerbed[0]==0 && flowerbed[1]==0){
            --n;
            }
        }
        for(int i=1;i<size-1 && n!=0;i++){
            if((flowerbed[0]==0 && flowerbed[1]==0)){
                System.out.println("*");
                flowerbed[0]=1;
                --n;
                
                continue;
            }
            
            if(flowerbed[i-1]==0 && flowerbed[i]==0 && flowerbed[i+1]==0){
                flowerbed[i]=1;
                --n;
                i++;
                continue;
            }
        }
        if(size>=3 && n>0){
            if(flowerbed[size-2]==0 && flowerbed[size-1]==0)
            --n;
        }
        
        if(n!=0)
        return false;
        else
        return true;
    }
}605
