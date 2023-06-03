/*
Given a 2D integer array matrix, return the transpose of matrix.

The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices
*/
class Solution {
    public int[][] transpose(int[][] matrix) {
        int row=matrix.length;
        int column=matrix[0].length;
        int[][] transpose= new int[column][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++)
            transpose[j][i]=matrix[i][j];
        }
        return transpose;
    }
}
