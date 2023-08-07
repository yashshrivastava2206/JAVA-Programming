/*
You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.
*/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int column=matrix[0].length;
        for(int i=0;i<row;i++){
            if(target<=matrix[i][column-1]){
                int start=0;
                int end=column-1;
                int mid=(start+end/2);
                while(start<=end){
                    if(matrix[i][mid]==target)
                    return true;
                    else if(matrix[i][mid]<target){
                        start=mid+1;
                        mid=(start+end)/2;
                    }
                    else{
                        end=mid-1;
                        mid=(start+end)/2;
                    }
                }
                break;
            }
        }
        return false;
    }
}
