package lotto.step4;

import java.util.Arrays;

public class LottoGameApp {
    public static void main(String[] args) {
        DTO dto = new DTO();

        System.out.println();
        System.out.println("구입금액을 입력해 주세요.");

        Cash cash = new Cash(InputView.getCashAmount());
        dto.setCash(cash);

        LottoTickets lottoTickets = new LottoTickets(LottoService.buyTickets(cash));

        dto.setLottoTickets(lottoTickets);

        for(int[] array : dto.getLottoTickets()) {
            System.out.println(Arrays.toString(array));
        }

        int [] lastWeekLottoPrizeNumber = {1,2,3,4,5,6};
        int[] profits = LottoService.getProfits(dto.getLottoTickets(), lastWeekLottoPrizeNumber);
        int[] matchedProfits = LottoService.getMatchingProfits(profits);
        dto.setMatchingProfits(matchedProfits);


        System.out.println();
        System.out.println("지난 주 당첨 번호를 입력해 주세요.");
        System.out.println(Arrays.toString(lastWeekLottoPrizeNumber));
        System.out.println();
        System.out.println("당첨 통계");
        System.out.println("---------");


        for(int i = 0; i < 4; i += 1) {
            System.out.println(i+3 + "개 일치 (" + dto.getReward(i+3) + "원)- " + dto.getMatchingProfit(i)+ "개");
        }

        String a = Calculator.rateOfReturn(Calculator.getTotalProfit(profits), dto.getCash());

        System.out.println("총 수익률은 " + a + "입니다.(기준이 1이기 때문에 결과적으로 손해라는 의미임)");
    }
}
