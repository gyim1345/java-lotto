package lotto.step4;

import lotto.step4.ui.inputView;
import lotto.step4.domain.Cash;
import lotto.step4.domain.LottoService;
import lotto.step4.domain.lottoTicket;

import java.util.List;

public class LottoGameApp {
    public static void main(String[] args) {
        Cash cash = new Cash(inputView.getCashAmount());
//        List<lotto.step4.domain.lottoTicket> lottoTicketsList = LottoTicketGenerator.generateTicket(cash);
        List<lottoTicket> lottoTickets = LottoService.generateTickets(cash);

        for(lottoTicket lottoNumber : lottoTickets) {
            System.out.println();
            for(lotto.step4.domain.lottoNumber number : lottoNumber.getLotto()) {
                System.out.print(number.getLottoNumber() + " ");
            }
        }




    }
}
