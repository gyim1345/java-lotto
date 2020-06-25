import java.util.ArrayList;
import java.util.List;

public class LottoService {

    public static List<lottoTicket> generateTickets(Cash cash) {
        int ticketCounts = LottoService.getTicketCount(cash);


        List<lottoTicket> lottoTickets = new ArrayList<>();
        for(int i = 0; i < ticketCounts; i += 1){
            lottoTickets.add(new lottoTicket());
        }


        return lottoTickets;
    }

    private static int getTicketCount(Cash cash) {
        return cash.getCashAmount()/1000;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
