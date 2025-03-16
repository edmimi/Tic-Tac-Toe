package com.tic_tac_toe;

public class Board {
    
    private char[][] board;

    public Board() {
        printInstructions();
        board = new char[3][3];
        
        initializeBoard();
    }
    
    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void printInstructions() {
        System.out.println("\u001B[36mWelcome to TIC-TAC-TOE!\u001B[0m");
        System.out.println();
        System.out.println("How to Play:");
        System.out.println("- Players take turns choosing a row and a column to place their mark (X or O).");
        System.out.println("- The first to get three in a row, column, or diagonal wins!");
        System.out.println("- If the board is full and no one wins, it's a tie.");
        System.out.println("- Enter row and column as numbers from 0 to 2.");
        System.out.println();
    }

    public void showBoard() { 
        String margin = "         ";
        for (int i = 0; i < 3; i++) {
            System.out.print(margin);
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
            System.out.println();
        }
        System.out.println();
    }

    public boolean makeMove(int row, int col, char player) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-') {
            board[row][col] = player;
            return true;
        }
        return false;
    }

    public boolean checkWinner(char player) {
    
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }
        
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
            (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }
        return false;
    }

    public boolean isBoardFull() {
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