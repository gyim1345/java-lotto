package lotto.step4.domain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class LottoTicket {
    private final int LOTTO_NUMBERS_SIZE = 6;
    private final List<LottoNumber> LottoNumbers;

    public LottoTicket() {
        List<LottoNumber> LottoNumbers = generateLottoNumbers();
        validateLottoTicket(LottoNumbers);
        sortLottoTicketNumbers(LottoNumbers);
        this.LottoNumbers = LottoNumbers;
    }

    private List<LottoNumber> generateLottoNumbers() {
        List<LottoNumber> lottoTicketNumbers = new ArrayList<>();

        LottoNumbers lottoNumbers = new LottoNumbers();

        for(int i = 0; i < LOTTO_NUMBERS_SIZE; i+= 1) {
            lottoTicketNumbers.add(lottoNumbers.getLottoNumber(i));
        }
        return lottoTicketNumbers;
    }


    public List<LottoNumber> getLotto() {
        return LottoNumbers;
    }

    private void validateLottoTicket(List<LottoNumber> lottoTicket) {
        if (lottoTicket.size() != 6) {
            throw new IllegalArgumentException("lotto 크기 안맞음");
        }
    }

    private void sortLottoTicketNumbers(List<LottoNumber> LottoNumbers) {
        LottoNumbers.sort(Comparator.comparing(LottoNumber::getLottoNumber));
    }

}
