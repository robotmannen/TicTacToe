public class TicTacToe {
    public static void main(String[] args) {
        game();
    }

    static void game() {
        Board board = new Board();

        int player = 1;

        while (!board.checkWinSimple()) {
            board.printBoard();
            board.placePiece(player % 2);
            board.checkWinSimple();
            player++;
        }
        board.printBoard();
        System.out.println("Spiller " + (player % 2 + 1) + " vant!");
    }
}