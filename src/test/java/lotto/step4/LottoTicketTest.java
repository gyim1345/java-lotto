package lotto.step4;

import lotto.step4.domain.LottoNumber;
import lotto.step4.domain.LottoTicket;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LottoTicketTest {
    private LottoTicket lottoTicket;

    @Test
    public void lottoTicketSizeTest() {
        lottoTicket = new LottoTicket();
        assertTrue(lottoTicket.getLotto().size() == 6);
    }

    @Test
    public void lottoTicketInstanceOfTest() {
        lottoTicket = new LottoTicket();
        assertThat(lottoTicket.getLotto().get(1).getClass()).isEqualTo(LottoNumber.class);
    }


}
