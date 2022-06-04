package tictactoe;

public class TicTacToe {

    private final int [][] board;

    public TicTacToe(final int n){
        board = new int[n][n];
    }


    /**
     * Makes a move and return a winner after if any after making the move
     *
     * @param player is either 0 or 1
     * @param row  is move's row index
     * @param col is move's row index
     * @return +1 if winner is player 1, -1 if winner is palyer 2, or 0 otherwise if no winner decided yet
     */
    public int move(int player, int row, int col) throws IllegalArgumentException{
        if(row < 0 || row >= board.length || col <0 || col>= board.length){
            throw new IllegalArgumentException("invalid cell for making the move");
        }
        if(board[row][col] != 0){
            throw new IllegalArgumentException("cell already occupied");
        }

        return 0;
    }
}
