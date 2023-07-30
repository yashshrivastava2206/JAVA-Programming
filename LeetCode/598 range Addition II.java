/*
You are given an m x n matrix M initialized with all 0's and an array of operations ops, where ops[i] = [ai, bi] means M[x][y] should be incremented by one for all 0 <= x < ai and 0 <= y < bi.

Count and return the number of maximum integers in the matrix after performing all the operations.
*/
class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        if(ops.length==0)
        return m*n;
        else if(ops.length==1)
        return ops[0][0]*ops[0][1];
        int row,column;
        row=column=Integer.MAX_VALUE;
        for(int i=0;i<ops.length;i++){
            if(ops[i][0]<row)
            row = ops[i][0];
            if(ops[i][1]<column)
            column = ops[i][1];
            
        }
       
        return row*column;
    }
}
