package lotto.step2;

import java.util.stream.Stream;

public class Extractor {
    public static int[] extractNumberFromString(String letters) {
        return Stream.of(letters.replace(", ", ",").split(",")).mapToInt(x-> Integer.parseInt(x)).toArray();
    }
}
