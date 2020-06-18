package lotto.step2;

import lotto.step2.domain.Lotto;
import lotto.step2.ui.inputView;
import lotto.step2.ui.resultView;

public class LottoProcess {
    public static void main(String[] args) {
        int cashAmount = inputView.getCashAmount();
        int ticketAmount = Lotto.getTicketAmount(cashAmount);
        resultView.amountOfTicketsBought(ticketAmount);
        int[][] randomNumbersOfArray = RandomGenerator.generateRandomNumberOfArraysOfArray(ticketAmount,6,45);
        resultView.showTickets(randomNumbersOfArray);
        String lastWeekLotteryPrizeNumber = inputView.getLotteryNumber();

    }
}
