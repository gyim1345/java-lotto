import lotto.step2.ui.inputView;

import java.util.List;

public class LottoGameApp {
    public static void main(String[] args) {
        Cash cash = new Cash(inputView.getCashAmount());
//        List<lottoTicket> lottoTicketsList = LottoTicketGenerator.generateTicket(cash);
        List<lottoTicket> lottoTickets = LottoService.generateTickets(cash);

        for(lottoTicket lottoNumber : lottoTickets) {
            System.out.println();
            for(lottoNumber number : lottoNumber.getLotto()) {
                System.out.print(number.getLottoNumber() + " ");
            }
        }


    }
}
