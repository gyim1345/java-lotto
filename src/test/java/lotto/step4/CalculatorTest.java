package lotto.step4;

import org.junit.jupiter.api.Test;

//import static org.junit.Assert.assertThat;
import static org.assertj.core.api.Assertions.assertThat;
public class CalculatorTest {

    @Test
    public void rateOfReturnTest() {
        Calculator calculator = new Calculator();
        assertThat(calculator.rateOfReturnTest(10000, 14000)).isEqualTo("0.71");
        assertThat(calculator.rateOfReturnTest(14000, 14000)).isEqualTo("1");
    }
}
