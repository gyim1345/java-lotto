package lotto.step4;

import java.util.Scanner;

public class InputView {
    private static Scanner scanner;

    public static int getCashAmount() {
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
