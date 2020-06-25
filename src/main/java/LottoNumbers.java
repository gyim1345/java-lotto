import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoNumbers {

    //    private final int lottoNumber;
    private final List<lottoNumber> lottoNumbers;
    private final int LOTTO_NUMBER_MIN = 1;
    private final int LOTTO_NUMBER_MAX = 45;


    public LottoNumbers() {
//        validateLottoNumber(lottoNumber);
        this.lottoNumbers = generateLottoNumbers();
        shuffle(this.lottoNumbers);
//        this.lottoNumber = lottoNumber;
    }

    private List<lottoNumber> generateLottoNumbers() {
        List<lottoNumber> lottoNumbers = new ArrayList<>();
        for(int i = LOTTO_NUMBER_MIN; i<= LOTTO_NUMBER_MAX; i ++) {
            lottoNumbers.add(new lottoNumber(i));
        }
        return lottoNumbers;
    }

    private void shuffle(List<lottoNumber> lottoNumbers) {
        Collections.shuffle(lottoNumbers);
    }


    public lottoNumber getLottoNumber(int i) {
        return lottoNumbers.get(i);
    }

    public void validateLottoNumber(int lottoNumber) {
        if(lottoNumber <1 || lottoNumber>45) {
            throw new IllegalArgumentException("lotto number exception");
        }
    }


}
