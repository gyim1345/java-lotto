package lotto.step4.ui;

import java.util.Arrays;

public class resultView {
    public static void showTickets(int[][] lottoArray) {
        for(int i = 0; i < lottoArray.length; i ++) {
            System.out.println(Arrays.toString(lottoArray[i]));
        }
    }
}
