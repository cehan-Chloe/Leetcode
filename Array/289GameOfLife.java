public class Solution {
    public void gameOfLife(int[][] board) {
        if (board == null || board.length == 0) return;
        int m = board.length;
        int n = board[0].length;
        for (int i = 0; i < m; i ++) {
            for (int j = 0; j < n; j ++) {
                int lives = livesCal(board, m, n, i, j);
                   
                if (board[i][j] == 1 && (lives == 2 || lives == 3)){
                    board[i][j] += 10;
                }
                else if (board[i][j] == 0 && lives == 3){
                    board[i][j] += 10;
                }
            }
        }
        
        for (int i = 0; i < m; i ++){
            for (int j = 0; j < n; j ++){
                board[i][j] /= 10;
            }
        }
    }
    
    public int livesCal(int[][] board, int m, int n, int i, int j){
        int lives = 0;
        for (int x = Math.max(i - 1, 0); x <= Math.min(i + 1, m - 1); x++) {
            for (int y = Math.max(j - 1, 0); y <= Math.min(j + 1, n - 1); y++) {
                lives += (board[x][y] % 10) == 1 ? 1 : 0;
            }
        }
        lives -= board[i][j] & 1;
        return lives;
    }
}