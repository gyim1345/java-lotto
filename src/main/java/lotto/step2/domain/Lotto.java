package lotto.step2.domain;

import java.util.Arrays;

public class Lotto {

    public static int getTicketAmount(int cashAmount) {
        return cashAmount/1000;
    }

    public static int[] getPrizeList() {
        int index = 0;
        int[] prizeList = new int[5];
        for(PrizeList prize : PrizeList.values()){
            setWinningMoneyIfIndexMatchesCount(index, prizeList, prize);
            index += 1;
        }

        return prizeList;
    }

    private static void setWinningMoneyIfIndexMatchesCount(int index, int[] prizeList, PrizeList prize) {
        if(prize.ordinal() == index && prize.getCountOfMatch() != 0) {
            prizeList[index] = prize.getWinningMoney();
        }
    }

    public static int[] getPrizeStatistics(int[] prizeNumbers, int[][] randomLotteryTickets, int bonusBall) {
        int[] matchCounts = getMatchCounts(prizeNumbers, randomLotteryTickets);
        int[] statistics = new int[5];

        for(int i = 0; i< matchCounts.length; i++) {
          matchCounts[i] += addBonusCount(matchCounts[i], bonusBall, randomLotteryTickets[i]);
        }

        for(int i = 0; i< matchCounts.length; i++) {
            addMatchedlottoryStatistics(matchCounts, statistics, i);
        }

        return statistics;
    }

    private static int addBonusCount(int matchCounts, int bonusBall, int[] randomLotteryTickets) {
        if(matchCounts == 5 && Arrays.stream(randomLotteryTickets).anyMatch(number -> number == bonusBall)){
            return 2;
        }
        return 0;
    }

    
    private static void addMatchedlottoryStatistics(int[] matchCounts, int[] statistics, int i) {
        statistics[0] = ifMatched(matchCounts, statistics[0], i, 3);
        statistics[1] = ifMatched(matchCounts, statistics[1], i, 4);
        statistics[2] = ifMatched(matchCounts, statistics[2], i, 5);
        statistics[3] = ifMatched(matchCounts, statistics[3], i, 7);
        statistics[4] = ifMatched(matchCounts, statistics[4], i, 6);

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
            count = ifMatched(array1, count, i, array2[i]);
        }
        return count;
    }

    private static int ifMatched(int[] array1, int count, int i, int i2) {
        if (array1[i] == i2) {
            count += 1;
        }
        return count;
    }

    public static double getProfitPercentage(int[] prizeStatistics, int[] totalPrizes, int cashAmount) {
        int totalSumOfPrize = getTotalProfit(prizeStatistics, totalPrizes);
        return (double) totalSumOfPrize/cashAmount;
    }

    public static int getTotalProfit(int[] prizeStatistics, int[] totalPrizes) {
        int totalProfit = 0;
        for(int i =0; i< prizeStatistics.length; i++) {
            totalProfit += prizeStatistics[i] * totalPrizes[i];
        }
        return totalProfit;
    }

    public static boolean checkIfProfited(double profitPercentage) {
        if(profitPercentage>=1) {
            return true;
        }
        return false;
    }










}
