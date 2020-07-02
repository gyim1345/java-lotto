package lotto.step4;

import java.util.Arrays;

public class LottoGameApp {
    public static void main(String[] args) {
        Cash cash = new Cash(InputView.getCashAmount());

        System.out.println();
        System.out.println("구입금액을 입력해 주세요.");
        System.out.println("14000");
        int [][] lottoTickets = {
            {8, 21, 23, 41, 42, 43},
            {3, 5, 11, 16, 32, 38},
            {7, 11, 16, 35, 36, 44},
            {1, 8, 11, 31, 41, 42},
            {13, 14, 16, 38, 42, 45},
            {7, 11, 30, 40, 42, 43},
            {2, 13, 22, 32, 38, 45},
            {23, 25, 33, 36, 39, 41},
            {1, 3, 5, 14, 22, 45},
            {5, 9, 38, 41, 43, 44},
            {2, 8, 9, 18, 19, 21},
            {13, 14, 18, 21, 23, 35},
            {17, 21, 29, 37, 42, 45},
            {3, 8, 27, 30, 35, 44}};


        for(int[] array : lottoTickets) {
            System.out.println(Arrays.toString(array));
        }

        System.out.println();
        System.out.println("지난 주 당첨 번호를 입력해 주세요.");
        System.out.println("1, 2, 3, 4, 5, 6");
        System.out.println();
        System.out.println("당첨 통계");
        System.out.println("---------");
        System.out.println("3개 일치 (5000원)- 1개");
        System.out.println("4개 일치 (50000원)- 0개");
        System.out.println("5개 일치 (1500000원)- 0개");
        System.out.println("6개 일치 (2000000000원)- 0개");
        String a = Calculator.rateOfReturn(5000,cash.getCash());

        System.out.println("총 수익률은 " + a + "입니다.(기준이 1이기 때문에 결과적으로 손해라는 의미임)");
    }
}
