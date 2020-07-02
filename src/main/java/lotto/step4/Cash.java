package lotto.step4;

public class Cash {
    private final int cash;

    public Cash(int cash) {
        validate(cash);
        this.cash = cash;
    }

    private void validate(int cash) {
        if(cash<1000) {
            throw new IllegalArgumentException("1000원 이상 넣어 주세요");
        }
    }


}
