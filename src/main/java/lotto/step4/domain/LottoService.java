package lotto.step4.domain;

import java.util.ArrayList;
import java.util.List;

public class LottoService {

    public static List<LottoTicket> generateTickets(Cash cash) {
        int ticketCounts = LottoService.getTicketCount(cash);

        List<LottoTicket> LottoTickets = new ArrayList<>();
        for(int i = 0; i < ticketCounts; i += 1){
            LottoTickets.add(new LottoTicket());
        }

        return LottoTickets;
    }

    private static int getTicketCount(Cash cash) {
        return cash.getCashAmount()/1000;
    }

}
