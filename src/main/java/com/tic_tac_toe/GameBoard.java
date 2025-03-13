package com.tic_tac_toe;

public class GameBoard {
    
    private char[][] board;

    public GameBoard(){

        board = new char[3][3];
        initializeBoard();
    }
    
    private void initializeBoard(){
         for (int i=0;i<3; i++){
            for (int j=0; j<3; j++){
                board[i][j] = '-';
            }
         }
    }

    public void showBoard() { 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// i para el índice de la fila.
//j para el índice de la columna.
//initializeBoard() = Limpiar y preparar el tablero antes de empezar.
//Bucle doble = Recorre filas y columnas.
//board[i][j] = '-' = Marca cada casilla como vacía.
//Esto es un método privado.
//"Privado" significa que solo lo puede usar esta misma clase (GameBoard), no desde fuera.
// void significa que no devuelve nada. Solo hace algo (inicializar el tablero) y ya está.