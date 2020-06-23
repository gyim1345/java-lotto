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

    public static void showStatistics(int[] statistics, int[] prizeStatistics) {
        int matchedNumber = 3;
        for(int i = 0; i<prizeStatistics.length; i++) {
            matchedNumber = printMatchingText(statistics, prizeStatistics, matchedNumber, i);
        }
    }

    private static int printMatchingText(int[] statistics, int[] prizeStatistics, int matchedNumber, int i) {
        if(i == 3) {
            System.out.println(matchedNumber-1+"개 일치,보너스 볼 일치 (" + prizeStatistics[i] + ")- " +statistics[i] +"개");
            return matchedNumber;
        }
        System.out.println(matchedNumber+"개 일치 (" + prizeStatistics[i] + ")- " +statistics[i] +"개");
        matchedNumber += 1;
        return matchedNumber;
    }

    public static void showProfitStatistics(double profitPercentage, boolean profited) {
        String profit = profited ? "이득" : "손해";
        System.out.println("총 수익률은 " + profitPercentage + "입니다.(기준이 1이기 때문에 결과적으로 "+profit+ "라는 의미임)");
    }
}
