package herborg.forfun;

import java.util.Scanner;

/**
 * The type Board.
 */
public class Board {

    private char[][] board;
    private char playerMark;

    private static Scanner scan;


    public Board () {
        board = new char[6][6];
        playerMark = 'x';
        makeBoard();
    }

    public void makeBoard() {
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 6; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void printBoard() {
        System.out.println("-------------------------");

        for(int i = 0; i < 6; i++) {
            System.out.print("| ");
            for(int j = 0; j < 6; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
        }
            System.out.println("-------------------------");
    }

    public void placeMark(int row, int col) {
        if((row >= 0) && (row < 6)) {
            if((col >= 0) && (col < 6)) {
                board[row][col] = playerMark;
            }
        }
    }

    public void dropX() {
        System.out.println("Hei");
    }
}
