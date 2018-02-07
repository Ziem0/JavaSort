import java.util.Scanner;

public class Command {

    private static int userChoice;
    private static Scanner in = new Scanner(System.in);

    public static int getNumber() {
        userChoice = in.nextInt();
        return userChoice;
    }

    public static void getOptions() {
        System.out.println("\n\n1. 50.000\n" +
                "2. 1.000\n" +
                "3. 1.000.000\n");
    }
}
