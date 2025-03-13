package com.tic_tac_toe;

public class GameBoard {

    private char[][] board;

    public GameBoard() {
        board = new char[3][3];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '_';
            }
        }
    }   

    public void printBoard() {
        

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public boolean makeMove(int row, int col, char player) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-') {
            board[row][col] = player;
            return true;
        }
        return false;
    }

    public boolean playerWins(char player) {
        for ( int i = 0; i < 3; i++ ) {
            if (( board[i][0] == player && board[i][1] == player && board[i][2] == player ) ||
               ( board[0][i] == player && board[1][i] == player && board[2][i] == player )) {
                return true;
            }
        }
        return ( board[0][0] == player && board[1][1] == player && board[2][2] == player ) ||
               ( board[0][2] == player && board[1][1] == player && board[2][0] == player );
    }

    public boolean isFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

}