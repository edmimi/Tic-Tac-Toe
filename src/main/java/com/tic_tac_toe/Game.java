package com.tic_tac_toe;

import java.util.Scanner;

public class Game {
    private Board board;
    private Player player1;
    private Player player2;
    private Player currentPlayer;

    public static final String RED = "\033[31m";
    public static final String RESET = "\033[0m";
    public static final String GREEN = "\033[32m";
    public static final String YELLOW = "\033[33m";

    public Game(Player player1, Player player2) {
        this.board = new Board();
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        boolean gameWon = false;

        System.out.println("\n");

        while (!board.isBoardFull() && !gameWon) {
            board.showBoard();
            System.out.println(currentPlayer.getName() + " (" + currentPlayer.getSymbol() + "), enter your move (row and column): ");
            System.out.print("Row : ");
            int row = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Column : "); 
            int col = scanner.nextInt();
            scanner.nextLine();
            


            if (board.makeMove(row, col, currentPlayer.getSymbol())) {
                gameWon = board.checkWinner(currentPlayer.getSymbol());
                if (gameWon) {
                    System.out.println(GREEN  + currentPlayer.getName() + " wins!" + RESET);
                    printVictoryArt();
                } else {
                    currentPlayer = (currentPlayer == player1) ? player2 : player1;
                }
            } else {
                System.out.println(RED + "This move is not valid , try again! " + RESET);
            }
            System.out.println();
        }

        if (!gameWon) {
            System.out.println(YELLOW + "The game is a tie!" + RESET);
            System.out.println();
            printShrugArt();
            
        }
        System.out.println();
        board.showBoard();
        scanner.close();
    }

    private void printVictoryArt() {
        System.out.println("      \\O/   ");
        System.out.println("       |    ");
        System.out.println("      / \\  ");
        System.out.println("Victory Dance! ");
    }

    private void printShrugArt() {
        System.out.println(" ¯\\_(ツ)_/¯ ");
    }
}

