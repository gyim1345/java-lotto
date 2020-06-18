package lotto.step2;

import lotto.step2.domain.Lotto;
import lotto.step2.ui.inputView;
import lotto.step2.ui.resultView;


public class LottoProcess {
    public static void main(String[] args) {
        int cashAmount = inputView.getCashAmount();
        int ticketAmount = Lotto.getTicketAmount(cashAmount);
        resultView.amountOfTicketsBought(ticketAmount);
        int[][] randomLotteryTickets = RandomGenerator.generateRandomNumberOfArraysOfArray(ticketAmount,6,45);
        resultView.showTickets(randomLotteryTickets);
        String lastWeekLotteryPrizeNumberString = inputView.getLotteryNumber();
        int[] lotteryNumbers = Extractor.extractNumberFromString(lastWeekLotteryPrizeNumberString);
        int[] prizeStatistics = Lotto.getPrizeStatistics(lotteryNumbers, randomLotteryTickets);
        int[] totalPrizes = new int[] {5000, 50000, 1500000, 2000000000};
        resultView.showStatistics(prizeStatistics, totalPrizes);
        double profitPercentage = Lotto.getProfitPercentage(prizeStatistics, totalPrizes, cashAmount);
        boolean profited = Lotto.checkIfProfited(profitPercentage);
    }
}
