package lotto.step4;

import lotto.step4.domain.Cash;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CashTest {
    private Cash cash;

    @DisplayName("Cash 정상 작동 확인")
    @Test
    public void getCashAmountTest() {
        cash = new Cash(10000);
        assertThat(cash.getCashAmount()).isEqualTo(10000);
    }

    @DisplayName("Cash 최소치(1000) 만족 안할시 에러 발생 확인")
    @Test
    public void cashTest() {
        assertThatThrownBy(() -> {
            cash = new Cash(100);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("1000원 이상 넣어 주세요");
    }
}
