package lotto.step2.ui;

import java.util.Arrays;

public class resultView {
    public static void amountOfTicketsBought(int ticketAmount) {
        System.out.println(ticketAmount+ "개를 구매했습니다.");
    }

    public static void showTickets(int[][] randomNumbersOfArray) {
        for(int[] array: randomNumbersOfArray ){
            System.out.println(Arrays.toString(array));
        }
        System.out.println();
    }
}
