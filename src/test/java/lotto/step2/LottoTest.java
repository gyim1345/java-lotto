package lotto.step2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.InstanceOfAssertFactories.PATH;

public class LottoTest {

    private Lotto lotto;

    @BeforeEach
    void setUp() {
        lotto = new Lotto();
    }

    @Test
    public void getTicketAmountTest() {
        assertThat(lotto.getTicketAmount(100000)).isEqualTo(100);
    }

    @Test
    public void getTicketsTest() {
        assertThat((lotto.getTickets(4)).length).isEqualTo(1);
    }
}
