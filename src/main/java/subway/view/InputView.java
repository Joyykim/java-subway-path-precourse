package subway.view;

import java.util.Scanner;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in);

    public static String getInputString() {
        return scanner.nextLine();
    }
}