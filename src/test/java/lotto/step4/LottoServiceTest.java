package lotto.step4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class LottoServiceTest {
    private int[][] lottoTickets;
    private int [] lastWeekLottoPrizeNumber;
    @BeforeEach
    void setup() {
         lottoTickets = new int[][]{
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
        lastWeekLottoPrizeNumber = new int[]{1, 2, 3, 4, 5, 6};
    }


    @Test
    public void getProfitsTest() {
        LottoService lottoService = new LottoService();
        assertThat(lottoService.getProfits(lottoTickets, lastWeekLottoPrizeNumber)).isEqualTo(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        assertThat(lottoService.getProfits(new int[][] {{1,2,3,4,5,6}, {1,2,3,4,5,7}, {1,3,4,5,6,7}, {1,2,3,6,5,4}}, lastWeekLottoPrizeNumber)).isEqualTo(new int[] {30000000, 1500000, 0, 50000});
        assertThat(lottoService.getProfits(new int[][] {{1,12,13,19,15,16}, {1,2,3,4,15,17}, {1,3,4,5,6,7}, {1,2,3,6,5,4}}, lastWeekLottoPrizeNumber)).isEqualTo(new int[] {30000000, 1500000, 0, 50000});
    }

    @Test
    public void getTotalMatchCountsTest() {
        LottoService lottoService = new LottoService();
        assertThat(lottoService.getTotalMatchCounts(lottoTickets, lastWeekLottoPrizeNumber)).isEqualTo(new int[] {0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0});
        assertThat(lottoService.getTotalMatchCounts(new int[][] {{1,2,3,4,5,6}, {1,2,3,4,5,7}, {1,3,4,5,6,7}, {1,2,3,6,5,4}}, lastWeekLottoPrizeNumber)).isEqualTo(new int[] {6,5,1,4});
    }

    @Test
    public void getTotalMatchCountTest() {
        LottoService lottoService = new LottoService();
        assertThat(lottoService.getTotalMatchCount(new int[] {1,2,3,4,5,7}, lastWeekLottoPrizeNumber)).isEqualTo(5);
        assertThat(lottoService.getTotalMatchCount(new int[] {1,12,13,14,15,17}, lastWeekLottoPrizeNumber)).isEqualTo(1);
        assertThat(lottoService.getTotalMatchCount(new int[] {1,2,13,14,15,17}, lastWeekLottoPrizeNumber)).isEqualTo(2);
        assertThat(lottoService.getTotalMatchCount(new int[] {1,2,13,14,5,17}, lastWeekLottoPrizeNumber)).isEqualTo(3);
        assertThat(lottoService.getTotalMatchCount(new int[] {1,2,13,14,15,7}, lastWeekLottoPrizeNumber)).isEqualTo(2);
        assertThat(lottoService.getTotalMatchCount(new int[] {1,2,13,4,15,7}, lastWeekLottoPrizeNumber)).isEqualTo(3);
        assertThat(lottoService.getTotalMatchCount(new int[] {1,2,3,4,15,7}, lastWeekLottoPrizeNumber)).isEqualTo(4);
        assertThat(lottoService.getTotalMatchCount(new int[] {1,2,3,4,5,6}, lastWeekLottoPrizeNumber)).isEqualTo(6);
    }

}
