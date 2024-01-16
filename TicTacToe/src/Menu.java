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
        }
    }

    private static void didRestartGame() {
        while (true) {
            System.out.println("Want to restart the game? y/n");
            try {
                String inputLowerCase = InputUtils.stringInput().toLowerCase();
                if (Objects.equals(inputLowerCase, "y") || Objects.equals(inputLowerCase, "n")) {
                    restartGame(inputLowerCase);
                    break;
                }
            } catch (Exception ignored) {
                System.out.println("Invalid value, please enter either y or n to continue");
            }
        }
    }
}
