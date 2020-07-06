package lotto.step4;

import java.util.Arrays;

public class LottoService {

    public static int[] getProfits(int[][] lottoTickets, int[] lastWeekLottoPrizeNumber) {
        int[] rewards = {0, 0, 0, 5000, 50000, 1500000, 30000000, 2000000000};
        int[] profits = new int[lottoTickets.length];
        int [] totalMatchCounts = getTotalMatchCounts(lottoTickets, lastWeekLottoPrizeNumber);

        int index = 0;
        for(int matchCounts: totalMatchCounts) {
            profits[index] = rewards[matchCounts];
            index += 1;
        }

        return profits;
    }

    static int[] getTotalMatchCounts(int[][] lottoTickets, int[] lastWeekLottoPrizeNumber) {
        int [] totalMatchCounts = new int[lottoTickets.length];
        int index = 0;
        for(int [] ticket: lottoTickets) {
            totalMatchCounts[index] = getTotalMatchCount(ticket, lastWeekLottoPrizeNumber);
            index += 1;
        }
        return totalMatchCounts;
    }

    static int getTotalMatchCount(int[] ticket, int[] lastWeekLottoPrizeNumber) {
        int matchCount = 0;
        int index = 0;
        for(int number: ticket) {
            matchCount += returnOneOnMatch(number, lastWeekLottoPrizeNumber[index]);
            index += 1;
        }
        return matchCount;
    }

    private static int returnOneOnMatch(int number, int lottoNumber) {
        if(number == lottoNumber){
            return 1;
        }
        return 0;
    }

}
