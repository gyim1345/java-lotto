package lotto.step2;

public class LottoProcess {
    public static void main(String[] args) {
        int cashAmount = inputView.getCashAmount();
        int ticketAmount = Lotto.getTicketAmount(cashAmount);
        resultView.amountOfTicketsBought(ticketAmount);
    }
}
