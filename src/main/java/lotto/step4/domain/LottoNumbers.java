package lotto.step4.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoNumbers {

    private final List<LottoNumber> LottoNumbers;
    private final int LOTTO_NUMBER_MIN = 1;
    private final int LOTTO_NUMBER_MAX = 45;


    public LottoNumbers() {
        this.LottoNumbers = generateLottoNumbers();
        validateLottoNumbers(LottoNumbers);
        shuffle(this.LottoNumbers);
    }

    private List<LottoNumber> generateLottoNumbers() {
        List<LottoNumber> LottoNumbers = new ArrayList<>();
        for(int i = LOTTO_NUMBER_MIN; i<= LOTTO_NUMBER_MAX; i ++) {
            LottoNumbers.add(new LottoNumber(i));
        }
        return LottoNumbers;
    }

    private void shuffle(List<LottoNumber> LottoNumbers) {
        Collections.shuffle(LottoNumbers);
    }


    public LottoNumber getLottoNumber(int i) {
        return LottoNumbers.get(i);
    }

    private void validateLottoNumbers(List<LottoNumber> LottoNumbers) {
        if(LottoNumbers.size() == LOTTO_NUMBER_MAX + 1) {
            throw new IllegalArgumentException("lotto number size must be 46");
        }
    }


}
