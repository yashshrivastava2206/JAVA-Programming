/*
You are given a 0-indexed m x n binary matrix grid.

A 0-indexed m x n difference matrix diff is created with the following procedure:

Let the number of ones in the ith row be onesRowi.
Let the number of ones in the jth column be onesColj.
Let the number of zeros in the ith row be zerosRowi.
Let the number of zeros in the jth column be zerosColj.
diff[i][j] = onesRowi + onesColj - zerosRowi - zerosColj
Return the difference matrix diff.
*/
class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int len= grid.length;
        int col=grid[0].length;
        int[] rows = new int[len];
        for(int i = 0 ; i < len ; i++){
            int ones=0;
            for (int j =0;j<col ;j++){
                if(grid[i][j]==1)
                ones++;
            }
            rows[i]=ones;
        }
        int[] columns = new int[col];
        for(int i = 0 ; i < col ; i++){
            int ones=0;
            for (int j =0;j<len ;j++){
                if(grid[j][i]==1)
                ones++;
            }
            columns[i]=ones;
        }
        int[][] ans = new int[len][col];

        for(int i=0;i<len;i++){

            for(int j=0;j<col;j++){
                ans[i][j]= rows[i]+columns[j] -(col-columns[j]) -(len-rows[i]) ;
            }
        }
        return ans;
    }
}
