package lotto.step4.domain;

import java.util.List;

public class Extractor {

    public static int[][] extractToArray(List<LottoTicket> LottoTickets) {
        int[][] extractedArray = new int [LottoTickets.size()][6];
        int index = 0;
        for(LottoTicket lottoNumber : LottoTickets) {
            int index1 = 0;
            for(LottoNumber number : lottoNumber.getLotto()) {
                extractedArray[index][index1] = number.getLottoNumber();
                index1 += 1;
            }
            index += 1;
        }
        return extractedArray;
    }
}
