import java.util.Objects;

public class TicTacToe {

    private final String[] boardList = {" ", " ", " ", " ", " ", " ", " ", " ", " "};
    private int player = 1;
    private int playerInput;
    private int roundNumber = 1;

    private String getPlayerChip() {
        return ((player == 1) ? "x" : "o");
    }

    private String getBoardListElement(int index) {
        return this.boardList[index - 1];
    }

    private void setPlayer() {
        this.player = ((player == 1) ? 2 : 1);
    }

    private void setBoardMarker(int index, String input) {
        this.boardList[index - 1] = input;
    }

    public void runApp() {
        System.out.println("Enter a valid value between 1-9\n");

        while (true) {
            printBoardAndPlayer();
            placePiece();

            if (checkWin()) {
                System.out.println("Player " + player + " won!");
                return;
            }

            if (checkStalemate(roundNumber)) {
                System.out.println("Stalemate! nobody wins ...");
                return;
            }
            setPlayer();
            incrementRoundNumber();
        }
    }

    private void printBoardAndPlayer() {
        System.out.println("Player: " + player + "\n" +
                "[" + boardList[0] + "]" + "[" + boardList[1] + "]" + "[" + boardList[2] + "]\n" +
                "[" + boardList[3] + "]" + "[" + boardList[4] + "]" + "[" + boardList[5] + "]\n" +
                "[" + boardList[6] + "]" + "[" + boardList[7] + "]" + "[" + boardList[8] + "]\n");
    }

    private boolean setPlayerInput() {
        while (true) {
            try {
                this.playerInput = InputUtils.intInput();
                if (!isTileEmpty(playerInput)) {
                    System.out.println("Tile is already selected, choose another");
                    printBoardAndPlayer();
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Enter a valid value between 1-9");
                printBoardAndPlayer();
            }
        }
        return true;
    }

    private void placePiece() {
        if (setPlayerInput()) {
            setBoardMarker(playerInput, getPlayerChip());
        }
    }

    private void incrementRoundNumber() {
        this.roundNumber++;
    }

    private boolean isTileEmpty(int input) {
        return Objects.equals(getBoardListElement(input), " ");
    }

    private boolean checkWin() {
        for (int i = 0; i <= 2; i += 2) {
            if (Objects.equals(boardList[i], boardList[8 - i]) &&
                Objects.equals(boardList[i], boardList[4]) &&
                !Objects.equals(boardList[i], " ")
            ) {
                return true;
            }
        }

        for (int i = 0; i <= 6; i += 3) {
            if (Objects.equals(boardList[i], boardList[i + 1]) &&
                Objects.equals(boardList[i], boardList[i + 2]) &&
                !Objects.equals(boardList[i], " ")
            ) {
                return true;
            }
        }
    return false;
    }

    private boolean checkStalemate(int roundNumber) {
        return roundNumber == 9;
    }
}