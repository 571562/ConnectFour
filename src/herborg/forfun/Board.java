package herborg.forfun;

import java.util.Scanner;

/**
 * The type Board.
 */
public class Board {

    private char[][] board;
    private char playerMark;
    private final static int COLUMN = 6;
    private final static int ROW = 6;
    private final static int BOTTOM_ROW = 5;

    private static Scanner scan;


    public Board () {
        board = new char[ROW][COLUMN];
        playerMark = 'x';
        makeBoard();
    }

    public void makeBoard() {
        for(int i = 0; i < COLUMN; i++) {
            for(int j = 0; j < ROW; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void printBoard() {
        System.out.println("-------------------------");

        for(int i = 0; i < COLUMN; i++) {
            System.out.print("| ");
            for(int j = 0; j < ROW; j++) {
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

    public void dropX(int column) {
        int counter = 1;

        System.out.println("Player x.");

        while(true) {
            if(board[BOTTOM_ROW][column] == '-') {
                board[BOTTOM_ROW][column] = 'x';
                break;
            } else if (board[BOTTOM_ROW][column] == 'x' || board[BOTTOM_ROW][column] =='o') {
                if(board[BOTTOM_ROW - counter][column] == '-') {
                    board[BOTTOM_ROW - counter][column] = 'x';
                    break;
                }
            }
            counter++;
            if(counter == ROW) {
                System.out.println("Column is full.");
                break;
            }
        }
    }

    public void dropO(int column) {
        int counter = 1;

        System.out.println("Player o.");

        while(true) {
            if(board[BOTTOM_ROW][column] == '-') {
                board[BOTTOM_ROW][column] = 'o';
                break;
            } else if (board[BOTTOM_ROW][column] == 'o' || board[BOTTOM_ROW][column] =='x') {
                if(board[BOTTOM_ROW - counter][column] == '-') {
                    board[BOTTOM_ROW - counter][column] = 'o';
                    break;
                }
            }
            counter++;
            if(counter == ROW) {
                System.out.println("Column is full.");
                break;
            }
        }
    }
}
