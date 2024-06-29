class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] mat = new int[n][m];

        for(int i = 0 ; i < n ; i++ ) {
            for(int j = 0 ; j < m; j++){
                mat[i][j] = matrix[i][j];
            }
        }

        for(int i = 0 ; i < n ; i++ ) {
            for(int j = 0 ; j < m; j++){
                matrix[i][j] = mat[n-j-1][i];
            }
        }
    }
}


/*
Runtime 0ms
Memory  42.09MB
 */