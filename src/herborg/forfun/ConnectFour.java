package herborg.forfun;

import java.util.Scanner;

/**
 * The type Connect Four
 */
public class ConnectFour {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        Board board = new Board();
        board.printBoard();
        int row = scan.nextInt() - 1;
        int col = scan.nextInt() - 1;
        board.placeMark(row,col);
        board.printBoard();

    }
}
