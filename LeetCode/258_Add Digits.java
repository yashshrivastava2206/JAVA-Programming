class Solution {
    public int addDigits(int num) {
        int sum,rem;
        while(num>=10){
            sum=0;
            while(num>0){
                rem=num%10;
                sum=sum+rem;
                num=num/10;
            }
            num=sum;
        } 
        return num;  
    }
}
