import java.util.Scanner;

public class InputUtils {
    public static int intInput() {
        Scanner in = new Scanner(System.in);
        return Integer.parseInt(in.nextLine());
    }

    public static String stringInput() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}
