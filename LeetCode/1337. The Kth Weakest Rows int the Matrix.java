/*
You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's (representing civilians). The soldiers are positioned in front of the civilians. That is, all the 1's will appear to the left of all the 0's in each row.

A row i is weaker than a row j if one of the following is true:

The number of soldiers in row i is less than the number of soldiers in row j.
Both rows have the same number of soldiers and i < j.
Return the indices of the k weakest rows in the matrix ordered from weakest to strongest.
*/
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        
        int size=mat.length;
        int colSize=mat[0].length;
        int[][] weak=new int[size][2];
        for(int i=0;i<size;i++){
            int count=0;
            for(int j=0;j<colSize;j++){
                if(mat[i][j]==1)
                count++;
                else
                break;
            }
            weak[i][1]=i;
            weak[i][0]=count;
        }
        Arrays.sort(weak, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        int[] weaks= new int[k];
        for (int i = 0; i < k; ++i) {
            weaks[i] = weak[i][1];
        }
        return weaks;
    }
}
