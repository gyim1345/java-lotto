package lotto.step4;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    @Test
    public void rateOfReturnTest() {
        Calculator calculator = new Calculator();
        assertThat(calculator.rateOfReturn(10000, 14000)).isEqualTo("0.71");
        assertThat(calculator.rateOfReturn(14000, 14000)).isEqualTo("1");
        assertThat(calculator.rateOfReturn(5000, 14000)).isEqualTo("0.35");
        assertThat(calculator.rateOfReturn(500000, 5000)).isEqualTo("100");
        assertThat(calculator.rateOfReturn(0,100000)).isEqualTo("0");
    }

    @Test
    public void TotalProfitTest() {
        Calculator calculator = new Calculator();
        assertThat(calculator.totalProfit(new int [] {1000,10000,100000,1000000})).isEqualTo(1111000);
        assertThat(calculator.totalProfit(new int [] {2000,20000,200000,2000000})).isEqualTo(2222000);
        assertThat(calculator.totalProfit(new int [] {0,0,0,0})).isEqualTo(0);
    }
}
