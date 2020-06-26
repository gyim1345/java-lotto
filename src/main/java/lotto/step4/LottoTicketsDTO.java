package lotto.step4;

import lotto.step4.domain.LottoTicket;

import java.util.Collections;
import java.util.List;

public class LottoTicketsDTO {
    private List<List<Integer>> LottoTicket;

    public LottoTicketsDTO (List<LottoTicket> LottoTickets) {
        this.LottoTicket = Extractor.extractToList(LottoTickets);
    }

    public List<List<Integer>> getLottoTickets() {
        return this.LottoTicket;
    }

    public void setLottoTicket(List<List<Integer>> lottoTickets) {
        this.LottoTicket = lottoTickets;
    }

    public List<Integer> getLottoTicket(int i) {
        return LottoTicket.get(i);
    }

    public void setLottoTicket(int i, List<Integer> LottoTicket) {
        this.LottoTicket.set(i, LottoTicket);
    }

    public int getLottoNumber(int i, int j) {
        return LottoTicket.get(i).get(j);
    }

    public void setLottoNumber(int i, int j, int number) {
        this.LottoTicket.get(i).set(j, number);
    }
}
