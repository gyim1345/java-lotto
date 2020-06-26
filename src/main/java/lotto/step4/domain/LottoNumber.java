package lotto.step4.domain;

public class LottoNumber {
    public static final int MAX_VALUE = 45;
    public static final int MIN_VALUE = 1;

    private final int value;

    public LottoNumber(int value)
    {
        validation(value);
        this.value = value;
    }

    public int getLottoNumber() {
        return this.value;
    }

    private void validation(int value) {
        if(value <MIN_VALUE || value>MAX_VALUE) {
            throw new IllegalArgumentException("lotto number exception must be greater than 0 and less than 46");
        }
    }
}
