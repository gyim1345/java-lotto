import lotto.step2.ui.inputView;

import java.util.List;

public class LottoGameApp {
    public static void main(String[] args) {
        Cash cash = new Cash(inputView.getCashAmount());
        List<lottoTickets> lottoTicketsList = LottoTicketGenerator.generateTicket(cash);

    }
}
