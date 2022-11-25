import java.util.Scanner;

public class Board {
    private final String[] fieldList = {" ", " ", " ", " ", " ", " ", " ", " ", " "};

    public void printBoard() {
        System.out.println("[" + fieldList[0] + "]" + "[" + fieldList[1] + "]" + "[" + fieldList[2] + "]\n" +
                "[" + fieldList[3] + "]" + "[" + fieldList[4] + "]" + "[" + fieldList[5] + "]\n" +
                "[" + fieldList[6] + "]" + "[" + fieldList[7] + "]" + "[" + fieldList[8] + "]\n");
    }

    public void placePiece(int player) {
        String playerSelector;
        Scanner in;
        int playerInput;

        playerSelector = ((player == 1) ? "x" : "o");

        while (true) {
            try {
                in = new Scanner(System.in);
                playerInput = Integer.parseInt(in.nextLine());
                fieldList[playerInput - 1] = playerSelector;
            } catch (Exception e) {
                System.out.println("Enter a valid value between 1-9");
                continue;
            }
            break;
        }
    }

    public boolean checkWinSimple() {
        boolean winner = false;

        if ((fieldList[0] + fieldList[1] + fieldList[2]).equals("xxx") || (fieldList[0] + fieldList[1] + fieldList[2]).equals("ooo")) {
            winner = true;
        } else if ((fieldList[3] + fieldList[4] + fieldList[5]).equals("xxx") || (fieldList[3] + fieldList[4] + fieldList[5]).equals("ooo")) {
            winner = true;
        } else if ((fieldList[6] + fieldList[7] + fieldList[8]).equals("xxx") || (fieldList[6] + fieldList[7] + fieldList[8]).equals("ooo")) {
            winner = true;
        } else if ((fieldList[0] + fieldList[3] + fieldList[6]).equals("xxx") || (fieldList[0] + fieldList[3] + fieldList[6]).equals("ooo")) {
            winner = true;
        } else if ((fieldList[1] + fieldList[4] + fieldList[7]).equals("xxx") || (fieldList[1] + fieldList[4] + fieldList[7]).equals("ooo")) {
            winner = true;
        } else if ((fieldList[2] + fieldList[5] + fieldList[8]).equals("xxx") || (fieldList[2] + fieldList[5] + fieldList[8]).equals("ooo")) {
            winner = true;
        } else if ((fieldList[0] + fieldList[4] + fieldList[8]).equals("xxx") || (fieldList[0] + fieldList[4] + fieldList[8]).equals("ooo")) {
            winner = true;
        } else if ((fieldList[2] + fieldList[4] + fieldList[6]).equals("xxx") || (fieldList[2] + fieldList[4] + fieldList[6]).equals("ooo")) {
            winner = true;
        }
        return winner;
    }
}
