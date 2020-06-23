package lotto.step2;

import lotto.step2.domain.Lotto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LottoTest {

    private Lotto lotto;

    @BeforeEach
    void setUp() {
        lotto = new Lotto();
    }

    @Test
    public void getTicketAmountTest() {
        assertThat(lotto.getTicketAmount(100000)).isEqualTo(100);
    }

    @DisplayName("배열안에 같은 인덱스에 있는 요소의 일치 갯수")
    @Test
    public void getMatchCountTest() {
        assertThat(lotto.getMatchCount(new int[] {1,2,3}, new int[] {1,2,3})).isEqualTo(3);
        assertThat(lotto.getMatchCount(new int[] {1,4,3}, new int[] {1,2,3})).isEqualTo(2);
        assertThat(lotto.getMatchCount(new int[] {3,2,1}, new int[] {1,2,3})).isEqualTo(1);
    }

    @DisplayName("이중 배열들이 배열과의 일치하는 갯수들의 배열")
    @Test
    public void getMatchCountsTest() {
        assertThat(lotto.getMatchCounts(new int[] {1,2,3,4,5,6}, new int[][] {{1,2,3,4,5,6},{1,3,5,6,7,8}})).isEqualTo(new int[] {6,1});
        assertThat(lotto.getMatchCounts(new int[] {1,2,3,4,5,6}, new int[][] {{1,3,6,8,11,12},{1,2,3,4,77,88}})).isEqualTo(new int[] {1,4});
    }

    @DisplayName("형식에 맞게 로또 티켓들의 모든 통계")
    @Test
    public void getPrizeStatistics() {
        assertThat(lotto.getPrizeStatistics(new int[] {1,2,3,4,5,6}, new int[][] {{1,2,3,4,5,8}}, 3)).isEqualTo(new int[] {0,0,0,1,0});
    }

    @DisplayName("총 수입")
    @Test
    public void getTotalProfit() {
        assertThat(lotto.getTotalProfit(new int[] {1,2,3}, new int[] {1000,2000,3000})).isEqualTo(14000);
    }

    @DisplayName("수입률")
    @Test
    public void getProfitPercentage() {
        assertThat(lotto.getProfitPercentage(new int[] {1,2,3}, new int[] {1000,2000,3000}, 10000)).isEqualTo(1.4);
    }

    @DisplayName("이득 혹은 손해")
    @Test
    public void checkIfProfitedTest() {
        assertThat(lotto.checkIfProfited(100)).isEqualTo(true);
        assertThat(lotto.checkIfProfited(.99)).isEqualTo(false);
        assertThat(lotto.checkIfProfited(1)).isEqualTo(true);

    }
}
