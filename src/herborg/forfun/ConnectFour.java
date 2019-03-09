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
        System.out.println("Welcome to Connect Four!");
        board.printBoard();
        System.out.println("X is player 1.");
        int col = scan.nextInt() - 1;
        board.dropX(col);
        board.printBoard();


    }
}
