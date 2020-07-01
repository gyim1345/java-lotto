package lotto.step4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.Assert.assertThat;

public class CashTest {

    @DisplayName("Cash 최소치(1000) 만족 안할시 에러 발생 확인")
    @Test
    public void CashTest() {
        assertThatThrownBy(() -> {
            new Cash(100);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("1000원 이상 넣어 주세요");;

    }

}
