package com.tic_tac_toe;

import java.util.Scanner;

public class Game {
    private Board board;
    private Player player1;
    private Player player2;
    private Player currentPlayer;

    public Game(Player player1, Player player2) {
        this.board = new Board();
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        boolean gameWon = false;

        while (!board.isBoardFull() && !gameWon) {
            board.showBoard();
            System.out.println(currentPlayer.getName() + " (" + currentPlayer.getSymbol() + "), enter your move (row and column): ");
            System.out.println();
            int row = scanner.nextInt();
            int col = scanner.nextInt();


            if (board.makeMove(row, col, currentPlayer.getSymbol())) {
                gameWon = board.checkWinner(currentPlayer.getSymbol());
                if (gameWon) {
                    System.out.println(currentPlayer.getName() + " wins!");
                } else {
                    currentPlayer = (currentPlayer == player1) ? player2 : player1;
                }
            } else {
                System.out.println("This move is not valid");
            }
            System.out.println();
        }

        if (!gameWon) {
            System.out.println("The game is a tie!");
            
        }

        board.showBoard();
        scanner.close();
    }
}
