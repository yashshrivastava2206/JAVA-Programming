/*
The array-form of an integer num is an array representing its digits in left to right order.

For example, for num = 1321, the array form is [1,3,2,1].
Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.
*/
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list =new ArrayList<Integer>();
        int size=num.length;
        
        int i=0;
        int carry=k;
        for(i=size-1;i>=0;i--){
            int sum=0;
            if(carry>0){
                sum=num[i]+carry%10;
            }else{
                sum=num[i]+carry;
                
            }
            list.add(0,sum%10);
                if(sum>9)
                carry=carry/10+1;
                else
                carry=carry/10;
        }
        while(carry>0){
                list.add(0,carry%10);
                carry=carry/10;
        }
        return list;
    }
}
