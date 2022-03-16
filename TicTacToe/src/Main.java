import java.io.IOException;

public class Main {
        String[] fields = {" ", " ", " ", " ", " ", " ", " ", " ", " ",};
    public static void main(String[] args) throws IOException {
        Main fields = new Main();

        printBoard(fields.fields);
        placePiece(fields.fields);
        printBoard(fields.fields);
    }

    static void printBoard(String[] fields) {

        System.out.println("[" + fields[0] + "]" + "[" + fields[1] + "]" + "[" + fields[2] + "]\n" +
                "[" + fields[3] + "]" + "[" + fields[4] + "]" + "[" + fields[5] + "]\n" +
                "[" + fields[6] + "]" + "[" + fields[7] + "]" + "[" + fields[8] + "]\n");

    }

    static void placePiece(String[] fields) throws IOException {


        int userInput;
        userInput = System.in.read();
        if (userInput == 0) {
            fields[0] = "x";
        } else if (userInput == 1) {

        } else if (userInput == 2) {

        } else if (userInput == 3) {

        } else if (userInput == 4) {

        } else if (userInput == 5) {

        } else if (userInput == 6) {

        } else if (userInput == 7) {

        } else if (userInput == 8) {

        }
    }
}
