package lotto.step4;

import lotto.step4.domain.LottoNumber;
import lotto.step4.domain.LottoTicket;

import java.util.ArrayList;
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

    public static List<List<Integer>> extractToList(List<LottoTicket> LottoTickets) {
        List<List<Integer>> extractedList = new ArrayList<>();
        for(LottoTicket lottoNumber : LottoTickets) {
            List<Integer> innerList = new ArrayList<>();
            for(LottoNumber number : lottoNumber.getLotto()) {
                innerList.add(number.getLottoNumber());
            }
            extractedList.add(innerList);
        }
        return extractedList;
    }
}
