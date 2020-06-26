package lotto.step4.ui;

import lotto.step4.LottoTicketsDTO;

import java.util.Arrays;
import java.util.List;

public class resultView {
    public static void showTickets(int[][] lottoArray) {
        for(int i = 0; i < lottoArray.length; i ++) {
            System.out.println(Arrays.toString(lottoArray[i]));
        }
    }

    public static void showTicketsFromDTO(LottoTicketsDTO lottoTicketsDTO) {
        for(List<Integer> lottoTicket : lottoTicketsDTO.getLottoTickets()) {
            System.out.println(lottoTicket);
        }
    }
}
