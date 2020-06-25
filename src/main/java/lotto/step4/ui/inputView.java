package lotto.step4.ui;

import java.util.Scanner;

public class inputView {
    private static Scanner scanner;
    public static int getCashAmount() {
        scanner = new Scanner(System.in);
        System.out.println("구입금액을 입력해 주세요.");
        return scanner.nextInt();
    }
}
