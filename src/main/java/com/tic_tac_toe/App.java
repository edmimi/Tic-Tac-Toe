package com.tic_tac_toe;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "¡Bienvenidos a Tic Tac Toe!" );

        GameBoard gameBoard = new GameBoard();
        gameBoard.showBoard();
    }
}
