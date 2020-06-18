package lotto.step2.ui;

import java.util.Scanner;

public class inputView {
    private static Scanner scanner = new Scanner(System.in);
    public static int getCashAmount() {
        System.out.println("구입금액을 입력해 주세요.");
        return scanner.nextInt();
    }
}
