package lotto.step4.domain;

public class lottoNumber {
    public static final int MAX_VALUE = 45;
    public static final int MIN_VALUE = 1;

    private final int value;

    public lottoNumber(int value)
    {
        validation(value);
        this.value = value;
    }

    public int getLottoNumber() {
        return this.value;
    }

    private void validation(int value) {
        if(value <1 || value>45) {
            throw new IllegalArgumentException("lotto number exception");
        }
    }
}
