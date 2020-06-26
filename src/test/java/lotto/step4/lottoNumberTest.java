package lotto.step4;

import lotto.step4.domain.LottoNumber;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class lottoNumberTest {
    private LottoNumber lottoNumber;

    @Test
    public void getLottoNumberTest() {
        lottoNumber = new LottoNumber(1);
        assertThat(lottoNumber.getLottoNumber()).isEqualTo(1);

        lottoNumber = new LottoNumber(2);
        assertThat(lottoNumber.getLottoNumber()).isEqualTo(2);

    }
    @Test
    public void lottoNumberValidationTest() {
        assertThatThrownBy(() -> {
            lottoNumber = new LottoNumber(0);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("lotto number exception must be greater than 0 and less than 46");

        assertThatThrownBy(() -> {
            lottoNumber = new LottoNumber(46);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("lotto number exception must be greater than 0 and less than 46");
    }

}
