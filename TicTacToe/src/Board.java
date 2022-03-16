import java.util.Scanner;

public class Board {
    private final String[] fieldList = {" ", " ", " ", " ", " ", " ", " ", " ", " "};

    public void printBoard() {
        System.out.println("[" + fieldList[0] + "]" + "[" + fieldList[1] + "]" + "[" + fieldList[2] + "]\n" +
                "[" + fieldList[3] + "]" + "[" + fieldList[4] + "]" + "[" + fieldList[5] + "]\n" +
                "[" + fieldList[6] + "]" + "[" + fieldList[7] + "]" + "[" + fieldList[8] + "]\n");
    }

    public void placePiece(int player) {
        Scanner in = new Scanner(System.in);
        int userInput = Integer.parseInt(in.nextLine());

        String playerSelector;

        if (player != 0) {
            playerSelector = "x";
        } else {
            playerSelector = "o";
        }

        switch (userInput) {
            case 1 -> fieldList[0] = playerSelector;
            case 2 -> fieldList[1] = playerSelector;
            case 3 -> fieldList[2] = playerSelector;
            case 4 -> fieldList[3] = playerSelector;
            case 5 -> fieldList[4] = playerSelector;
            case 6 -> fieldList[5] = playerSelector;
            case 7 -> fieldList[6] = playerSelector;
            case 8 -> fieldList[7] = playerSelector;
            case 9 -> fieldList[8] = playerSelector;
            default -> System.out.println("U cheeky blud, numbers only");
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
