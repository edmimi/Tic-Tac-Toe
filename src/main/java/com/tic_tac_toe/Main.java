package com.tic_tac_toe;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Game turn :", 'X');
        Player player2 = new Player("Game turn :", 'O');
        Game game = new Game(player1, player2);
        game.play();
    }
}