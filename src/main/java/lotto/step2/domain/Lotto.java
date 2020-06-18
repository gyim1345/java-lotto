package lotto.step2.domain;

import java.util.stream.Stream;

public class Lotto {

    public static int getTicketAmount(int cashAmount) {
        return cashAmount/1000;
    }

    public static int[][] getTickets(int ticketAmount) {
        return new int[][] {{1}};
    }

    public static int[] getPrizeStatistics(int[] prizeNumbers, int[][] randomLotteryTickets) {
        int[] matchCounts = getMatchCounts(prizeNumbers, randomLotteryTickets);
        int[] statistics = new int[4];

        for(int i = 0; i< matchCounts.length; i++) {
            addMatchedlottoryStatistics(matchCounts, statistics, i);
        }

        return statistics;
    }

    private static void addMatchedlottoryStatistics(int[] matchCounts, int[] statistics, int i) {
        if(matchCounts[i] == 3) {
            statistics[0] += 1;
        }
        if(matchCounts[i] == 4) {
            statistics[1] += 1;
        }
        if(matchCounts[i] == 5) {
            statistics[2] += 1;
        }
        if(matchCounts[i] == 6) {
            statistics[3] += 1;
        }
    }

    public static int[] getMatchCounts(int[] prizeNumbers, int[][] randomLotteryTickets) {
        int[] matchCounts = new int[randomLotteryTickets.length];
        int index = 0;
        for(int[] tickets: randomLotteryTickets) {
            int matchCount = getMatchCount(prizeNumbers, tickets);
            matchCounts[index] = matchCount;
            index += 1;
        }
        return matchCounts;
    }

    public static int getMatchCount(int[] array1, int[] array2) {
        int count = 0;
        for(int i = 0; i<array1.length; i ++) {
            if(array1[i] == array2[i]) {
                count += 1;
            }
        }
        return count;
    }

}
