package lotto.step2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

public class ExtractorTest {
    private static Extractor extractor;


    @BeforeEach
    void setUp(){
        extractor = new Extractor();
    }

    @DisplayName("문자열에서 숫자를담은 배열 추출")
    @Test
    public void extractNumberFromString() {
        assertThat(extractor.extractNumberFromString("1, 2, 3, 4, 5")).isEqualTo(new int[] {1,2,3,4,5});
        assertThat(extractor.extractNumberFromString("1,2, 3, 4, 5")).isEqualTo(new int[] {1,2,3,4,5});
    }



}
