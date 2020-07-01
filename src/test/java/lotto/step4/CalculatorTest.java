package lotto.step4;

import org.junit.Test;

import static org.junit.Assert.assertThat;

public class CalculatorTest {

    @Test
    public void rateOfReturnTest() {
        Calculator calculator = new Calculator();
        assertThat(calculator.rateOfReturnTest(new int[] {10000, 100000, 1000, 0,0,})).isEqualTo(222);
    }
}
