/*
Practice test - Weekend Contest -101 
*/
import java.util.Arrays;
public class Solution {
    static int countSequences(int n, int []a) {
        int[] count = new int[n];
        Arrays.sort(a);
        Arrays.fill(count,0);
        count[0]=-1;
        int cnt = 1;
        for(int i=0;i<n;i++){
            int num = a[i];
            if(count[i]==0)
            cnt++;
            for(int j=i+1;j<n;j++){
                if(count[j]==0 && a[j]%num==0){
                    count[j]=-1;
                }
            }
            int k=0;
            for(k=0;k<n;k++){
                
                if(count[k]==0){
                    
                 break;   
                }
                
            }
            if(k==n) return cnt;
        }
        return cnt;
    }
}
