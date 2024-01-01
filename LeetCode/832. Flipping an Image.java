/*
Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.

For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

For example, inverting [0,1,1] results in [1,0,0].
*/
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int row = image.length;
        int column = image[0].length;
        for(int i =0 ;i < row ; i++){
            int k=column-1;
            for(int j=0;j<=k;j++,k--){
                if(j==k){
                    image[i][j]=image[i][j]==0?1:0;
                    break;
                }
                
                int temp=image[i][j]==0?1:0;
                image[i][j]=image[i][k]==0?1:0;
                image[i][k]=temp;
            }
        }
        return image;
    }
}
