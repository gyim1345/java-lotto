package lotto.step4.domain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class lottoTicket{
    private final int LOTTO_NUMBERS_SIZE = 6;
    private final List<lottoNumber> lottoNumbers ;


//    public lotto.step4.domain.lottoTicket(List<LottoNumber> lottoNumbers) {
//        validatelottoTicket(lottoNumbers);
//        this.lottoNumbers = lottoNumbers;
//    }

    public lottoTicket() {
        List<lottoNumber> lottoNumbers = generateLottoNumbers();
        validateLottoTicket(lottoNumbers);
        sortLottoTicketNumbers(lottoNumbers);
        this.lottoNumbers = lottoNumbers;
    }


    private List<lottoNumber> generateLottoNumbers() {
        List<lottoNumber> lottoTicketNumbers = new ArrayList<>();

        LottoNumbers lottoNumbers = new LottoNumbers();

        for(int i = 0; i < LOTTO_NUMBERS_SIZE; i+= 1) {
            lottoTicketNumbers.add(lottoNumbers.getLottoNumber(i));
        }
        return lottoTicketNumbers;
    }


    public List<lottoNumber> getLotto() {
        return lottoNumbers;
    }

    private void validateLottoTicket(List<lottoNumber> lottoTicket) {
        if (lottoTicket.size() != 6) {
            throw new IllegalArgumentException("lotto 크기 안맞음");
        }
    }

    private void sortLottoTicketNumbers(List<lottoNumber> lottoNumbers) {
        lottoNumbers.sort(Comparator.comparing(lottoNumber::getLottoNumber));
    }

}
