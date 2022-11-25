public class TicTacToe {
    public static void main(String[] args) {
        game();
    }

    static void game() {
        Board board = new Board();
        int player = 1;

        System.out.println("Enter a valid value between 1-9\n");

        while (true) {
            System.out.println("Player: " + player + "\n");
            board.printBoard();
            board.placePiece(player);

            if (board.checkWinSimple()) {
                System.out.println("Spiller " + player + " vant!");
                break;
            }
            player = ((player == 1) ? 2 : 1);
        }
        board.printBoard();
    }
}