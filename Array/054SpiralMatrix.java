public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // for (int m = 0; m < matrix.length / 2; m ++){
        //     res.addAll(oneRound(matrix));
        //     int[][] tmp = new int[matrix.length - 2][];
        //     for (int i = 1, j = 1; i < matrix.length - 1 && j < tmp.length - 1; i++, j++) {
        //         tmp[j] = Arrays.copyOfRange(matrix[i], 1, matrix.length - 1);
        //     }
        // }
        
        List<Integer> res = new ArrayList<Integer>();
        
        // at first runtime error, for []
        if (matrix.length == 0){
            return res;
        }
        
        
        int rowBegin = 0;
        int rowEnd = matrix.length - 1;
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;
        
        while (rowBegin <= rowEnd && colBegin <= colEnd) {

            for (int j = colBegin; j <= colEnd; j ++) {
                res.add(matrix[rowBegin][j]);
            }
            rowBegin++;
            
            for (int j = rowBegin; j <= rowEnd; j ++) {
                res.add(matrix[j][colEnd]);
            }
            colEnd--;
            
            if (rowBegin <= rowEnd) {
                for (int j = colEnd; j >= colBegin; j --) {
                    res.add(matrix[rowEnd][j]);
                }
            }
            rowEnd--;
            
            if (colBegin <= colEnd) {
                for (int j = rowEnd; j >= rowBegin; j --) {
                    res.add(matrix[j][colBegin]);
                }
            }
            colBegin ++;
        }
        
        return res;
    }
}
