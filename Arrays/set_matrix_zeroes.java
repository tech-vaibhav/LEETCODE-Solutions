// https://leetcode.com/problems/set-matrix-zeroes/description/
// Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

// You must do it in place.
// ___________________________________________________________________________________________________________:)

class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firstRow=false;
        boolean firstCol=false;

        // set marking for T or F
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==0){
                    if(i==0) firstRow=true;
                    if(j==0) firstCol=true;
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }

        // set 0 for inner matrix
        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[0].length; j++){
                if(matrix[i][0]==0||matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }

        // last remaining checks

        if(firstRow){
            for(int j=0; j<matrix[0].length;j++){
                matrix[0][j]=0;
            }
        }
        if(firstCol){
            for(int i=0; i<matrix.length; i++){
                matrix[i][0]=0;
            }
        }
    }
}
