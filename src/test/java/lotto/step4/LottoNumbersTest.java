package lotto.step4;

import lotto.step4.domain.LottoNumbers;
import lotto.step4.domain.LottoNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LottoNumbersTest {
    private LottoNumbers lottoNumbers;

    @Test
    public void getLottoNumberTest() {
        lottoNumbers = new LottoNumbers();
        LottoNumber a = lottoNumbers.getLottoNumber(22);
        int number = a.getLottoNumber();
        assertTrue(number> 0 && number <46);

        LottoNumber a1 = lottoNumbers.getLottoNumber(1);
        int number1 = a1.getLottoNumber();
        assertTrue(number1> 0 && number1 <46);
    }



}
