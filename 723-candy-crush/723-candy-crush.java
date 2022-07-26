class Solution {
    public int[][] candyCrush(int[][] board) {
        boolean done = true;
        //CRUSH HORIZONTALLY
        for(int r = 0; r < board.length; r++) {
            for(int c = 0; c < board[r].length - 2; c++) {
                int num1 = Math.abs(board[r][c]);
                int num2 = Math.abs(board[r][c+1]);
                int num3 = Math.abs(board[r][c+2]);
                
                if(num1 == num2 && num2 == num3 && num1 != 0) {
                    board[r][c] = -num1;
                    board[r][c+1] = -num2;
                    board[r][c+2] = -num3;
                    done = false;

                }
            }
        }
        
        //CRUSH VERTICALLY
        for(int c = 0; c < board[0].length; c++) {
            for(int r = 0; r < board.length-2; r++) {
                int num1 = Math.abs(board[r][c]);
                int num2 = Math.abs(board[r+1][c]);
                int num3 = Math.abs(board[r+2][c]);
                
                if(num1 == num2 && num2 == num3 && num1 != 0) {
                    board[r][c] = -num1;
                    board[r+1][c] = -num2;
                    board[r+2][c] = -num3;
                    done = false;
                }
            }
        }
        
        //GRAVITY
        if(!done) {
            for(int c = 0; c < board[0].length; c++) {
                int index = board.length - 1;
                for(int r = board.length - 1; r >= 0; r--) {
                    if(board[r][c] > 0) {
                        board[index][c] = board[r][c];
                        index--;
                    }
                }

                for(int r = index; r >= 0; r--) {
                    board[r][c] = 0;
                }
            }
        }  
        
        if(done) {
            return board;
        }
        else {
            return candyCrush(board);
        }
    }
}