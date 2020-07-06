package lotto.step4;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class LottoTicketsTest {
    @Test
    public void LottoTicketTest() {
        LottoTickets lottoTickets = new LottoTickets(5);
        assertThat(lottoTickets.getLottoTickets().length).isEqualTo(5);
    }

    @Test
    public void LottoTicketTest2() {
        assertThatThrownBy(() -> {
            new LottoTickets(5, new int [][] {{1,2,3,4,5,6,7}});
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("lotto ticket size must be 6");
    }

    @Test
    public void LottoTicketTest3() {
        assertThatThrownBy(() -> {
            new LottoTickets(5, new int [][] {{0,2,3,4,5,6,7}});
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("lotto ticket size must be 6");
    }

}
