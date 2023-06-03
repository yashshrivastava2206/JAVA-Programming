/*
Given a square matrix mat, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal
*/
class Solution {
    public int diagonalSum(int[][] mat) {
        //square matrix so the size of row and column is same
        int size=mat.length;
        int result=0;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(i==j || j+i==(size-1))
                result+=mat[i][j];
            }
        }
    return result;
    }
}
