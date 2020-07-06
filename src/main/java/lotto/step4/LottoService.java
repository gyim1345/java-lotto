package lotto.step4;

public class LottoService {

    public static int[] getProfits(int[][] lottoTickets, int[] lastWeekLottoPrizeNumber) {
        int[] rewards = {0, 0, 0, 5000, 50000, 1500000, 2000000000};
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

    public static int[] getMatchingProfits(int[] profits) {
        int [] matchingProfit = new int[4];
        for(int i =0; i < profits.length; i += 1) {
            if(profits[i] == 5000) {
                matchingProfit[0] += 1;
            }
            if(profits[i] == 50000) {
                matchingProfit[1] += 1;
            }
            if(profits[i] == 1500000) {
                matchingProfit[2] += 1;
            }
            if(profits[i] == 2000000000) {
                matchingProfit[3] += 1;
            }
        }
        return matchingProfit;
    }

    public static int buyTickets(Cash cash) {
        return cash.getCash()/1000;
    }
}
