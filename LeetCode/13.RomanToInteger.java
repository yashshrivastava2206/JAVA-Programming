class Solution {
    public int romanToInt(String s) {
        int ans = 0, sum = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            char ch=s.charAt(i);
            sum=switch(ch) {
                case 'I'-> 1;
                case 'V'->5; 
                case 'X'->10;
                case 'L'->50; 
                case 'C'->100; 
                case 'D'->500; 
                case 'M'->1000;
                default->-1;
            };
            if (4 * sum < ans) ans -= sum;
            else ans += sum;
        }
        return ans;
    }
}
