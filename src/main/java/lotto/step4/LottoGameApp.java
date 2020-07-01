package lotto.step4;

import lotto.step4.ui.inputView;
import lotto.step4.ui.resultView;
import lotto.step4.domain.Cash;
import lotto.step4.domain.LottoService;
import lotto.step4.domain.LottoTicket;

import java.util.List;

public class LottoGameApp {
    public static void main(String[] args) {
        Cash cash = new Cash(inputView.getCashAmount());
        List<LottoTicket> LottoTickets = LottoService.generateTickets(cash);
        LottoTicketsDTO lottoTicketsDTO = new LottoTicketsDTO(LottoTickets);
        resultView.showTicketsFromDTO(lottoTicketsDTO);

        String lottoInput = inputView.getLastWeekLottoNumber();
        int[] lottoNumbers = Extractor.extractNumberFromString(lottoInput);
    }
}
