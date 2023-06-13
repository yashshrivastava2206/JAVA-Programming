/*
Given a m x n matrix grid which is sorted in non-increasing order
both row-wise and column-wise, return the number of negative numbers in grid.

 
*/
class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        int row=grid.length;
        if(row==0)
        return 0;
        int col=grid[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]<0){
                    count+=(col-j);
                    break;
                }
            }
        }
        return count;
    }
}
