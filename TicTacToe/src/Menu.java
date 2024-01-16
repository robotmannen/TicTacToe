import java.util.Objects;

public class Menu {

    static TicTacToe game = new TicTacToe();

    public static void runGame() {
        game.runApp();
        didRestartGame();
    }

    private static void restartGame(String input) {
        if (Objects.equals(input, "y")) {
            game = new TicTacToe();
            runGame();
        } else {
            System.out.println("GG!");
        }
    }

    private static void didRestartGame() {
        System.out.println("Want to restart the game? y/n");
        while (true) {
            String inputLowerCase = InputUtils.stringInput().toLowerCase();

            if (Objects.equals(inputLowerCase, "y") || Objects.equals(inputLowerCase, "n")) {
                restartGame(inputLowerCase);
                break;
            } else {
                System.out.println("Invalid value, please enter either y or n to continue");
            }
        }
    }
}
