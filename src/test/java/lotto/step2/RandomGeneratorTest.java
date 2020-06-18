package lotto.step2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RandomGeneratorTest {

    private RandomGenerator randomGenerator;

    @BeforeEach
    void setUp() {
        randomGenerator = new RandomGenerator();
    }

    @Test
    public void getTicketAmountTest() {
        assertThat(randomGenerator.generateRandomNumberOfArraysOfArray(4,6,45).length).isEqualTo(4);
        assertThat(randomGenerator.generateRandomNumberOfArraysOfArray(4,6,45)[0].length).isEqualTo(6);

    }

    @Test
    public void getTicketsTest() {
        assertThat((randomGenerator.generateSortedRandomNumbersOfArray(4,45)).length).isEqualTo(4);
        assertThat((randomGenerator.generateSortedRandomNumbersOfArray(3,45)).length).isEqualTo(3);
        assertTrue((randomGenerator.generateSortedRandomNumbersOfArray(3,45))[0]<=45);
    }
}
