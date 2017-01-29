public class Solution {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        for (int i = 0; i < len; i ++){
            for (int j = i; j < len; j ++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        
        for (int m = 0; m < len; m ++){
            for (int n = 0; n < len/2; n ++){
                int tmp = matrix[m][n];
                matrix[m][n] = matrix[m][len - 1 - n];
                matrix[m][len - 1 - n] = tmp;
            }
        }
    }
}
