package lotto.step4;

import lotto.step4.domain.Cash;
import lotto.step4.domain.LottoService;
import lotto.step4.domain.LottoTicket;
import lotto.step4.ui.inputView;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LottoServiceTest {
    private LottoService lottoService;

    @Test()
    public void generateTicketsSizeTest() {
        Cash cash = new Cash(10000);
        lottoService = new LottoService();
        assertThat(lottoService.generateTickets(cash).size()).isEqualTo(10);
    }

    @Test()
    public void generateTicketsInstanceTest() {
        Cash cash = new Cash(10000);
        lottoService = new LottoService();
        assertThat(lottoService.generateTickets(cash).get(0).getClass()).isEqualTo(LottoTicket.class);
    }

}
